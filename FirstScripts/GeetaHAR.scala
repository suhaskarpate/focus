
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class GeetaHAR extends Simulation {

	val httpProtocol = http
		.baseUrl("https://demo.opencart.com")
		.inferHtmlResources()
		.acceptHeader("text/css,*/*;q=0.1")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")





	val scn = scenario("GeetaHAR")
		.exec(http("request_0")
			.get("/catalog/view/theme/default/stylesheet/stylesheet.css")
			.resources(http("request_1")
			.get("/catalog/view/theme/default/stylesheet/stylesheet.css")
			.check(bodyBytes.is(RawFileBody("/geetahar/0001_response.css"))),
            http("request_2")
			.get("/catalog/view/javascript/bootstrap/css/bootstrap.min.css")
			.check(bodyBytes.is(RawFileBody("/geetahar/0002_response.css"))),
            http("request_3")
			.get("/catalog/view/javascript/bootstrap/css/bootstrap.min.css")
			.check(bodyBytes.is(RawFileBody("/geetahar/0003_response.css"))))
			.check(bodyBytes.is(RawFileBody("/geetahar/0000_response.css"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}