
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Priya2 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://demo.opencart.com")
		.inferHtmlResources()
		.acceptHeader("text/css,*/*;q=0.1")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("TE" -> "Trailers")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"TE" -> "Trailers")

	val headers_5 = Map("Accept" -> "*/*")

	val headers_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_11 = Map("Accept" -> "image/webp,*/*")

    val uri1 = "https://fonts.googleapis.com/css"

	val scn = scenario("Priya2")
		.exec(http("request_0")
			.get("/catalog/view/theme/default/stylesheet/stylesheet.css")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/catalog/view/javascript/jquery/swiper/css/swiper.min.css")
			.headers(headers_0),
            http("request_2")
			.get("/catalog/view/javascript/jquery/swiper/css/opencart.css")
			.headers(headers_0),
            http("request_3")
			.get("/catalog/view/javascript/jquery/swiper/js/swiper.jquery.js")
			.headers(headers_3),
            http("request_4")
			.get("/catalog/view/javascript/common.js")
			.headers(headers_3),
            http("request_5")
			.get("/catalog/view/javascript/jquery/jquery-2.1.1.min.js")
			.headers(headers_5),
            http("request_6")
			.get("/catalog/view/javascript/bootstrap/css/bootstrap.min.css")
			.headers(headers_0),
            http("request_7")
			.get("/catalog/view/javascript/bootstrap/js/bootstrap.min.js")
			.headers(headers_3),
            http("request_8")
			.get("/catalog/view/javascript/font-awesome/css/font-awesome.min.css")
			.headers(headers_0),
            http("request_9")
			.get(uri1 + "?family=Open+Sans:400,400i,300,700")
			.headers(headers_0),
            http("request_10")
			.get("/index.php?route=product/category&path=57")
			.headers(headers_10),
            http("request_11")
			.get("/image/cache/catalog/demo/compaq_presario-182x182.jpg")
			.headers(headers_11),
            http("request_12")
			.get("/image/cache/catalog/demo/samsung_tab_1-228x228.jpg")
			.headers(headers_11),
            http("request_13")
			.get("/image/catalog/cart.png")
			.headers(headers_11)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}