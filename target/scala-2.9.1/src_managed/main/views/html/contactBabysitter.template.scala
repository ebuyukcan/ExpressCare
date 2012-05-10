
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
object contactBabysitter extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[BabySitter,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitter: BabySitter):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""


"""),_display_(Seq[Any](/*4.2*/main("Contact babysitter")/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""

	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Application.agreeSitter())/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""
	
		<h1>Contact information of the babysitter</h1>
	
		<h2>"""),_display_(Seq[Any](/*10.8*/babysitter/*10.18*/.firstName)),format.raw/*10.28*/("""</h2>	
		
		<h2>"""),_display_(Seq[Any](/*12.8*/babysitter/*12.18*/.lastName)),format.raw/*12.27*/("""</h2>	
		
		<h2>"""),_display_(Seq[Any](/*14.8*/babysitter/*14.18*/.email)),format.raw/*14.24*/("""</h2>
		
		<h2>"""),_display_(Seq[Any](/*16.8*/babysitter/*16.18*/.phone)),format.raw/*16.24*/("""</h2>	
		
		<input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*18.50*/babysitter/*18.60*/.id)),format.raw/*18.63*/("""" />
		
		<input type="submit" name="submit" value="Confirm"/>
		
	""")))})),format.raw/*22.3*/("""
    
""")))})),format.raw/*24.2*/("""


    

"""))}
    }
    
    def render(babysitter:BabySitter) = apply(babysitter)
    
    def f:((BabySitter) => play.api.templates.Html) = (babysitter) => apply(babysitter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:39:52 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/contactBabysitter.scala.html
                    HASH: fa6ff93344a6bb3438439249697c827d14ef8770
                    MATRIX: 771->1|872->25|910->29|944->55|983->57|1021->61|1034->67|1090->115|1129->117|1225->178|1244->188|1276->198|1328->215|1347->225|1378->234|1430->251|1449->261|1477->267|1528->283|1547->293|1575->299|1670->358|1689->368|1714->371|1813->439|1851->446
                    LINES: 27->1|30->1|33->4|33->4|33->4|35->6|35->6|35->6|35->6|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|47->18|47->18|47->18|51->22|53->24
                    -- GENERATED --
                */
            