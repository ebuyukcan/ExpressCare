// @SOURCE:/Users/elifb/Documents/XpressCare/server/conf/routes
// @HASH:6a042ed34fce425094bc1bd784caaebd4583e45d
// @DATE:Mon May 07 11:25:24 EEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_getSitter0 = Route("GET", PathPattern(List(StaticPart("/xpresscare/1.0/sitter"))))
                    

// @LINE:7
val controllers_Application_requestSitter1 = Route("POST", PathPattern(List(StaticPart("/xpresscare/1.0/sitter"))))
                    

// @LINE:10
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/xpresscare/1.0/sitter""","""controllers.Application.getSitter()"""),("""POST""","""/xpresscare/1.0/sitter""","""controllers.Application.requestSitter()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_getSitter0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.getSitter(), HandlerDef(this, "controllers.Application", "getSitter", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_requestSitter1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.requestSitter(), HandlerDef(this, "controllers.Application", "requestSitter", Nil))
   }
}
                    

// @LINE:10
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                