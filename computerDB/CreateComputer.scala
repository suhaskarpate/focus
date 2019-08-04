package computerDB

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CreateComputer extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")


    val param_computer = csv("data/computerDetails.csv").random


	val scn = scenario("CreateComputer")
		// LaunchURL
		.exec(http("request_0")
			.get("/"))
		.pause(47)
		// click Add a new computer
		.exec(http("request_1")
			.get("/computers/new")
			.check(bodyBytes.is(RawFileBody("computerDB/createcomputer/0001_response.html"))))
		.pause(50)
		// Click Create this Computer
		.feed(param_computer)
		.exec(http("request_2")
			.post("/computers")
			.formParam("name", "${computerName}")
			.formParam("introduced", "${introducedDate}")
			.formParam("discontinued", "${discontinuedDate}")
			.formParam("company", "1"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
	//setUp(scn.inject(constantUsersPerSec(1) during (5 seconds))).protocols(httpProtocol)
}