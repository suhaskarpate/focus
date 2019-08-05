
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://demo.opencart.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_11 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://demo.opencart.com")

	val headers_13 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_14 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"DNT" -> "1",
		"Pragma" -> "no-cache")

	val headers_15 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"DNT" -> "1",
		"Origin" -> "https://demo.opencart.com",
		"Pragma" -> "no-cache")

    val uri1 = "https://fonts.gstatic.com/s/opensans/v17"
    val uri2 = "https://www.google.com/complete/search"
    val uri3 = "https://blocklists.settings.services.mozilla.com/v1/blocklist/3/%7Bec8030f7-c20a-464f-9b0e-13a3a9e97384%7D/68.0.1/Firefox/20190717172542/WINNT_x86_64-msvc/en-US/release/Windows_NT%206.3/default/default/1/1/new"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri3 + "/"))
		.pause(6)
		.exec(http("request_1")
			.get(uri2 + "?client=firefox&q=dem")
			.resources(http("request_2")
			.get(uri2 + "?client=firefox&q=demo")))
		.pause(2)
		.exec(http("request_3")
			.get(uri2 + "?client=firefox&q=demographi")
			.resources(http("request_4")
			.get(uri2 + "?client=firefox&q=demograph"),
            http("request_5")
			.get(uri2 + "?client=firefox&q=demograp"),
            http("request_6")
			.get(uri2 + "?client=firefox&q=demogra"),
            http("request_7")
			.get(uri2 + "?client=firefox&q=demogr"),
            http("request_8")
			.get(uri2 + "?client=firefox&q=demog"),
            http("request_9")
			.get(uri2 + "?client=firefox&q=demo")))
		.pause(3)
		.exec(http("request_10")
			.get("/")
			.headers(headers_10)
			.resources(http("request_11")
			.get(uri1 + "/mem8YaGs126MiZpBA-UFVZ0b.woff2")
			.headers(headers_11),
            http("request_12")
			.get(uri1 + "/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2")
			.headers(headers_11)))
		.pause(10)
		.exec(http("request_13")
			.get("/")
			.headers(headers_13)
			.resources(http("request_14")
			.get("/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_14),
            http("request_15")
			.get(uri1 + "/mem8YaGs126MiZpBA-UFVZ0b.woff2")
			.headers(headers_15),
            http("request_16")
			.get(uri1 + "/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2")
			.headers(headers_15)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}