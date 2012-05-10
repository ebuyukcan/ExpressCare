
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object addBabysitter extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Add babysitter profile")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
    
	<h1>Add a babysitter profile</h1>

"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(action = routes.Application.addBabysitter())/*7.58*/ {_display_(Seq[Any](format.raw/*7.60*/("""
    <label for="firstName">Name</label>
	<input type="text" id="fistName" name="firstName" />
	<label for="lastName">Surname</label>
	<input type="text" id="lastName" name="lastName" />
	<label for="description">Description</label>
	<input type="text" id="description" name="description" />
	
	<input type="submit" name="submit" value="Add"/>
""")))})),format.raw/*16.2*/("""	
    
""")))})),format.raw/*18.2*/("""


    

"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:39:52 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/addBabysitter.scala.html
                    HASH: 5e09e3837560cfaf5d84a22101cef41e45451459
                    MATRIX: 763->1|857->18|894->21|932->51|971->53|1048->96|1061->102|1119->152|1158->154|1534->499|1573->507
                    LINES: 27->1|30->1|32->3|32->3|32->3|36->7|36->7|36->7|36->7|45->16|47->18
                    -- GENERATED --
                */
            