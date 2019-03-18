// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/CA1sdev/SDevCA/conf/routes
// @DATE:Mon Mar 18 15:10:00 GMT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProjectCtrl ProjectCtrl = new controllers.ReverseProjectCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminProjectCtrl AdminProjectCtrl = new controllers.ReverseAdminProjectCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProjectCtrl ProjectCtrl = new controllers.javascript.ReverseProjectCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminProjectCtrl AdminProjectCtrl = new controllers.javascript.ReverseAdminProjectCtrl(RoutesPrefix.byNamePrefix());
  }

}
