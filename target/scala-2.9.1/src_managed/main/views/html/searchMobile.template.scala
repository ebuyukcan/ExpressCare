
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
object searchMobile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*2.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*2.19*/("""

"""),_display_(Seq[Any](/*4.2*/mainMobile("Search for your available babysitters")/*4.53*/ {_display_(Seq[Any](format.raw/*4.55*/("""
<header>
            ExpressCare
       </header>
 <div id="container">
    
    <div id="main" role="main">
	"""),_display_(Seq[Any](/*11.3*/helper/*11.9*/.form(action = routes.Application.listAvailableBabySitters(), 'class -> "container_6", 'style -> "margin-top:0" )/*11.122*/ {_display_(Seq[Any](format.raw/*11.124*/("""
		    <label for="address"> Address </label> <input  id="address" name="address" type="text" ></input>
			<label for="startDate"> Start Date </label> <input  id="startDate" name="startDate" type="date" data-role="datebox" data-options='"""),format.raw("""{"""),format.raw/*13.135*/(""""mode": "flipbox""""),format.raw("""}"""),format.raw/*13.153*/("""'> </input>
			<label for="startTime"> Start Time </label> <input  id="startTime" name="startTime" type="date" data-role="datebox" data-options='"""),format.raw("""{"""),format.raw/*14.135*/(""""mode": "timeflipbox""""),format.raw("""}"""),format.raw/*14.157*/("""'> </input>
			<label for="endDate"> End Date </label> <input  id="endDate" name="endDate" type="date" data-role="datebox" data-options='"""),format.raw("""{"""),format.raw/*15.127*/(""""mode": "flipbox""""),format.raw("""}"""),format.raw/*15.145*/("""'> </input>

			<label for="endTime"> End Time </label> <input  id="endTime" name="endTime" type="date" data-role="datebox"data-options='"""),format.raw("""{"""),format.raw/*17.126*/(""""mode": "timeflipbox""""),format.raw("""}"""),format.raw/*17.148*/("""'></input>
            <input type="submit" value="Request Babysitter" />      

	""")))})),format.raw/*20.3*/("""
		<footer>
		</footer>
		
		</div>
		
  </div> <!--! end of #container -->

     
""")))})),format.raw/*29.2*/("""


"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 10 11:13:19 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/searchMobile.scala.html
                    HASH: 1fca4d11ee55645b549cc0f297a43b956044da54
                    MATRIX: 762->2|856->19|895->24|954->75|993->77|1147->196|1161->202|1284->315|1325->317|1613->557|1679->575|1874->722|1944->744|2131->883|2197->901|2385->1041|2455->1063|2572->1149|2696->1242
                    LINES: 27->2|30->2|32->4|32->4|32->4|39->11|39->11|39->11|39->11|41->13|41->13|42->14|42->14|43->15|43->15|45->17|45->17|48->20|57->29
                    -- GENERATED --
                */
            