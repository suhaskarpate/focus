package computerDB

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DeleteComputer extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")





	val scn = scenario("DeleteComputer")
		// Launch URL
		.exec(http("request_0")
			.get("/"))
		.pause(18)
		// Search Computer
		.exec(http("request_1")
			.get("/computers?f=Suresh123")
			//.check(bodyBytes.is(RawFileBody("computerDB/deletecomputer/0001_response.html")))
			.check(
			    regex("""<td><a href="/computers/(.*)">""")
			    .find
			    .saveAs( key = "selectedComputer")
			)
			)
		.pause(23)
		// Open commputer details
		.exec(http("request_2")
			.get("/computers/${selectedComputer}") //1065
			//.check(bodyBytes.is(RawFileBody("computerDB/deletecomputer/0002_response.html")))
			)
		.pause(23)
		// Delete this Computer
		.exec(http("request_3")
			.post("/computers/${selectedComputer}/delete")) //1065

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}