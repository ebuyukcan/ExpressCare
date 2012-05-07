// @SOURCE:/Users/elifb/Documents/XpressCare/server/conf/routes
// @HASH:6a042ed34fce425094bc1bd784caaebd4583e45d
// @DATE:Mon May 07 11:25:24 EEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def getSitter() = {
   Call("GET", "/xpresscare/1.0/sitter")
}
                                                        
 
// @LINE:7
def requestSitter() = {
   Call("POST", "/xpresscare/1.0/sitter")
}
                                                        

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def getSitter = JavascriptReverseRoute(
   "controllers.Application.getSitter",
   """
      function() {
      return _wA({method:"GET", url:"/xpresscare/1.0/sitter"})
      }
   """
)
                                                        
 
// @LINE:7
def requestSitter = JavascriptReverseRoute(
   "controllers.Application.requestSitter",
   """
      function() {
      return _wA({method:"POST", url:"/xpresscare/1.0/sitter"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
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
                    


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def getSitter() = new play.api.mvc.HandlerRef(
   controllers.Application.getSitter(), HandlerDef(this, "controllers.Application", "getSitter", Seq())
)
                              
 
// @LINE:7
def requestSitter() = new play.api.mvc.HandlerRef(
   controllers.Application.requestSitter(), HandlerDef(this, "controllers.Application", "requestSitter", Seq())
)
                              

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                