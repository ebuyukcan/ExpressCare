// @SOURCE:/Users/elifb/Documents/XpressCare/server/conf/routes
// @HASH:1451f4eaed96270a9f79823e599a9d767eee83d1
// @DATE:Thu May 10 09:08:51 EEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:17
def contactBabysitter(sitterId:String) = {
   Call("GET", "/contact" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("sitterId", sitterId)))))
}
                                                        
 
// @LINE:7
def indexMobile() = {
   Call("GET", "/mobile")
}
                                                        
 
// @LINE:12
def addNewBabysitter() = {
   Call("GET", "/addNewBabysitter")
}
                                                        
 
// @LINE:9
def getBabysitter(id:String) = {
   Call("GET", "/babysitter" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                        
 
// @LINE:15
def requestSitter(id:String = "") = {
   Call("GET", "/request" + queryString(List(if(id == "") None else Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                        
 
// @LINE:14
def listAvailableBabySitters(latitude:String = "0", longitude:String = "0", start:String = "", end:String = "") = {
   Call("GET", "/listBabySitters" + queryString(List(if(latitude == "0") None else Some(implicitly[QueryStringBindable[String]].unbind("latitude", latitude)), if(longitude == "0") None else Some(implicitly[QueryStringBindable[String]].unbind("longitude", longitude)), if(start == "") None else Some(implicitly[QueryStringBindable[String]].unbind("start", start)), if(end == "") None else Some(implicitly[QueryStringBindable[String]].unbind("end", end)))))
}
                                                        
 
// @LINE:16
def agreeSitter() = {
   Call("POST", "/agree")
}
                                                        
 
// @LINE:13
def addBabysitter() = {
   Call("POST", "/babysitter")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:18
def contactBabysitterMobile(sitterId:String) = {
   Call("GET", "/contactMobile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("sitterId", sitterId)))))
}
                                                        

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:17
def contactBabysitter = JavascriptReverseRoute(
   "controllers.Application.contactBabysitter",
   """
      function(sitterId) {
      return _wA({method:"GET", url:"/contact" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sitterId", sitterId)])})
      }
   """
)
                                                        
 
// @LINE:7
def indexMobile = JavascriptReverseRoute(
   "controllers.Application.indexMobile",
   """
      function() {
      return _wA({method:"GET", url:"/mobile"})
      }
   """
)
                                                        
 
// @LINE:12
def addNewBabysitter = JavascriptReverseRoute(
   "controllers.Application.addNewBabysitter",
   """
      function() {
      return _wA({method:"GET", url:"/addNewBabysitter"})
      }
   """
)
                                                        
 
// @LINE:9
def getBabysitter = JavascriptReverseRoute(
   "controllers.Application.getBabysitter",
   """
      function(id) {
      return _wA({method:"GET", url:"/babysitter" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                                                        
 
// @LINE:15
def requestSitter = JavascriptReverseRoute(
   "controllers.Application.requestSitter",
   """
      function(id) {
      return _wA({method:"GET", url:"/request" + _qS([(id == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id))])})
      }
   """
)
                                                        
 
// @LINE:14
def listAvailableBabySitters = JavascriptReverseRoute(
   "controllers.Application.listAvailableBabySitters",
   """
      function(latitude,longitude,start,end) {
      return _wA({method:"GET", url:"/listBabySitters" + _qS([(latitude == """ +  implicitly[JavascriptLitteral[String]].to("0") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("latitude", latitude)), (longitude == """ +  implicitly[JavascriptLitteral[String]].to("0") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("longitude", longitude)), (start == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("start", start)), (end == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("end", end))])})
      }
   """
)
                                                        
 
// @LINE:16
def agreeSitter = JavascriptReverseRoute(
   "controllers.Application.agreeSitter",
   """
      function() {
      return _wA({method:"POST", url:"/agree"})
      }
   """
)
                                                        
 
// @LINE:13
def addBabysitter = JavascriptReverseRoute(
   "controllers.Application.addBabysitter",
   """
      function() {
      return _wA({method:"POST", url:"/babysitter"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:18
def contactBabysitterMobile = JavascriptReverseRoute(
   "controllers.Application.contactBabysitterMobile",
   """
      function(sitterId) {
      return _wA({method:"GET", url:"/contactMobile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sitterId", sitterId)])})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:17
def contactBabysitter(sitterId:String) = new play.api.mvc.HandlerRef(
   controllers.Application.contactBabysitter(sitterId), HandlerDef(this, "controllers.Application", "contactBabysitter", Seq(classOf[String]))
)
                              
 
// @LINE:7
def indexMobile() = new play.api.mvc.HandlerRef(
   controllers.Application.indexMobile(), HandlerDef(this, "controllers.Application", "indexMobile", Seq())
)
                              
 
// @LINE:12
def addNewBabysitter() = new play.api.mvc.HandlerRef(
   controllers.Application.addNewBabysitter(), HandlerDef(this, "controllers.Application", "addNewBabysitter", Seq())
)
                              
 
// @LINE:9
def getBabysitter(id:String) = new play.api.mvc.HandlerRef(
   controllers.Application.getBabysitter(id), HandlerDef(this, "controllers.Application", "getBabysitter", Seq(classOf[String]))
)
                              
 
// @LINE:15
def requestSitter(id:String) = new play.api.mvc.HandlerRef(
   controllers.Application.requestSitter(id), HandlerDef(this, "controllers.Application", "requestSitter", Seq(classOf[String]))
)
                              
 
// @LINE:14
def listAvailableBabySitters(latitude:String, longitude:String, start:String, end:String) = new play.api.mvc.HandlerRef(
   controllers.Application.listAvailableBabySitters(latitude, longitude, start, end), HandlerDef(this, "controllers.Application", "listAvailableBabySitters", Seq(classOf[String], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:16
def agreeSitter() = new play.api.mvc.HandlerRef(
   controllers.Application.agreeSitter(), HandlerDef(this, "controllers.Application", "agreeSitter", Seq())
)
                              
 
// @LINE:13
def addBabysitter() = new play.api.mvc.HandlerRef(
   controllers.Application.addBabysitter(), HandlerDef(this, "controllers.Application", "addBabysitter", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:18
def contactBabysitterMobile(sitterId:String) = new play.api.mvc.HandlerRef(
   controllers.Application.contactBabysitterMobile(sitterId), HandlerDef(this, "controllers.Application", "contactBabysitterMobile", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                