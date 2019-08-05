
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Geeta extends Simulation {

	val httpProtocol = http
		.baseUrl("http://ocsp.digicert.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Content-Type" -> "application/ocsp-request")

	val headers_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

    val uri1 = "http://ocsp.godaddy.com"
    val uri2 = "http://status.geotrust.com"
    val uri4 = "http://ocsp.pki.goog/GTSGIAG3"
    val uri5 = "http://www.amazon.in"
    val uri6 = "http://ocsp.sectigo.com"

	val scn = scenario("Geeta")
		.exec(http("request_0")
			.post(uri4)
			.headers(headers_0)
			.body(RawFileBody("/geeta/0000_request.dat"))
			.resources(http("request_1")
			.post(uri4)
			.headers(headers_0)
			.body(RawFileBody("/geeta/0001_request.dat")),
            http("request_2")
			.post(uri4)
			.headers(headers_0)
			.body(RawFileBody("/geeta/0002_request.dat")),
            http("request_3")
			.post(uri4)
			.headers(headers_0)
			.body(RawFileBody("/geeta/0003_request.dat"))))
		.pause(5)
		.exec(http("request_4")
			.post(uri1 + "/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0004_request.dat"))
			.resources(http("request_5")
			.get(uri5 + "/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_EAIaIQobChMIjN-cso3m4wIVgyQrCh1uwwiZEAAYASAAEgLFZPD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIjN-cso3m4wIVgyQrCh1uwwiZEAAYASAAEgLFZPD_BwE")
			.headers(headers_5)))
		.pause(2)
		.exec(http("request_6")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0006_request.dat"))
			.resources(http("request_7")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0007_request.dat")),
            http("request_8")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0008_request.dat")),
            http("request_9")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0009_request.dat")),
            http("request_10")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0010_request.dat")),
            http("request_11")
			.post(uri2 + "/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0011_request.dat")),
            http("request_12")
			.post(uri6 + "/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0012_request.dat")),
            http("request_13")
			.post(uri6 + "/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0013_request.dat")),
            http("request_14")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0014_request.dat")),
            http("request_15")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0015_request.dat")),
            http("request_16")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0016_request.dat")),
            http("request_17")
			.post("/")
			.headers(headers_0)
			.body(RawFileBody("/geeta/0017_request.dat"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}