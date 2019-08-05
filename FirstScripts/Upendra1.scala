
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Upendra1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://ocsp.pki.goog")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Content-Type" -> "application/ocsp-request")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

    val uri2 = "http://ocsp.godaddy.com"
    val uri3 = "http://flipkart.com"
    val uri4 = "http://ocsp.digicert.com"

	val scn = scenario("Upendra1")
		.exec(http("request_0")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0000_request.dat")))
		.pause(1)
		.exec(http("request_1")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0001_request.dat")))
		.pause(8)
		.exec(http("request_2")
			.get(uri3 + "/")
			.headers(headers_2)
			.resources(http("request_3")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0003_request.dat")),
            http("request_4")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0004_request.dat")),
            http("request_5")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0005_request.dat")),
            http("request_6")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0006_request.dat")),
            http("request_7")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0007_request.dat")),
            http("request_8")
			.post(uri4 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0008_request.dat")),
            http("request_9")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0009_request.dat")),
            http("request_10")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0010_request.dat")),
            http("request_11")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0011_request.dat")),
            http("request_12")
			.post(uri4 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0012_request.dat")),
            http("request_13")
			.post(uri4 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0013_request.dat")),
            http("request_14")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0014_request.dat")),
            http("request_15")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0015_request.dat")),
            http("request_16")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0016_request.dat")),
            http("request_17")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0017_request.dat"))))
		.pause(69)
		.exec(http("request_18")
			.post("/GTSGIAG3")
			.headers(headers_0)
			.body(RawFileBody("/upendra1/0018_request.dat")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}