
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
object search extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Parent,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(parent: Parent):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),_display_(Seq[Any](/*3.2*/main("Search for your available babysitters")/*3.47*/ {_display_(Seq[Any](format.raw/*3.49*/("""
<!-- TODO: The styles should be integrated to the css -->

	    """),_display_(Seq[Any](/*6.7*/if(flash.containsKey("success"))/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""
	        <div class="grid_12 alert-message warning">
	            """),_display_(Seq[Any](/*8.15*/flash/*8.20*/.get("success"))),format.raw/*8.35*/("""
	        </div>
	    """)))})),format.raw/*10.7*/(""" 
	    
	    <img class="grid_12" src=""""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("images/train.png"))),format.raw/*12.69*/("""" title="Reliable babysitters!" />

		<div class="grid_6">
			<p class="grid_1 alpha" style="color:#FFB730;font-size:8em;margin-top:0;">1</p>
			<div class="grid_6" id="map"> </div>
			<p class="grid_6 omega">You can drag and drop the marker to the correct location</p>
		</div>

	  
		"""),_display_(Seq[Any](/*21.4*/helper/*21.10*/.form(action = routes.Application.listAvailableBabySitters(), 'class -> "container_6", 'style -> "margin-top:0" )/*21.123*/ {_display_(Seq[Any](format.raw/*21.125*/("""
			
		<div class="grid_6 alpha" style="margin-top: 0">
        <div>
        <p class="grid_1" style="color:#FFB730;font-size:8em;margin-top:0;">2</p>
        <div class="container_6">

			<div class="container_3 alpha" style="margin-top:0.5em">
			<dl>
				<dt class="grid_2" style="margin-bottom:0"><label for="startTime">start</label></dt><dd class="grid_2" style="margin-bottom:0"><input id="startTime" class="grid_3" name="start" type="text" size="20" /></dd>
				<dt class="grid_2" style="margin-top:0.2em"><label for="endTime">end</label></dt><dd class="grid_2" style="margin-top:0.2em"><input id="endTime" name="end" class="grid_3" type="text" size="20"/></dd>
			</dl>

            <p class="grid_6 omega">&nbsp;</p>


<!--
		    <label for="startTime" class="grid_1">start</label>
            <input id="startTime" class="grid_3" name="start" type="text" size="20" />

            <label for="endTime"class="grid_1">end</label>
            <input id="endTime" name="end" class="grid_3" type="text" size="20"/>
    --> 
			<span style="display:none;">
			<label>Address : </label> <input id="addresspicker_map" />   <br/>
			<label>Locality: </label> <input id="locality" disabled=disabled /> <br/>
			<label>Country:  </label> <input id="country" disabled=disabled /> <br/>
			<label>Lat:      </label> <input id="lat" name="latitude" /> <br/>
			<label>Lng:      </label> <input id="lng" name="longitude" /> <br/></span>
		</div>
		</div>

		<div>
			<p class="grid_1" style="color:#FFB730;font-size:8em;margin-top:0;">3</p>
			<div class="container_3" style="margin-top:0.5em">
			<dl>
				<dt class="grid_2" style="margin-bottom:0">price</dt><dd class="grid_2" style="margin-bottom:0"><strong id="hourly_price">13</strong> €/h</dd>
				<dt class="grid_2" style="margin-top:0.2em">hours</dt><dd class="grid_2" style="margin-top:0.2em"><strong id="amount_of_hours">-</strong></dd>
				<dt class="grid_2">total</dt><dd class="grid_2"><strong id="total_amount">-</strong> €</dd>
			</dl>
			<input class="grid_2" style="margin-top:2em" type="submit" value="Request a babysitter"/>
			</div>
			
		</div>
		</div>
		""")))})),format.raw/*66.4*/("""


<script type="text/javascript">
	initMap("""),_display_(Seq[Any](/*70.11*/parent/*70.17*/.lastLatitude)),format.raw/*70.30*/(""", """),_display_(Seq[Any](/*70.33*/parent/*70.39*/.lastLongitude)),format.raw/*70.53*/(""");
</script>

""")))})),format.raw/*73.2*/("""
"""))}
    }
    
    def render(parent:Parent) = apply(parent)
    
    def f:((Parent) => play.api.templates.Html) = (parent) => apply(parent)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 10 11:12:40 EEST 2012
                    SOURCE: /Users/elifb/Documents/XpressCare/server/app/views/search.scala.html
                    HASH: 34b97beef5a4dd9b3bb1899d38a1616e5b8acb56
                    MATRIX: 756->1|849->17|886->20|939->65|978->67|1078->133|1118->165|1157->167|1260->235|1273->240|1309->255|1363->278|1439->318|1454->324|1506->354|1828->641|1843->647|1966->760|2007->762|4164->2888|4245->2933|4260->2939|4295->2952|4334->2955|4349->2961|4385->2975|4431->2990
                    LINES: 27->1|30->1|32->3|32->3|32->3|35->6|35->6|35->6|37->8|37->8|37->8|39->10|41->12|41->12|41->12|50->21|50->21|50->21|50->21|95->66|99->70|99->70|99->70|99->70|99->70|99->70|102->73
                    -- GENERATED --
                */
            