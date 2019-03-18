
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
/*1.2*/import models.users.User

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login], user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<h3>Sign in</h3>

"""),_display_(/*8.2*/if(loginForm.hasGlobalErrors)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
    """),format.raw/*9.5*/("""<p class ="alert alert-warning">

    """),_display_(/*11.6*/for(e <- loginForm.globalErrors) yield /*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""
        """),_display_(/*12.10*/e/*12.11*/.message),format.raw/*12.19*/("""<br/>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</p>
""")))}),format.raw/*15.2*/("""

"""),_display_(/*17.2*/if(flash.containsKey("error"))/*17.32*/{_display_(Seq[Any](format.raw/*17.33*/("""
    """),format.raw/*18.5*/("""<div class="alert alert-success">
        """),_display_(/*19.10*/flash/*19.15*/.get("error")),format.raw/*19.28*/("""
    """),format.raw/*20.5*/("""</div>
""")))}),format.raw/*21.2*/("""





"""),_display_(/*27.2*/helper/*27.8*/.form(action = controllers.routes.LoginController.loginSubmit())/*27.72*/ {_display_(Seq[Any](format.raw/*27.74*/("""
"""),_display_(/*28.2*/CSRF/*28.6*/.formField),format.raw/*28.16*/("""
"""),format.raw/*29.1*/("""<div class="form-group">
    """),_display_(/*30.6*/inputText(loginForm("email"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*31.64*/("""
"""),format.raw/*32.1*/("""</div>
<div class="form-group">
    """),_display_(/*34.6*/inputPassword(loginForm("password"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*35.67*/("""
"""),format.raw/*36.1*/("""</div>
<div class="form-group">
    <input type="submit" value="Sign In" class="btn btn-primary">
</div>

""")))}),format.raw/*41.2*/("""
""")))}),format.raw/*42.2*/("""



"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:46:32 GMT 2019
                  SOURCE: /home/wdd/sdevca/ca1/SDEVca1/app/views/login.scala.html
                  HASH: f60187c02bef501702946e2eedf08c1105c137a3
                  MATRIX: 651->1|1003->27|1124->77|1168->93|1195->95|1222->114|1260->115|1291->120|1335->139|1372->168|1411->170|1442->175|1507->214|1555->246|1595->248|1632->258|1642->259|1671->267|1712->278|1740->279|1776->285|1805->288|1844->318|1883->319|1915->324|1985->367|1999->372|2033->385|2065->390|2103->398|2136->405|2150->411|2223->475|2263->477|2291->479|2303->483|2334->493|2362->494|2418->524|2547->632|2575->633|2638->670|2777->788|2805->789|2942->896|2974->898
                  LINES: 24->1|29->2|32->3|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|63->32|65->34|66->35|67->36|72->41|73->42
                  -- GENERATED --
              */
          