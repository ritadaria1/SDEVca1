// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/sdevca/ca1/SDEVca1/conf/routes
// @DATE:Mon Mar 18 20:46:31 GMT 2019


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
