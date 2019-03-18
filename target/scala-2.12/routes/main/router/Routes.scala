// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/sdevca/ca1/SDEVca1/conf/routes
// @DATE:Mon Mar 18 20:46:31 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProjectCtrl_4: controllers.ProjectCtrl,
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:16
  AdminProjectCtrl_1: controllers.AdminProjectCtrl,
  // @LINE:28
  Assets_2: controllers.Assets,
  // @LINE:32
  LoginController_3: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProjectCtrl_4: controllers.ProjectCtrl,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:16
    AdminProjectCtrl_1: controllers.AdminProjectCtrl,
    // @LINE:28
    Assets_2: controllers.Assets,
    // @LINE:32
    LoginController_3: controllers.LoginController
  ) = this(errorHandler, ProjectCtrl_4, HomeController_0, AdminProjectCtrl_1, Assets_2, LoginController_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProjectCtrl_4, HomeController_0, AdminProjectCtrl_1, Assets_2, LoginController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProjectCtrl.index()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProjects""", """controllers.ProjectCtrl.listProjects(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.AdminProjectCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProjects""", """controllers.AdminProjectCtrl.listProjects(cat:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProjects/""" + "$" + """cat<[^/]+>""", """controllers.AdminProjectCtrl.listProjects(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProject""", """controllers.AdminProjectCtrl.addProject()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProjectSubmit""", """controllers.AdminProjectCtrl.addProjectSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProject/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.updateProject(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.updateProjectSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delProject/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.HomeController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.HomeController.registerUserSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProjectCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProjectCtrl_index0_invoker = createInvoker(
    ProjectCtrl_4.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProjectCtrl_listProjects2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProjects")))
  )
  private[this] lazy val controllers_ProjectCtrl_listProjects2_invoker = createInvoker(
    ProjectCtrl_4.listProjects(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectCtrl",
      "listProjects",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProjects""",
      """ Show a list of products - note optional parameter (added by Daria)""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AdminProjectCtrl_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_index3_invoker = createInvoker(
    AdminProjectCtrl_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """Admin""",
      """ Project Administration(added by Daria and Ryan)""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AdminProjectCtrl_listProjects4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProjects")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_listProjects4_invoker = createInvoker(
    AdminProjectCtrl_1.listProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "listProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminProjectCtrl_listProjects5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProjects/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_listProjects5_invoker = createInvoker(
    AdminProjectCtrl_1.listProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "listProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProjects/""" + "$" + """cat<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AdminProjectCtrl_addProject6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProject")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_addProject6_invoker = createInvoker(
    AdminProjectCtrl_1.addProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "addProject",
      Nil,
      "GET",
      this.prefix + """Admin/addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AdminProjectCtrl_addProjectSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProjectSubmit")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_addProjectSubmit7_invoker = createInvoker(
    AdminProjectCtrl_1.addProjectSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AdminProjectCtrl_updateProject8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_updateProject8_invoker = createInvoker(
    AdminProjectCtrl_1.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AdminProjectCtrl_updateProjectSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_updateProjectSubmit9_invoker = createInvoker(
    AdminProjectCtrl_1.updateProjectSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "updateProjectSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProjectSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AdminProjectCtrl_deleteProject10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_deleteProject10_invoker = createInvoker(
    AdminProjectCtrl_1.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/delProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
    LoginController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """login""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_loginSubmit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit13_invoker = createInvoker(
    LoginController_3.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_logout14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout14_invoker = createInvoker(
    LoginController_3.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_addUser15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser15_invoker = createInvoker(
    HomeController_0.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_addUserSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit16_invoker = createInvoker(
    HomeController_0.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_registerUser17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_HomeController_registerUser17_invoker = createInvoker(
    HomeController_0.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_registerUserSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_registerUserSubmit18_invoker = createInvoker(
    HomeController_0.registerUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProjectCtrl_index0_route(params@_) =>
      call { 
        controllers_ProjectCtrl_index0_invoker.call(ProjectCtrl_4.index())
      }
  
    // @LINE:7
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index())
      }
  
    // @LINE:11
    case controllers_ProjectCtrl_listProjects2_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProjectCtrl_listProjects2_invoker.call(ProjectCtrl_4.listProjects(cat, filter))
      }
  
    // @LINE:16
    case controllers_AdminProjectCtrl_index3_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_index3_invoker.call(AdminProjectCtrl_1.index())
      }
  
    // @LINE:17
    case controllers_AdminProjectCtrl_listProjects4_route(params@_) =>
      call(Param[Long]("cat", Right(0))) { (cat) =>
        controllers_AdminProjectCtrl_listProjects4_invoker.call(AdminProjectCtrl_1.listProjects(cat))
      }
  
    // @LINE:18
    case controllers_AdminProjectCtrl_listProjects5_route(params@_) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProjectCtrl_listProjects5_invoker.call(AdminProjectCtrl_1.listProjects(cat))
      }
  
    // @LINE:19
    case controllers_AdminProjectCtrl_addProject6_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_addProject6_invoker.call(AdminProjectCtrl_1.addProject())
      }
  
    // @LINE:20
    case controllers_AdminProjectCtrl_addProjectSubmit7_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_addProjectSubmit7_invoker.call(AdminProjectCtrl_1.addProjectSubmit())
      }
  
    // @LINE:21
    case controllers_AdminProjectCtrl_updateProject8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_updateProject8_invoker.call(AdminProjectCtrl_1.updateProject(id))
      }
  
    // @LINE:22
    case controllers_AdminProjectCtrl_updateProjectSubmit9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_updateProjectSubmit9_invoker.call(AdminProjectCtrl_1.updateProjectSubmit(id))
      }
  
    // @LINE:23
    case controllers_AdminProjectCtrl_deleteProject10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_deleteProject10_invoker.call(AdminProjectCtrl_1.deleteProject(id))
      }
  
    // @LINE:28
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:32
    case controllers_LoginController_login12_route(params@_) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_3.login)
      }
  
    // @LINE:33
    case controllers_LoginController_loginSubmit13_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit13_invoker.call(LoginController_3.loginSubmit)
      }
  
    // @LINE:34
    case controllers_LoginController_logout14_route(params@_) =>
      call { 
        controllers_LoginController_logout14_invoker.call(LoginController_3.logout)
      }
  
    // @LINE:35
    case controllers_HomeController_addUser15_route(params@_) =>
      call { 
        controllers_HomeController_addUser15_invoker.call(HomeController_0.addUser)
      }
  
    // @LINE:36
    case controllers_HomeController_addUserSubmit16_route(params@_) =>
      call { 
        controllers_HomeController_addUserSubmit16_invoker.call(HomeController_0.addUserSubmit)
      }
  
    // @LINE:37
    case controllers_HomeController_registerUser17_route(params@_) =>
      call { 
        controllers_HomeController_registerUser17_invoker.call(HomeController_0.registerUser)
      }
  
    // @LINE:38
    case controllers_HomeController_registerUserSubmit18_route(params@_) =>
      call { 
        controllers_HomeController_registerUserSubmit18_invoker.call(HomeController_0.registerUserSubmit)
      }
  }
}
