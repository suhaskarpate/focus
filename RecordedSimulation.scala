
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.google.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_4 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://demo.opencart.com")

    val uri1 = "https://fonts.gstatic.com/s/opensans/v17"
    val uri3 = "https://blocklists.settings.services.mozilla.com/v1/blocklist/3/%7Bec8030f7-c20a-464f-9b0e-13a3a9e97384%7D/68.0.1/Firefox/20190717172542/WINNT_x86_64-msvc/en-US/release/Windows_NT%206.3/default/default/1/1/new"
    val uri4 = "https://demo.opencart.com"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/complete/search?client=firefox&q=dem"))
		.pause(1)
		.exec(http("request_1")
			.get("/complete/search?client=firefox&q=demo"))
		.pause(15)
		.exec(http("request_2")
			.get(uri4 + "/")
			.headers(headers_2)
			.resources(http("request_3")
			.get(uri4 + "/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_3),
            http("request_4")
			.get(uri1 + "/mem8YaGs126MiZpBA-UFVZ0b.woff2")
			.headers(headers_4),
            http("request_5")
			.get(uri1 + "/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2")
			.headers(headers_4)))
		.pause(14)
		.exec(http("request_6")
			.get(uri3 + "/"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}