// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/CA1sdev/SDevCA/conf/routes
// @DATE:Mon Mar 18 15:10:00 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
