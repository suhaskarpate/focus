
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://demo.opencart.com")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")





	val scn = scenario("RecordedSimulation1")
		.exec(http("request_0")
			.get("/"))
		.pause(16)
		.exec(http("request_1")
			.get("/index.php?route=product/category&path=25_28"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}