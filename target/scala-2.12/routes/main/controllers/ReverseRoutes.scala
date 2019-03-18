// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/sdevca/ca1/SDEVca1/conf/routes
// @DATE:Mon Mar 18 20:46:31 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:28
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseProjectCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def listProjects(cat:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listProjects" + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:37
    def registerUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "registerUser")
    }
  
    // @LINE:36
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:38
    def registerUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "registerUserSubmit")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:32
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:34
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:32
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:16
  class ReverseAdminProjectCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProject")
    }
  
    // @LINE:23
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def updateProjectSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProjectSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:21
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def listProjects(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:17
        case (cat) if cat == 0 =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("cat", 0))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProjects")
      
        // @LINE:18
        case (cat)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("cat", cat)))
      
      }
    
    }
  
    // @LINE:20
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProjectSubmit")
    }
  
    // @LINE:16
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin")
    }
  
  }


}
