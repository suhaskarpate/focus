package computerDB

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class UpdateComputer extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Accept" -> "image/webp,*/*")



	val scn = scenario("UpdateComputer")
		.exec(http("request_0")
			.get("/computers")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/favicon.ico")
			.headers(headers_1)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0001_response.html"))))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0000_response.html"))))
		.pause(20)
		.exec(http("request_2")
			.get("/computers?f=Suresh2")
			.headers(headers_0)
			.resources(http("request_3")
			.get("/favicon.ico")
			.headers(headers_1)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0003_response.html"))))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0002_response.html"))))
		.pause(5)
		.exec(http("request_4")
			.get("/computers/1039")
			.headers(headers_0)
			.resources(http("request_5")
			.get("/favicon.ico")
			.headers(headers_1)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0005_response.html"))))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0004_response.html"))))
		.pause(14)
		.exec(http("request_6")
			.post("/computers/1039")
			.headers(headers_0)
			.formParam("name", "Suresh2")
			.formParam("introduced", "2019-08-04")
			.formParam("discontinued", "2019-09-04")
			.formParam("company", "2")
			.resources(http("request_7")
			.get("/favicon.ico")
			.headers(headers_1)
			.check(status.is(404))
			.check(bodyBytes.is(RawFileBody("computerDB/updatecomputer/0007_response.html")))))

     setUp(scn.inject(constantUsersPerSec(1) during (15 seconds))).protocols(httpProtocol)

}