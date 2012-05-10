
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
object viewBabysitter extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[BabySitter,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(babysitter: BabySitter):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""


"""),_display_(Seq[Any](/*4.2*/main("View babysitter profile")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""

	<h1>View a babysitter's' profile</h1>

	<h2>"""),_display_(Seq[Any](/*8.7*/babysitter/*8.17*/.firstName)),format.raw/*8.27*/("""</h2>	
	
	<h2>"""),_display_(Seq[Any](/*10.7*/babysitter/*10.17*/.lastName)),format.raw/*10.26*/("""</h2>	
	
	<h2>"""),_display_(Seq[Any](/*12.7*/babysitter/*12.17*/.birthday)),format.raw/*12.26*/("""</h2>
	
	<h2>"""),_display_(Seq[Any](/*14.7*/babysitter/*14.17*/.phone)),format.raw/*14.23*/("""</h2>	
    
""")))})),format.raw/*16.2*/("""


    

"""))}
    }
    
    def render(babysitter:BabySitter) = apply(babysitter)
    
    def f:((BabySitter) => play.api.templates.Html) = (babysitter) => apply(babysitter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 15:39:52 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/viewBabysitter.scala.html
                    HASH: 5dd12ca9dc3ae63c605a0fcd4e255e133a2ac327
                    MATRIX: 768->1|869->25|907->29|946->60|985->62|1067->110|1085->120|1116->130|1166->145|1185->155|1216->164|1266->179|1285->189|1316->198|1365->212|1384->222|1412->228|1456->241
                    LINES: 27->1|30->1|33->4|33->4|33->4|37->8|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16
                    -- GENERATED --
                */
            