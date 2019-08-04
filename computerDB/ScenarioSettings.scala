package computerDB

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ScenarioSettings extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")





	val scn = scenario("ScenarioSettings")
		// browse
		.exec(http("request_0")
			.get("/"))
		.pause(26)
		// Search Computer
		.exec(http("request_1")
			.get("/computers?f=suresh4"))

	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)  // Passed
	// setUp(scn.inject( nothingFor(15 seconds), constantUsersPerSec(1) during (15 seconds))).protocols(httpProtocol) // Passed
	// setUp(scn.inject(rampUsers(10) over (60 seconds))).protocols(httpProtocol)  // Failed
    setUp(scn.inject( constantUsersPerSec(50) during (15 seconds) randomized )).protocols(httpProtocol) // passed

}