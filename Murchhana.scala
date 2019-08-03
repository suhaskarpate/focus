
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Murchhana extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.flipkart.com")
		.inferHtmlResources()
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Accept" -> "*/*")

	val headers_6 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Pragma" -> "no-cache",
		"Service-Worker" -> "script")

	val headers_8 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://www.flipkart.com")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://www.flipkart.com")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

	val headers_33 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop",
		"apiKey" -> "KrWcJnCSZFBLFR39DtHYySjcDCHg2LeC3sxdx7646n7iy7oy")

	val headers_38 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

	val headers_54 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

    val uri01 = "https://desr.fkapi.net"
    val uri03 = "https://dpm.demdex.net/id"
    val uri04 = "https://rukminim1.flixcart.com"
    val uri05 = "https://www.facebook.com/tr"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/1008984980"
    val uri07 = "https://trackertest.org"
    val uri08 = "https://flipkart.d1.sc.omtrdc.net"
    val uri09 = "https://www.google.com"
    val uri10 = "https://desb.fkapi.net/1.gif"
    val uri11 = "https://www.google.co.in/pagead/1p-user-list"
    val uri12 = "https://www.mozilla.org"
    val uri13 = "https://desa.fkapi.net/1.gif"
    val uri14 = "http://flipkart.com"
    val uri15 = "https://img1a.flixcart.com/www/linchpin/fk-cp-zion"

	val scn = scenario("Murchhana")
		.exec(http("request_0")
			.get(uri09 + "/complete/search?client=firefox&q=fl")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri09 + "/complete/search?client=firefox&q=fli")
			.headers(headers_0),
            http("request_2")
			.get(uri09 + "/complete/search?client=firefox&q=flip")
			.headers(headers_0),
            http("request_3")
			.get(uri09 + "/complete/search?client=firefox&q=flipka")
			.headers(headers_0),
            http("request_4")
			.get(uri09 + "/complete/search?client=firefox&q=flipkar")
			.headers(headers_0),
            http("request_5")
			.get(uri09 + "/complete/search?client=firefox&q=flipkart")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_6")
			.get(uri14 + "/")
			.headers(headers_6)
			.resources(http("request_7")
			.get("/sw.js")
			.headers(headers_7),
            http("request_8")
			.get(uri15 + "/fonts/roboto-regular-webfont.woff2")
			.headers(headers_8),
            http("request_9")
			.get(uri15 + "/fonts/roboto-medium-webfont.woff2")
			.headers(headers_8),
            http("request_10")
			.get(uri15 + "/js/MultiWidgetPage.chunk.35578e7e.js")
			.headers(headers_10),
            http("request_11")
			.get("/apple-touch-icon-144x144.png")
			.check(status.is(404)),
            http("request_12")
			.get(uri03 + "?d_visid_ver=1.5.4&d_rtbd=json&d_ver=2&d_orgid=17EB401053DAF4840A490D4C%40AdobeOrg&d_nsid=0&d_cb=s_c_il%5B0%5D._setMarketingCloudFields")
			.headers(headers_0),
            http("request_13")
			.get("/lc/getData?dataSourceId=websiteNavigationMenuDS_1.0&t=26080246")
			.headers(headers_13),
            http("request_14")
			.get(uri15 + "/img/login_img_dec4bf.png"),
            http("request_15")
			.get(uri06 + "/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0"),
            http("request_16")
			.get(uri04 + "/flap/480/480/image/2fc550b5aa9a304d.jpg?q=50"),
            http("request_17")
			.get(uri04 + "/flap/480/480/image/86284e46f6ca4cec.jpg?q=50"),
            http("request_18")
			.get(uri04 + "/image/150/150/jtltw280/headphone/y/6/f/ant-audio-treble-500-on-ear-hd-bluetooth-original-imafdwbcupppufcz.jpeg?q=70"),
            http("request_19")
			.get(uri04 + "/image/150/150/jdnevm80/watch/e/6/f/38004pp05-fastrack-original-imaf2ga9dtjazhsz.jpeg?q=70"),
            http("request_20")
			.get(uri05 + "?id=1469476963265313&ev=default"),
            http("request_21")
			.get(uri04 + "/image/150/150/jr9iwsw0/shoe/f/e/y/19106905-4-puma-peach-bud-white-original-imafd2kzzhynytvx.jpeg?q=70"),
            http("request_22")
			.get(uri08 + "/id?d_visid_ver=1.5.4&callback=s_c_il%5B0%5D._setAnalyticsFields&mcorgid=17EB401053DAF4840A490D4C%40AdobeOrg&mid=61075147672665199062579159970651823434")
			.headers(headers_0),
            http("request_23")
			.get(uri04 + "/image/150/150/jsyyufk0/cases-covers/back-cover/p/5/6/vonzee-apple-iphone-x-original-imafefgpjyeqgepb.jpeg?q=70"),
            http("request_24")
			.get(uri04 + "/flap/480/480/image/9777a2e40121f303.jpg?q=50"),
            http("request_25")
			.get(uri04 + "/image/150/150/jrdt8cw0/bra/q/f/s/42c-k22013dblue-makclan-original-imafd74fqy445hhk.jpeg?q=70"),
            http("request_26")
			.get(uri04 + "/flap/1688/280/image/9755c1733f78385f.jpg?q=50"),
            http("request_27")
			.get(uri04 + "/flap/1688/280/image/fae350ddc56ee425.jpg?q=50"),
            http("request_28")
			.get(uri04 + "/image/150/150/pendrive/r/e/p/sandisk-cruzer-blade-pack-of-2-original-imaedbf3pxrtzngt.jpeg?q=70"),
            http("request_29")
			.get(uri09 + "/pagead/1p-user-list/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&cdct=2&is_vtc=1&random=1992985271"),
            http("request_30")
			.get(uri11 + "/1011966879/?guid=ON&script=0&cdct=2&is_vtc=1&random=1693067230&ipr=y"),
            http("request_31")
			.get(uri11 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&cdct=2&is_vtc=1&random=1992985271&ipr=y"),
            http("request_32")
			.get(uri11 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=811803911&ipr=y"),
            http("request_33")
			.post("/api/1/connekt/push/callback")
			.headers(headers_33)
			.body(RawFileBody("/murchhana/0033_request.json")),
            http("request_34")
			.get(uri13),
            http("request_35")
			.get(uri10),
            http("request_36")
			.get(uri08 + "/b/ss/flipkart-prd/1/JS-1.5.1/s07256648276109?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A52%206%200&mid=61075147672665199062579159970651823434&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed&events=event12&c21=HomePage_Launch%20Login%3ADisplayed&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1366&bh=654&AQE=1"),
            http("request_37")
			.get(uri01 + "/?TI156481474929604831932199954918533478101928031457418136440350905301&0&0&1&1.00&0.00&161.00&1&0.00&1.00&277.00"),
            http("request_38")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0038_request.json")),
            http("request_39")
			.get(uri04 + "/flap/1688/280/image/5b97d8ce1ee25982.jpg?q=50")))
		.pause(2)
		.exec(http("request_40")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0040_request.json"))
			.resources(http("request_41")
			.get(uri04 + "/flap/1688/280/image/cd4ce54d834827f9.jpg?q=50")))
		.pause(1)
		.exec(http("request_42")
			.get(uri08 + "/b/ss/flipkart-prd/1/JS-1.5.1/s04550570914333?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A59%206%200&mid=61075147672665199062579159970651823434&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=%20&c3=Home&v3=Home&c8=100&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1366&bh=654&AQE=1"))
		.pause(2)
		.exec(http("request_43")
			.get(uri04 + "/flap/1688/280/image/c85581b9f5c5c5e8.jpg?q=50"))
		.pause(1)
		.exec(http("request_44")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0044_request.json")))
		.pause(1)
		.exec(http("request_45")
			.get(uri04 + "/flap/1688/280/image/39ae513ae9d89b2a.jpg?q=50"))
		.pause(3)
		.exec(http("request_46")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0046_request.json"))
			.resources(http("request_47")
			.get(uri04 + "/flap/1688/280/image/b449b8dca0f0b945.jpg?q=50")))
		.pause(4)
		.exec(http("request_48")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0048_request.json")))
		.pause(4)
		.exec(http("request_49")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0049_request.json")))
		.pause(4)
		.exec(http("request_50")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0050_request.json")))
		.pause(4)
		.exec(http("request_51")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0051_request.json")))
		.pause(4)
		.exec(http("request_52")
			.get(uri08 + "/b/ss/flipkart-prd/1/JS-1.5.1/s01216238123672?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A46%3A32%206%200&mid=61075147672665199062579159970651823434&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed%20Exit&pid=HomePage&pidt=1&oid=function%28%29%7B%7D&oidt=2&ot=DIV&c21=HomePage_Launch%20Login%3ADisplayed%20Exit&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1366&bh=654&AQE=1")
			.resources(http("request_53")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0053_request.json"))))
		.pause(4)
		.exec(http("request_54")
			.get(uri12 + "/en-US/firefox/68.0.1/content-blocking/start/?step=2&newtab=true&variation=1")
			.headers(headers_54)
			.resources(http("request_55")
			.get(uri12 + "/media/img/firefox/tracking-protection/grid.d41dfd248f0a.png"),
            http("request_56")
			.get(uri12 + "/media/img/firefox/tracking-protection/shield.9e150778d230.svg"),
            http("request_57")
			.get(uri07 + "/")
			.headers(headers_54),
            http("request_58")
			.get(uri07 + "/set_cookie.html")
			.headers(headers_54),
            http("request_59")
			.get(uri12 + "/media/img/firefox/tracking-protection/close-win.017676ae600a.png")))
		.pause(9)
		.exec(http("request_60")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0060_request.json")))
		.pause(4)
		.exec(http("request_61")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0061_request.json")))
		.pause(4)
		.exec(http("request_62")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0062_request.json")))
		.pause(4)
		.exec(http("request_63")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0063_request.json")))
		.pause(4)
		.exec(http("request_64")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0064_request.json")))
		.pause(4)
		.exec(http("request_65")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0065_request.json")))
		.pause(4)
		.exec(http("request_66")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0066_request.json")))
		.pause(4)
		.exec(http("request_67")
			.post("/api/1/fdp")
			.headers(headers_38)
			.body(RawFileBody("/murchhana/0067_request.json")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}