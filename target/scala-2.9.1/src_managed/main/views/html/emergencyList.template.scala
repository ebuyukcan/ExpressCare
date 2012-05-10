
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
object emergencyList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[BabySitter],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitters: List[BabySitter]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main("List of babysitters")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
<!-- 	<h1></h1>

	"""),_display_(Seq[Any](/*7.3*/helper/*7.9*/.form(action = routes.Application.requestSitter())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
		"""),_display_(Seq[Any](/*8.4*/for(sitter <- babysitters) yield /*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
			<h1>"""),_display_(Seq[Any](/*9.9*/sitter/*9.15*/.firstName)),format.raw/*9.25*/(""" """),_display_(Seq[Any](/*9.27*/sitter/*9.33*/.lastName)),format.raw/*9.42*/("""</h1>
			
			<input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*11.51*/sitter/*11.57*/.id)),format.raw/*11.60*/("""" />
			
		""")))})),format.raw/*13.4*/("""
		
		<input type="submit" name="submit" value="Request"/>
	
	""")))})),format.raw/*17.3*/(""" -->
    
""")))})),format.raw/*19.2*/("""

"""))}
    }
    
    def render(babysitters:List[BabySitter]) = apply(babysitters)
    
    def f:((List[BabySitter]) => play.api.templates.Html) = (babysitters) => apply(babysitters)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:39:52 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/emergencyList.scala.html
                    HASH: e299a6103a7cb8fdf4e080757d5e2707af1e262a
                    MATRIX: 773->1|881->32|918->35|953->62|992->64|1051->89|1064->95|1122->145|1161->147|1199->151|1240->177|1279->179|1322->188|1336->194|1367->204|1404->206|1418->212|1448->221|1544->281|1559->287|1584->290|1627->302|1721->365|1763->376
                    LINES: 27->1|30->1|32->3|32->3|32->3|36->7|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|38->9|38->9|40->11|40->11|40->11|42->13|46->17|48->19
                    -- GENERATED --
                */
            