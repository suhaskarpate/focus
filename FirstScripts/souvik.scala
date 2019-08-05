
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class souvik extends Simulation {

	val httpProtocol = http
		.baseUrl("http://ocsp.pki.goog")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.contentTypeHeader("application/ocsp-request")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")





	val scn = scenario("souvik")
		.exec(http("request_0")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0000_request.dat"))
			.resources(http("request_1")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0001_request.dat")),
            http("request_2")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0002_request.dat")),
            http("request_3")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0003_request.dat")),
            http("request_4")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0004_request.dat")),
            http("request_5")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0005_request.dat")),
            http("request_6")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0006_request.dat")),
            http("request_7")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0007_request.dat")),
            http("request_8")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0008_request.dat")),
            http("request_9")
			.post("/GTSGIAG3")
			.body(RawFileBody("/souvik/0009_request.dat"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}