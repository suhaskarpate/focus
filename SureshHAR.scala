
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SureshHAR extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.flipkart.com")
		.inferHtmlResources()
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://www.flipkart.com")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

	val headers_20 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

	val headers_35 = Map("TE" -> "Trailers")

	val headers_36 = Map(
		"Accept" -> "*/*",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://www.flipkart.com")

	val headers_41 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com")

    val uri01 = "https://desr.fkapi.net"
    val uri02 = "https://pla-tk.flipkart.net/mapi/v1/tracker/eventBatch"
    val uri04 = "https://rukminim1.flixcart.com"
    val uri05 = "https://www.facebook.com/tr"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion"
    val uri07 = "https://flipkart.d1.sc.omtrdc.net/b/ss/flipkart-prd/1/JS-1.5.1"
    val uri08 = "https://www.google.com/pagead/1p-user-list/1017598645"
    val uri09 = "https://www.google.co.in/pagead/1p-user-list"
    val uri10 = "https://img1a.flixcart.com/www/linchpin/fk-cp-zion"

	val scn = scenario("SureshHAR")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri04 + "/image/275/275/j7qi9ow0/bedsheet/w/e/y/ivyrose-8901633329624-flat-bombay-dyeing-original-imaexwy3ncqh663q.jpeg?q=80")
			.headers(headers_1),
            http("request_2")
			.get(uri10 + "/js/MultiWidgetPage.chunk.35578e7e.js")
			.headers(headers_1),
            http("request_3")
			.get(uri10 + "/img/login_img_dec4bf.png"),
            http("request_4")
			.get("/lc/getData?dataSourceId=websiteNavigationMenuDS_1.0&t=26080276")
			.headers(headers_4),
            http("request_5")
			.get("/lc/getData?dataSourceId=websiteNavigationMenuDS_1.0&t=26080276")
			.headers(headers_4),
            http("request_6")
			.get(uri04 + "/flap/1688/280/image/9755c1733f78385f.jpg?q=50"),
            http("request_7")
			.get(uri04 + "/flap/1688/280/image/fae350ddc56ee425.jpg?q=50"),
            http("request_8")
			.get(uri04 + "/image/150/150/jrdt8cw0/bra/q/f/s/42c-k22013dblue-makclan-original-imafd74fqy445hhk.jpeg?q=70"),
            http("request_9")
			.get(uri04 + "/image/150/150/jxw5g280/headphone/stero-dynamic/j/e/5/boat-boat-rockerz-on-ear-400-original-imafg95zbguyzbf5.jpeg?q=70"),
            http("request_10")
			.get(uri04 + "/flap/1688/280/image/b9ee85c99b43871e.jpg?q=50"),
            http("request_11")
			.get(uri04 + "/image/150/150/jr9iwsw0/shoe/f/e/y/19106905-4-puma-peach-bud-white-original-imafd2kzzhynytvx.jpeg?q=70"),
            http("request_12")
			.get(uri04 + "/image/150/150/j5jx1u80/memory-card/sdxc/z/f/r/toshiba-thn-n401s0320e4-original-imaew7nepaeagqzc.jpeg?q=70"),
            http("request_13")
			.get(uri06 + "/1011966879/?guid=ON&script=0"),
            http("request_14")
			.get(uri07 + "/s02717125407512?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%207%3A16%3A20%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed&events=event12&c21=HomePage_Launch%20Login%3ADisplayed&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=362&AQE=1"),
            http("request_15")
			.get(uri05 + "?id=1469476963265313&ev=default"),
            http("request_16")
			.get(uri08 + "/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=2279923802"),
            http("request_17")
			.get(uri09 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&cdct=2&is_vtc=1&random=3261111029&ipr=y"),
            http("request_18")
			.get(uri09 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=2279923802&ipr=y"),
            http("request_19")
			.get(uri01 + "/?TI156481475043252348860051101634977210374484374642797094312791553703&0&0&1&0.00&0.00&95.00&1&0.00&0.00&97.00"),
            http("request_20")
			.post("/api/1/fdp")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0020_request.json")),
            http("request_21")
			.get(uri07 + "/s05924278089277?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%207%3A16%3A22%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=%20&c3=Home&v3=Home&c8=100&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=362&AQE=1")))
		.pause(1)
		.exec(http("request_22")
			.get(uri07 + "/s04908501011727?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%207%3A16%3A23%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed%20Exit&pid=HomePage&pidt=1&oid=function%28%29%7B%7D&oidt=2&ot=SUBMIT&c21=HomePage_Launch%20Login%3ADisplayed%20Exit&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=362&AQE=1"))
		.pause(3)
		.exec(http("request_23")
			.post("/api/1/fdp")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0023_request.json"))
			.resources(http("request_24")
			.get(uri04 + "/flap/1688/280/image/cd4ce54d834827f9.jpg?q=50")))
		.pause(3)
		.exec(http("request_25")
			.get(uri04 + "/flap/1688/280/image/c85581b9f5c5c5e8.jpg?q=50"))
		.pause(1)
		.exec(http("request_26")
			.post("/api/1/fdp")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0026_request.json")))
		.pause(1)
		.exec(http("request_27")
			.get(uri04 + "/flap/1688/280/image/39ae513ae9d89b2a.jpg?q=50")
			.resources(http("request_28")
			.get(uri04 + "/image/275/275/j7qi9ow0/bedsheet/w/e/y/ivyrose-8901633329624-flat-bombay-dyeing-original-imaexwy3ncqh663q.jpeg?q=80")
			.headers(headers_1),
            http("request_29")
			.post("/api/1/fdp")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0029_request.json")),
            http("request_30")
			.post("/api/4/page/fetch")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0030_request.json")),
            http("request_31")
			.get(uri10 + "/img/fa_8b4b59.png"),
            http("request_32")
			.get(uri10 + "/img/buying-guide-illustration_48642c.png"),
            http("request_33")
			.get(uri04 + "/image/312/312/jcp4b680/washing-machine-new/p/r/t/diva-aqua-vx-ifb-original-imaffgkq9ufqt2ep.jpeg?q=70"),
            http("request_34")
			.get(uri04 + "/image/312/312/j4pwsy80-1/washing-machine-new/3/y/9/ww60m206lmw-tl-samsung-original-imaevkc2qtcp3dj3.jpeg?q=70"),
            http("request_35")
			.get(uri06 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&data=pagetype%3Dbrowse%3Bpcat%3Dwashing-machines%3Bbrand%3D")
			.headers(headers_35),
            http("request_36")
			.options(uri02)
			.headers(headers_36),
            http("request_37")
			.get(uri05 + "?id=1469476963265313&ev=browsePage&cd%5Bpcat%5D=washing-machines&cd%5Bbrand%5D=")
			.headers(headers_35),
            http("request_38")
			.get(uri08 + "/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&data=pagetype%3Dbrowse%3Bpcat%3Dwashing-machines%3Bbrand%3D&cdct=2&is_vtc=1&random=3574427740")
			.headers(headers_35),
            http("request_39")
			.get(uri09 + "/1011966879/?guid=ON&script=0&data=ecomm_prodid%3DWMNEHPCR5BJHXPRT%2CWMNEV4ZCMAUUT3Y9%2CWMNF6V4ACGUDVYBZ%3Becomm_pagetype%3Dsearchresults%3Bpcat%3Dwashing-machines%3Bbrand%3D&cdct=2&is_vtc=1&random=3503559387&ipr=y")
			.headers(headers_35),
            http("request_40")
			.get(uri09 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&data=pagetype%3Dbrowse%3Bpcat%3Dwashing-machines%3Bbrand%3D&cdct=2&is_vtc=1&random=2227041918&ipr=y")
			.headers(headers_35),
            http("request_41")
			.post(uri02)
			.headers(headers_41)
			.body(RawFileBody("/sureshhar/0041_request.json")),
            http("request_42")
			.get(uri06 + "/1017598645/?label=8whdCOP52AMQtaWd5QM&guid=ON&script=0&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=0zRFXdKnEdKUvgTM27iIDA&random=953494322&sscte=1&crd=&gtd=")
			.headers(headers_35)))
		.pause(1)
		.exec(http("request_43")
			.post("/api/1/fdp")
			.headers(headers_20)
			.body(RawFileBody("/sureshhar/0043_request.json")))
		.pause(17)
		.exec(http("request_44")
			.get(uri07 + "/s04560457406397?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%207%3A16%3A54%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=Store%20%3AHome%20%26%20Kitchen%7CHome%20Appliances%7CWashing%20Machines&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=%20&c3=Tag&v3=Tag&c8=100&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=362&AQE=1"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}