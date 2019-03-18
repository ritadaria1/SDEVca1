
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.projects.Category
/*2.2*/import models.projects.Project
/*3.2*/import models.users.User

object listProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[play.api.Environment,List[Category],List[Project],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], projects: List[Project], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""


"""),_display_(/*8.2*/main("Projects Page", user)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""

	"""),format.raw/*10.2*/("""<style>
		form """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
			"""),format.raw/*12.4*/("""margin-bottom: 1em;
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""
	"""),format.raw/*14.2*/("""</style>

	<div class="row">

	  <div class="col-md-3">
	<div class="list-group">

			<a href=""""),_display_(/*21.14*/routes/*21.20*/.ProjectCtrl.listProjects(0, filter)),format.raw/*21.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*22.5*/for(c <- categories) yield /*22.25*/ {_display_(Seq[Any](format.raw/*22.27*/("""
		"""),format.raw/*23.3*/("""<a href=""""),_display_(/*23.13*/routes/*23.19*/.ProjectCtrl.listProjects(c.getId, filter)),format.raw/*23.61*/("""" class="list-group-item">"""),_display_(/*23.88*/c/*23.89*/.getName),format.raw/*23.97*/("""</a>
			""")))}),format.raw/*24.5*/("""
	"""),format.raw/*25.2*/("""</div>
	  </div>

		<div class="col-md-9">
			"""),_display_(/*29.5*/if(flash.containsKey("success"))/*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
				  """),format.raw/*30.7*/("""<div class="alert alert-success">
					  """),_display_(/*31.9*/flash/*31.14*/.get("success")),format.raw/*31.29*/("""
				  """),format.raw/*32.7*/("""</div>
			""")))}),format.raw/*33.5*/("""

			"""),format.raw/*35.4*/("""<!-- Search Form -->
			<div id="actions">
			 <form action=""""),_display_(/*37.20*/routes/*37.26*/.ProjectCtrl.listProjects(catId)),format.raw/*37.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*38.63*/filter),format.raw/*38.69*/("""" placeholder="Filter by employee name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
			</div>

			<table class="table table-bordered table-hover table-condensed">
				<thead>

				<tr>
					<th></th>
					<th>Name</th>
					<th>Current Project</th>
					<th>Department</th>
					
	
				</tr>
				</thead>
				<tbody>

					"""),_display_(/*57.7*/for(p <- projects) yield /*57.25*/ {_display_(Seq[Any](format.raw/*57.27*/("""
					"""),format.raw/*58.6*/("""<tr>

						"""),_display_(/*60.8*/if(env.resource("public/images/EmployeeImages/" + p.getId + ".jpg").isDefined)/*60.86*/ {_display_(Seq[Any](format.raw/*60.88*/("""
							"""),format.raw/*61.8*/("""<td>
							<center><img width="200px" height="200px" src="/assets/images/EmployeeImages/"""),_display_(/*62.86*/(p.getId)),format.raw/*62.95*/(""".jpg"/></center>
							</td>
							""")))}/*64.10*/else/*64.15*/{_display_(Seq[Any](format.raw/*64.16*/("""
							"""),format.raw/*65.8*/("""<td>
							
							<img width="200px" height="200px" src="/assets/images/EmployeeImages/thumbnails/noImage.png"/>
							
							</td>
						""")))}),format.raw/*70.8*/("""
						"""),format.raw/*71.7*/("""<td>"""),_display_(/*71.12*/p/*71.13*/.getName),format.raw/*71.21*/("""</td>
						<td>"""),_display_(/*72.12*/p/*72.13*/.getDescription),format.raw/*72.28*/("""</td>

						<td>"""),_display_(/*74.12*/p/*74.13*/.getDepartment),format.raw/*74.27*/("""</td>
						
						
					</tr>
					""")))}),format.raw/*78.7*/("""
				"""),format.raw/*79.5*/("""</tbody>
			</table>
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],projects:List[Project],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,projects,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Project],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,projects,catId,filter,user) => apply(env,categories,projects,catId,filter,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:46:32 GMT 2019
                  SOURCE: /home/wdd/sdevca/ca1/SDEVca1/app/views/listProjects.scala.html
                  HASH: 852b45813b1c17de7ce7dbba1f83dccd0fac2cd2
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->214|1368->218|1403->245|1442->247|1472->250|1514->265|1542->266|1573->270|1622->292|1650->293|1679->295|1802->391|1817->397|1874->433|1949->482|1985->502|2025->504|2055->507|2092->517|2107->523|2170->565|2224->592|2234->593|2263->601|2302->610|2331->612|2404->659|2445->691|2485->693|2519->700|2587->742|2601->747|2637->762|2671->769|2712->780|2744->785|2833->847|2848->853|2901->885|3006->963|3033->969|3449->1359|3483->1377|3523->1379|3556->1385|3595->1398|3682->1476|3722->1478|3757->1486|3874->1576|3904->1585|3961->1624|3974->1629|4013->1630|4048->1638|4221->1781|4255->1788|4287->1793|4297->1794|4326->1802|4370->1819|4380->1820|4416->1835|4461->1853|4471->1854|4506->1868|4573->1905|4605->1910
                  LINES: 24->1|25->2|26->3|31->4|36->5|39->8|39->8|39->8|41->10|42->11|42->11|43->12|44->13|44->13|45->14|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|66->35|68->37|68->37|68->37|69->38|69->38|88->57|88->57|88->57|89->58|91->60|91->60|91->60|92->61|93->62|93->62|95->64|95->64|95->64|96->65|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|105->74|105->74|105->74|109->78|110->79
                  -- GENERATED --
              */
          