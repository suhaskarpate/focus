
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Theja extends Simulation {

	val httpProtocol = http
		.baseUrl("https://demo.opencart.com")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Accept" -> "*/*")

	val headers_1 = Map("Upgrade-Insecure-Requests" -> "1")

    val uri1 = "https://www.google.com/complete/search"

	val scn = scenario("Theja")
		.exec(http("request_0")
			.get(uri1 + "?client=firefox&q=demo")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_1")
			.get("/")
			.headers(headers_1))
		.pause(19)
		.exec(http("request_2")
			.get("/index.php?route=product/category&path=34")
			.headers(headers_1))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}