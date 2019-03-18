
package views.html.projectAdmin

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

object listProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.Environment,List[Category],List[Project],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], projects: List[Project], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/projectAdmin/*8.14*/.main("Products Page", user)/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""


"""),format.raw/*11.1*/("""<div class="row">

  <div class="col-md-3">
      <div class="list-group">
				<!-- Start of For loop - For each c in categories add a link -->
				<a href=""""),_display_(/*16.15*/routes/*16.21*/.AdminProjectCtrl.listProjects(0)),format.raw/*16.54*/("""" class="list-group-item">All categories</a>
				"""),_display_(/*17.6*/for(c <- categories) yield /*17.26*/ {_display_(Seq[Any](format.raw/*17.28*/("""
          """),format.raw/*18.11*/("""<a href=""""),_display_(/*18.21*/routes/*18.27*/.AdminProjectCtrl.listProjects(c.getId)),format.raw/*18.66*/("""" class="list-group-item">"""),_display_(/*18.93*/c/*18.94*/.getName),format.raw/*18.102*/("""</a>
				""")))}),format.raw/*19.6*/("""
      """),format.raw/*20.7*/("""</div>
  </div>

	<div class="col-md-9">
		"""),_display_(/*24.4*/if(flash.containsKey("success"))/*24.36*/ {_display_(Seq[Any](format.raw/*24.38*/("""
			  """),format.raw/*25.6*/("""<div class="alert alert-success">
			      """),_display_(/*26.11*/flash/*26.16*/.get("success")),format.raw/*26.31*/("""
			  """),format.raw/*27.6*/("""</div>
		""")))}),format.raw/*28.4*/(""" 

		"""),format.raw/*30.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
                <th></th>
				<th>ID</th>
				<th>Name</th>
				<th>Current Project</th>
				<th>Department</th>
				
			</tr>
			</thead>
			<tbody>
				<!-- Start of For loop - For each p in projects add a row -->
				"""),_display_(/*44.6*/for(p <- projects) yield /*44.24*/ {_display_(Seq[Any](format.raw/*44.26*/("""
				"""),format.raw/*45.5*/("""<tr>
					<!-- Display each project field value in a column -->
					"""),_display_(/*47.7*/if(env.resource("public/images/EmployeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.96*/ {_display_(Seq[Any](format.raw/*47.98*/("""
						"""),format.raw/*48.7*/("""<td><img src="/assets/images/EmployeeImages/thumbnails/"""),_display_(/*48.63*/(p.getId)),format.raw/*48.72*/(""".jpg"/></td>
					""")))}/*49.8*/else/*49.13*/{_display_(Seq[Any](format.raw/*49.14*/("""
						"""),format.raw/*50.7*/("""<td><img src="/assets/images/EmployeeImages/thumbnails/noImage.png"/></td>
					""")))}),format.raw/*51.7*/("""
					"""),format.raw/*52.6*/("""<td>"""),_display_(/*52.11*/p/*52.12*/.getId),format.raw/*52.18*/("""</td>
					<td>"""),_display_(/*53.11*/p/*53.12*/.getName),format.raw/*53.20*/("""</td>
					<td>"""),_display_(/*54.11*/p/*54.12*/.getDescription),format.raw/*54.27*/("""</td>
					<td>"""),_display_(/*55.11*/p/*55.12*/.getDepartment),format.raw/*55.26*/("""</td>
					
					
					"""),_display_(/*58.7*/if(user != null)/*58.23*/ {_display_(Seq[Any](format.raw/*58.25*/("""
					"""),format.raw/*59.6*/("""<td>
						<a href=""""),_display_(/*60.17*/routes/*60.23*/.AdminProjectCtrl.updateProject(p.getId)),format.raw/*60.63*/("""" class="btn-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span></a>
					</td>
					
					<td>
						<a href=""""),_display_(/*65.17*/routes/*65.23*/.AdminProjectCtrl.deleteProject(p.getId)),format.raw/*65.63*/("""" class="btn-xs btn-danger"
						onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span></a>
					</td>
					""")))}),format.raw/*69.7*/("""
				"""),format.raw/*70.5*/("""</tr>
				""")))}),format.raw/*71.6*/("""
			"""),format.raw/*72.4*/("""</tbody>
		</table>
		"""),_display_(/*74.4*/if(user != null)/*74.20*/ {_display_(Seq[Any](format.raw/*74.22*/("""
		"""),format.raw/*75.3*/("""<div>
			<a href=""""),_display_(/*76.14*/routes/*76.20*/.AdminProjectCtrl.addProject()),format.raw/*76.50*/("""">
				<button class="btn btn-primary">Add a Employee to Project</button>
			</a>
		</div>
		""")))}),format.raw/*80.4*/("""
	"""),format.raw/*81.2*/("""</div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
		"""),format.raw/*87.3*/("""return confirm('Are you sure?');
	"""),format.raw/*88.2*/("""}"""),format.raw/*88.3*/("""
"""),format.raw/*89.1*/("""</script>
""")))}),format.raw/*90.2*/("""

"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],projects:List[Project],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,projects,user)

  def f:((play.api.Environment,List[Category],List[Project],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,projects,user) => apply(env,categories,projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 16:11:44 GMT 2019
                  SOURCE: /home/wdd/CA1sdev/SDevCA/app/views/projectAdmin/listProjects.scala.html
                  HASH: 9c83b0392d30e54990e88bf0da8b846027117204
                  MATRIX: 664->1|703->34|741->66|1125->92|1311->185|1339->187|1410->233|1430->245|1466->273|1505->275|1535->278|1720->436|1735->442|1789->475|1865->525|1901->545|1941->547|1980->558|2017->568|2032->574|2092->613|2146->640|2156->641|2186->649|2226->659|2260->666|2330->710|2371->742|2411->744|2444->750|2515->794|2529->799|2565->814|2598->820|2638->830|2670->835|3027->1166|3061->1184|3101->1186|3133->1191|3229->1261|3327->1350|3367->1352|3401->1359|3484->1415|3514->1424|3551->1444|3564->1449|3603->1450|3637->1457|3748->1538|3781->1544|3813->1549|3823->1550|3850->1556|3893->1572|3903->1573|3932->1581|3975->1597|3985->1598|4021->1613|4064->1629|4074->1630|4109->1644|4159->1668|4184->1684|4224->1686|4257->1692|4305->1713|4320->1719|4381->1759|4539->1890|4554->1896|4615->1936|4786->2077|4818->2082|4859->2093|4890->2097|4939->2120|4964->2136|5004->2138|5034->2141|5080->2160|5095->2166|5146->2196|5270->2290|5299->2292|5448->2413|5477->2414|5507->2417|5568->2451|5596->2452|5624->2453|5665->2464
                  LINES: 24->1|25->2|26->3|31->4|36->5|38->7|39->8|39->8|39->8|39->8|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|61->30|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|89->58|89->58|89->58|90->59|91->60|91->60|91->60|96->65|96->65|96->65|100->69|101->70|102->71|103->72|105->74|105->74|105->74|106->75|107->76|107->76|107->76|111->80|112->81|117->86|117->86|118->87|119->88|119->88|120->89|121->90
                  -- GENERATED --
              */
          