
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Home", user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Meowdy.</h1>
""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:46:32 GMT 2019
                  SOURCE: /home/wdd/sdevca/ca1/SDEVca1/app/views/index.scala.html
                  HASH: 0b28a02bf58cb574ddb35bbae9f5bd1f9f3a5af1
                  MATRIX: 651->1|978->27|1084->41|1110->59|1148->60|1179->65
                  LINES: 24->1|29->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          