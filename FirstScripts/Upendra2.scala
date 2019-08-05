
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Upendra2 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.flipkart.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.contentTypeHeader("application/json")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map(
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")



	val scn = scenario("Upendra2")
		.exec(http("request_0")
			.post("/api/1/fdp")
			.headers(headers_0)
			.body(RawFileBody("/upendra2/0000_request.json")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}