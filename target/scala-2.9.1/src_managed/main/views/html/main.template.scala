
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
	<head>
        <title>"""),_display_(Seq[Any](/*7.17*/(title + " | ExpressCare"))),format.raw/*7.43*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>

		<link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("stylesheets/960.css"))),format.raw/*12.72*/("""" type="text/css" />
		<link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("stylesheets/themes/base/jquery.ui.all.css"))),format.raw/*13.94*/("""">
		<link rel="stylesheet" href=""""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("stylesheets/themes/demo.css"))),format.raw/*14.80*/("""">
		<script src="http://maps.google.com/maps/api/js?sensor=false"></script>
	
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/jquery-ui-1.8.7.min.js"))),format.raw/*17.71*/(""""></script>
		<script src=""""),_display_(Seq[Any](/*18.17*/routes/*18.23*/.Assets.at("javascripts/jquery.ui.addresspicker.js"))),format.raw/*18.75*/(""""></script>
		<script src=""""),_display_(Seq[Any](/*19.17*/routes/*19.23*/.Assets.at("javascripts/jquery-ui-timepicker-addon.js"))),format.raw/*19.78*/(""""></script>
		<script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("javascripts/javascript.js"))),format.raw/*20.62*/(""""></script>
		
    
    </head>
    <body>
    	<div class="container_12">
		<div class="topbar header grid_12">
			<a class="grid_2 push_1" href="/">Home</a>
			<a class="grid_2 push_1" href="#">Meet our babysitters</a>
			<a class="grid_2 push_1" href="#">FAQ</a>
			<a class="grid_2 push_1" href="#">About</a>
			<a class="grid_2 push_1" href="#">Logout</a>
		</div>
		    
        """),_display_(Seq[Any](/*34.10*/content)),format.raw/*34.17*/("""
        
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:51:13 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/main.scala.html
                    HASH: 1115eaf959aaea53ac19da9c61a5e72ee9340f2f
                    MATRIX: 759->1|866->31|951->81|998->107|1095->169|1109->175|1164->209|1260->270|1274->276|1327->308|1388->333|1403->339|1470->384|1574->452|1589->458|1644->491|1733->544|1748->550|1825->605|1896->640|1911->646|1974->687|2105->782|2120->788|2190->836|2254->864|2269->870|2343->922|2407->950|2422->956|2499->1011|2563->1039|2578->1045|2639->1084|3061->1470|3090->1477
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|63->34|63->34
                    -- GENERATED --
                */
            