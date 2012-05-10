
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
object listBabySitters extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[BabySitterAvailable],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitters: List[BabySitterAvailable]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

"""),_display_(Seq[Any](/*3.2*/main("Available babysitters")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    
	<h1 class="grid_12">Available babysitters</h1>
	
	"""),_display_(Seq[Any](/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
	        <div class="grid_12 alert-message warning">
	            """),_display_(Seq[Any](/*9.15*/flash/*9.20*/.get("success"))),format.raw/*9.35*/("""
	        </div>
	    """)))})),format.raw/*11.7*/(""" 

	"""),_display_(Seq[Any](/*13.3*/for(sitter <- babysitters) yield /*13.29*/ {_display_(Seq[Any](format.raw/*13.31*/("""
		
		"""),_display_(Seq[Any](/*15.4*/helper/*15.10*/.form(action = routes.Application.requestSitter())/*15.60*/ {_display_(Seq[Any](format.raw/*15.62*/("""
			<div class="container_12">
				<img class="grid_2" src=""""),_display_(Seq[Any](/*17.31*/routes/*17.37*/.Assets.at("images/mugweb.jpg"))),format.raw/*17.68*/("""" title="Reliable babysitters!" />
				<h1 class="grid_10">"""),_display_(Seq[Any](/*18.26*/sitter/*18.32*/.babySitter.firstName)),format.raw/*18.53*/(""" """),_display_(Seq[Any](/*18.55*/sitter/*18.61*/.babySitter.lastName)),format.raw/*18.81*/("""</h1>
				
				<h2 class="grid_10">Available from """),_display_(Seq[Any](/*20.41*/sitter/*20.47*/.startTime)),format.raw/*20.57*/(""" to """),_display_(Seq[Any](/*20.62*/sitter/*20.68*/.endTime)),format.raw/*20.76*/("""</h2>
				
				<input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*22.52*/sitter/*22.58*/.id)),format.raw/*22.61*/("""" />
				
				<input class="grid_1" type="submit" name="submit" value="Request"/>
			</div>
		""")))})),format.raw/*26.4*/("""
		
	
	""")))})),format.raw/*29.3*/("""
    
""")))})),format.raw/*31.2*/("""

"""))}
    }
    
    def render(babysitters:List[BabySitterAvailable]) = apply(babysitters)
    
    def f:((List[BabySitterAvailable]) => play.api.templates.Html) = (babysitters) => apply(babysitters)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 10 10:50:32 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/listBabySitters.scala.html
                    HASH: b50d648e990c5926f307095302f1a8924cf72520
                    MATRIX: 784->1|901->41|938->44|975->73|1014->75|1106->133|1146->165|1185->167|1288->235|1301->240|1337->255|1391->278|1431->283|1473->309|1513->311|1555->318|1570->324|1629->374|1669->376|1766->437|1781->443|1834->474|1930->534|1945->540|1988->561|2026->563|2041->569|2083->589|2170->640|2185->646|2217->656|2258->661|2273->667|2303->675|2401->737|2416->743|2441->746|2567->841|2606->849|2644->856
                    LINES: 27->1|30->1|32->3|32->3|32->3|36->7|36->7|36->7|38->9|38->9|38->9|40->11|42->13|42->13|42->13|44->15|44->15|44->15|44->15|46->17|46->17|46->17|47->18|47->18|47->18|47->18|47->18|47->18|49->20|49->20|49->20|49->20|49->20|49->20|51->22|51->22|51->22|55->26|58->29|60->31
                    -- GENERATED --
                */
            