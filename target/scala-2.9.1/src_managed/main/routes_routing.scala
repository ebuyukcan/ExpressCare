// @SOURCE:/Users/elifb/Documents/XpressCare/server/conf/routes
// @HASH:1451f4eaed96270a9f79823e599a9d767eee83d1
// @DATE:Thu May 10 09:08:51 EEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_indexMobile1 = Route("GET", PathPattern(List(StaticPart("/mobile"))))
                    

// @LINE:9
val controllers_Application_getBabysitter2 = Route("GET", PathPattern(List(StaticPart("/babysitter"))))
                    

// @LINE:12
val controllers_Application_addNewBabysitter3 = Route("GET", PathPattern(List(StaticPart("/addNewBabysitter"))))
                    

// @LINE:13
val controllers_Application_addBabysitter4 = Route("POST", PathPattern(List(StaticPart("/babysitter"))))
                    

// @LINE:14
val controllers_Application_listAvailableBabySitters5 = Route("GET", PathPattern(List(StaticPart("/listBabySitters"))))
                    

// @LINE:15
val controllers_Application_requestSitter6 = Route("GET", PathPattern(List(StaticPart("/request"))))
                    

// @LINE:16
val controllers_Application_agreeSitter7 = Route("POST", PathPattern(List(StaticPart("/agree"))))
                    

// @LINE:17
val controllers_Application_contactBabysitter8 = Route("GET", PathPattern(List(StaticPart("/contact"))))
                    

// @LINE:18
val controllers_Application_contactBabysitterMobile9 = Route("GET", PathPattern(List(StaticPart("/contactMobile"))))
                    

// @LINE:21
val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/mobile""","""controllers.Application.indexMobile()"""),("""GET""","""/babysitter""","""controllers.Application.getBabysitter(id:String)"""),("""GET""","""/addNewBabysitter""","""controllers.Application.addNewBabysitter()"""),("""POST""","""/babysitter""","""controllers.Application.addBabysitter()"""),("""GET""","""/listBabySitters""","""controllers.Application.listAvailableBabySitters(latitude:String ?= "0", longitude:String ?= "0", start:String ?= "", end:String ?= "")"""),("""GET""","""/request""","""controllers.Application.requestSitter(id:String ?= "")"""),("""POST""","""/agree""","""controllers.Application.agreeSitter()"""),("""GET""","""/contact""","""controllers.Application.contactBabysitter(sitterId:String)"""),("""GET""","""/contactMobile""","""controllers.Application.contactBabysitterMobile(sitterId:String)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_indexMobile1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.indexMobile(), HandlerDef(this, "controllers.Application", "indexMobile", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_getBabysitter2(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.getBabysitter(id), HandlerDef(this, "controllers.Application", "getBabysitter", Seq(classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Application_addNewBabysitter3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.addNewBabysitter(), HandlerDef(this, "controllers.Application", "addNewBabysitter", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_addBabysitter4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.addBabysitter(), HandlerDef(this, "controllers.Application", "addBabysitter", Nil))
   }
}
                    

// @LINE:14
case controllers_Application_listAvailableBabySitters5(params) => {
   call(params.fromQuery[String]("latitude", Some("0")), params.fromQuery[String]("longitude", Some("0")), params.fromQuery[String]("start", Some("")), params.fromQuery[String]("end", Some(""))) { (latitude, longitude, start, end) =>
        invokeHandler(_root_.controllers.Application.listAvailableBabySitters(latitude, longitude, start, end), HandlerDef(this, "controllers.Application", "listAvailableBabySitters", Seq(classOf[String], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:15
case controllers_Application_requestSitter6(params) => {
   call(params.fromQuery[String]("id", Some(""))) { (id) =>
        invokeHandler(_root_.controllers.Application.requestSitter(id), HandlerDef(this, "controllers.Application", "requestSitter", Seq(classOf[String])))
   }
}
                    

// @LINE:16
case controllers_Application_agreeSitter7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.agreeSitter(), HandlerDef(this, "controllers.Application", "agreeSitter", Nil))
   }
}
                    

// @LINE:17
case controllers_Application_contactBabysitter8(params) => {
   call(params.fromQuery[String]("sitterId", None)) { (sitterId) =>
        invokeHandler(_root_.controllers.Application.contactBabysitter(sitterId), HandlerDef(this, "controllers.Application", "contactBabysitter", Seq(classOf[String])))
   }
}
                    

// @LINE:18
case controllers_Application_contactBabysitterMobile9(params) => {
   call(params.fromQuery[String]("sitterId", None)) { (sitterId) =>
        invokeHandler(_root_.controllers.Application.contactBabysitterMobile(sitterId), HandlerDef(this, "controllers.Application", "contactBabysitterMobile", Seq(classOf[String])))
   }
}
                    

// @LINE:21
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                