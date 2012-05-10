
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
object mainMobile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

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
	
		
		 <!-- scripts concatenated and minified via ant build script-->
		<script src=""""),_display_(Seq[Any](/*19.17*/routes/*19.23*/.Assets.at("javascripts/helper.js"))),format.raw/*19.58*/(""""></script>
		<link rel="stylesheet" type="text/css" href="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.css" />
		<link rel="stylesheet" type="text/css" href="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.css" /> 

		<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script> 	
		<script type="text/javascript" src="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.js"></script>

		<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.js"></script>
		<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/i8n/jquery.mobile.datebox.i8n.en.js"></script><link rel="stylesheet" type="text/css" href="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.css" />
		<link rel="stylesheet" type="text/css" href="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.css" /> 

		<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script> 	
		<script type="text/javascript" src="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.js"></script>

		<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.js"></script>
		<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/i8n/jquery.mobile.datebox.i8n.en.js"></script>

		  <!-- Mobile viewport optimization h5bp.com/ad -->
		  <meta name="HandheldFriendly" content="True">
		  <meta name="MobileOptimized" content="320">
		  <meta name="viewport" content="width=device-width">
		
		  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/h/apple-touch-icon.png">
		  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/m/apple-touch-icon.png">
		  <link rel="apple-touch-icon-precomposed" href="img/l/apple-touch-icon-precomposed.png">
		  <link rel="shortcut icon" href="img/l/apple-touch-icon.png">
		
		  <!-- iOS web app, delete if not needed. https://github.com/h5bp/mobile-boilerplate/issues/94 -->
		  <meta name="apple-mobile-web-app-capable" content="yes">
		  <meta name="apple-mobile-web-app-status-bar-style" content="black">
		  
		  <!-- The script prevents links from opening in mobile safari. https://gist.github.com/1042026 -->
		  <script>(function(a,b,c)"""),format.raw("""{"""),format.raw/*51.30*/("""if(c in b&&b[c])"""),format.raw("""{"""),format.raw/*51.47*/("""var d,e=a.location,f=/^(a|html)$/i;a.addEventListener("click",function(a)"""),format.raw("""{"""),format.raw/*51.121*/("""d=a.target;while(!f.test(d.nodeName))d=d.parentNode;"href"in d&&(d.href.indexOf("http")||~d.href.indexOf(e.host))&&(a.preventDefault(),e.href=d.href)"""),format.raw("""}"""),format.raw/*51.271*/(""",!1)"""),format.raw("""}"""),format.raw("""}"""),format.raw/*51.277*/(""")(document,window.navigator,"standalone")</script>
		  
		  <!-- Mobile IE allows us to activate ClearType technology for smoothing fonts for easy reading -->
		  <meta http-equiv="cleartype" content="on">
		
		  <!-- Main Stylesheet -->
		  <link rel="stylesheet" href=""""),_display_(Seq[Any](/*57.35*/routes/*57.41*/.Assets.at("stylesheets/style.css"))),format.raw/*57.76*/("""">
	
		  <script src=""""),_display_(Seq[Any](/*59.19*/routes/*59.25*/.Assets.at("javascripts/modernizr-2.0.6.min.js"))),format.raw/*59.73*/(""""></script>
		  <script src=""""),_display_(Seq[Any](/*60.19*/routes/*60.25*/.Assets.at("javascripts/helper.js"))),format.raw/*60.60*/(""""></script>
    
	</head>
    <body>
        
		
		"""),_display_(Seq[Any](/*66.4*/content)),format.raw/*66.11*/("""
     
		  
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
                    DATE: Thu May 10 11:12:40 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/mainMobile.scala.html
                    HASH: 9b28fa5c8029e2e7e0979494c64c44075f645aa4
                    MATRIX: 765->1|872->31|963->87|1010->113|1108->176|1122->182|1177->216|1274->278|1288->284|1341->316|1403->342|1418->348|1485->393|1591->463|1606->469|1661->502|1751->556|1766->562|1843->617|1915->653|1930->659|1993->700|2198->869|2213->875|2270->910|4658->3251|4722->3268|4844->3342|5042->3492|5115->3498|5429->3776|5444->3782|5501->3817|5562->3842|5577->3848|5647->3896|5714->3927|5729->3933|5786->3968|5879->4026|5908->4033
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|48->19|48->19|48->19|80->51|80->51|80->51|80->51|80->51|86->57|86->57|86->57|88->59|88->59|88->59|89->60|89->60|89->60|95->66|95->66
                    -- GENERATED --
                */
            