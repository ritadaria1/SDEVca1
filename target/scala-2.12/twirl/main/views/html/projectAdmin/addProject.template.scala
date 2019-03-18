
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.projects.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProjectForm: Form[models.projects.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import models.projects._
/*8.2*/import helper._


Seq[Any](format.raw/*2.1*/("""<!-- addProjectForm defined above is the parameter
 passed to this view by the controller -->
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/projectAdmin/*11.14*/.main("New Project", user)/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""

	"""),format.raw/*13.2*/("""<h3>Add a new Project</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProjectCtrl.addProjectSubmit(), 'class -> "form-horizontal", 'role->"form", 'method -> "POST", 'enctype -> "multipart/form-data")/*16.158*/ {_display_(Seq[Any](format.raw/*16.160*/("""
		"""),_display_(/*17.4*/CSRF/*17.8*/.formField),format.raw/*17.18*/("""
		"""),format.raw/*18.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*20.4*/inputText(addProjectForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*20.81*/("""
		"""),_display_(/*21.4*/inputText(addProjectForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*21.95*/("""

        """),format.raw/*23.9*/("""<!-- Checkboxes for categories - current categories for this project are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*25.10*/for((value, name) <- Category.options) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
            """),format.raw/*26.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*26.63*/value),format.raw/*26.68*/("""" />"""),_display_(/*26.73*/name),format.raw/*26.77*/("""<br>        
        """)))}),format.raw/*27.10*/("""

		"""),_display_(/*29.4*/inputText(addProjectForm("department"), '_label -> "Department",'class -> "form-control")),format.raw/*29.93*/("""
		"""),format.raw/*30.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Project" class="btn btn-primary">
			<a href=""""),_display_(/*39.14*/routes/*39.20*/.AdminProjectCtrl.listProjects(0)),format.raw/*39.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*43.3*/(""" """),format.raw/*43.4*/("""<!-- End Form definition -->

""")))}),format.raw/*45.2*/(""" """),format.raw/*45.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(addProjectForm:Form[models.projects.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProjectForm,user)

  def f:((Form[models.projects.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProjectForm,user) => apply(addProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 16:06:04 GMT 2019
                  SOURCE: /home/wdd/CA1sdev/SDevCA/app/views/projectAdmin/addProject.scala.html
                  HASH: bcc05c2cc1441cb9c32ed11cef5a208b04ba5ad2
                  MATRIX: 1007->1|1152->169|1184->304|1228->74|1348->194|1375->195|1509->320|1537->321|1617->375|1638->387|1673->413|1713->415|1743->418|1864->513|2029->668|2070->670|2100->674|2112->678|2143->688|2173->691|2294->786|2392->863|2422->867|2534->958|2571->968|2766->1136|2820->1174|2860->1176|2901->1189|2978->1239|3004->1244|3036->1249|3061->1253|3114->1275|3145->1280|3255->1369|3285->1372|3581->1641|3596->1647|3650->1680|3753->1753|3781->1754|3842->1785|3870->1786
                  LINES: 28->1|31->4|32->8|35->2|37->5|38->6|40->9|41->10|42->11|42->11|42->11|42->11|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|60->29|60->29|61->30|70->39|70->39|70->39|74->43|74->43|76->45|76->45
                  -- GENERATED --
              */
          