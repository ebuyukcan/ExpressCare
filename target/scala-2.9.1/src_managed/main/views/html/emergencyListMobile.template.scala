
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
object emergencyListMobile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[BabySitter],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitters: List[BabySitter]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main("List of babysitters")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
<!--	<h1></h1>

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
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/emergencyListMobile.scala.html
                    HASH: d75a6cb2383a94c413223505b26ac76e37fa97be
                    MATRIX: 779->1|887->32|924->35|959->62|998->64|1056->88|1069->94|1127->144|1166->146|1204->150|1245->176|1284->178|1327->187|1341->193|1372->203|1409->205|1423->211|1453->220|1549->280|1564->286|1589->289|1632->301|1726->364|1768->375
                    LINES: 27->1|30->1|32->3|32->3|32->3|36->7|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|38->9|38->9|40->11|40->11|40->11|42->13|46->17|48->19
                    -- GENERATED --
                */
            