
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
object contactBabysitterMobile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[BabySitter,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitter: BabySitter):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""


"""),_display_(Seq[Any](/*4.2*/mainMobile("Contact babysitter")/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""

	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Application.agreeSitter())/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""
	
		<h1>Contact information of the babysitter</h1>
	
		<h2>"""),_display_(Seq[Any](/*10.8*/babysitter/*10.18*/.firstName)),format.raw/*10.28*/("""</h2>	
		
		<h2>"""),_display_(Seq[Any](/*12.8*/babysitter/*12.18*/.lastName)),format.raw/*12.27*/("""</h2>	
		
		<h2>"""),_display_(Seq[Any](/*14.8*/babysitter/*14.18*/.email)),format.raw/*14.24*/("""</h2>
		
		<h2>"""),_display_(Seq[Any](/*16.8*/babysitter/*16.18*/.phone)),format.raw/*16.24*/("""</h2>	
		
		<input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*18.50*/babysitter/*18.60*/.id)),format.raw/*18.63*/("""" />
		
		<input type="submit" name="submit" value="Confirm"/>
		
	""")))})),format.raw/*22.3*/("""
	
	
    
""")))})),format.raw/*26.2*/("""


    

"""))}
    }
    
    def render(babysitter:BabySitter) = apply(babysitter)
    
    def f:((BabySitter) => play.api.templates.Html) = (babysitter) => apply(babysitter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:39:52 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/contactBabysitterMobile.scala.html
                    HASH: 312b3f3c2bb769d3e2ee1479052251a36455c7ae
                    MATRIX: 777->1|878->25|916->29|956->61|995->63|1033->67|1046->73|1102->121|1141->123|1237->184|1256->194|1288->204|1340->221|1359->231|1390->240|1442->257|1461->267|1489->273|1540->289|1559->299|1587->305|1682->364|1701->374|1726->377|1825->445|1867->456
                    LINES: 27->1|30->1|33->4|33->4|33->4|35->6|35->6|35->6|35->6|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|47->18|47->18|47->18|51->22|55->26
                    -- GENERATED --
                */
            