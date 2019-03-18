
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>


    """),_display_(/*9.6*/form(action=routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.102*/ {_display_(Seq[Any](format.raw/*9.104*/("""

        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""


    """),_display_(/*14.6*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.80*/("""
         """),_display_(/*15.11*/inputText(userForm("fName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/inputText(userForm("lName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*16.88*/("""
    """),_display_(/*17.6*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.86*/("""

    """),_display_(/*19.6*/inputText(userForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*19.78*/("""


    """),format.raw/*22.5*/("""<div class="actions">
        <input type="submit" value="Register user" class="btn btn-primary">
        <a href=""""),_display_(/*24.19*/routes/*24.25*/.HomeController.addUser()),format.raw/*24.50*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*28.2*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:46:32 GMT 2019
                  SOURCE: /home/wdd/sdevca/ca1/SDEVca1/app/views/addUser.scala.html
                  HASH: b5ea434266c2414ce03cb02719503db7020384ec
                  MATRIX: 985->1|1117->63|1161->61|1188->79|1215->81|1249->107|1287->108|1318->113|1385->155|1490->251|1530->253|1568->264|1581->268|1612->278|1646->286|1741->360|1779->371|1879->450|1916->460|2015->538|2047->544|2148->624|2181->631|2274->703|2308->710|2451->826|2466->832|2512->857|2644->959
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|42->11|42->11|42->11|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          