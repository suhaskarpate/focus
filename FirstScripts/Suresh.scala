
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Suresh extends Simulation {

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
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://www.flipkart.com")

	val headers_8 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://www.flipkart.com")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Pragma" -> "no-cache",
		"Service-Worker" -> "script")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

	val headers_27 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop",
		"apiKey" -> "KrWcJnCSZFBLFR39DtHYySjcDCHg2LeC3sxdx7646n7iy7oy")

	val headers_37 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.flipkart.com",
		"X-user-agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0 FKUA/website/41/website/Desktop")

    val uri01 = "https://desr.fkapi.net"
    val uri03 = "https://dpm.demdex.net/id"
    val uri04 = "https://rukminim1.flixcart.com"
    val uri05 = "https://www.facebook.com/tr"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion"
    val uri07 = "https://flipkart.d1.sc.omtrdc.net"
    val uri08 = "https://www.google.com"
    val uri09 = "https://desb.fkapi.net/1.gif"
    val uri10 = "https://www.google.co.in/pagead/1p-user-list"
    val uri11 = "http://flipkart.com"
    val uri12 = "https://img1a.flixcart.com/www/linchpin/fk-cp-zion"

	val scn = scenario("Suresh")
		.exec(http("request_0")
			.get(uri08 + "/complete/search?client=firefox&q=fl")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri08 + "/complete/search?client=firefox&q=fli")
			.headers(headers_0),
            http("request_2")
			.get(uri08 + "/complete/search?client=firefox&q=flip")
			.headers(headers_0),
            http("request_3")
			.get(uri08 + "/complete/search?client=firefox&q=flipka")
			.headers(headers_0),
            http("request_4")
			.get(uri08 + "/complete/search?client=firefox&q=flipkar")
			.headers(headers_0),
            http("request_5")
			.get(uri08 + "/complete/search?client=firefox&q=flipkart")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_6")
			.get(uri11 + "/")
			.headers(headers_6)
			.resources(http("request_7")
			.get(uri12 + "/fonts/roboto-regular-webfont.woff2")
			.headers(headers_7),
            http("request_8")
			.get(uri12 + "/js/MultiWidgetPage.chunk.35578e7e.js")
			.headers(headers_8),
            http("request_9")
			.get(uri12 + "/fonts/roboto-medium-webfont.woff2")
			.headers(headers_7),
            http("request_10")
			.get("/sw.js")
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
			.get(uri12 + "/img/login_img_dec4bf.png"),
            http("request_15")
			.get(uri06 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0"),
            http("request_16")
			.get(uri04 + "/flap/480/480/image/2fc550b5aa9a304d.jpg?q=50"),
            http("request_17")
			.get(uri04 + "/flap/1688/280/image/bdbdba09cc5d1151.jpg?q=50"),
            http("request_18")
			.get(uri04 + "/image/150/150/pendrive/r/e/p/sandisk-cruzer-blade-pack-of-2-original-imaedbf3pxrtzngt.jpeg?q=70"),
            http("request_19")
			.get(uri04 + "/flap/480/480/image/86284e46f6ca4cec.jpg?q=50"),
            http("request_20")
			.get(uri04 + "/flap/1688/280/image/9755c1733f78385f.jpg?q=50"),
            http("request_21")
			.get(uri04 + "/flap/480/480/image/9777a2e40121f303.jpg?q=50"),
            http("request_22")
			.get(uri04 + "/flap/1688/280/image/fae350ddc56ee425.jpg?q=50"),
            http("request_23")
			.get(uri04 + "/image/150/150/jrdt8cw0/bra/q/f/s/42c-k22013dblue-makclan-original-imafd74fqy445hhk.jpeg?q=70"),
            http("request_24")
			.get(uri04 + "/image/150/150/jmjhifk0/shoe/f/k/5/11006340-fw-18-8-fila-wht-blk-original-imaf9fq4ytwdvfvs.jpeg?q=70"),
            http("request_25")
			.get(uri04 + "/image/150/150/jdnevm80/watch/e/6/f/38004pp05-fastrack-original-imaf2ga9dtjazhsz.jpeg?q=70"),
            http("request_26")
			.get(uri05 + "?id=1469476963265313&ev=default"),
            http("request_27")
			.post("/api/1/connekt/push/callback")
			.headers(headers_27)
			.body(RawFileBody("/suresh/0027_request.json")),
            http("request_28")
			.get(uri07 + "/id?d_visid_ver=1.5.4&callback=s_c_il%5B0%5D._setAnalyticsFields&mcorgid=17EB401053DAF4840A490D4C%40AdobeOrg&mid=02591661699850965983215124144182341650")
			.headers(headers_0),
            http("request_29")
			.get(uri08 + "/pagead/1p-user-list/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=2556255023"),
            http("request_30")
			.get(uri09),
            http("request_31")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s06728813578744?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A52%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pageType=FLIPKART%3AHomePage&events=event1%2Cevent199%2Cevent182%3D1560&products=%3BHomePage%3B%3B%3B%3BeVar93%3DFLIPKART&aamb=6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y&c1=HomePage&v1=HomePage&c3=FLIPKART%3AHomePage&v3=FLIPKART%3AHomePage&c4=HomePage&v4=logout&v8=HomePage&c35=https%3A%2F%2Fwww.flipkart.com%2F&c39=1560&c43=Logout%3AFlipkartFirst_Inactive&v50=HomePage&c66=TI156481475043252348860051101634977210374484374642797094312791553703&v99=NON_LOGGED_IN&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1"),
            http("request_32")
			.get(uri01 + "/?TI156481475043252348860051101634977210374484374642797094312791553703&0&0&1&0.00&1.00&142.00&1&1.00&14.00&216.00"),
            http("request_33")
			.get(uri10 + "/1011966879/?guid=ON&script=0&cdct=2&is_vtc=1&random=3115011069&ipr=y"),
            http("request_34")
			.get(uri10 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&cdct=2&is_vtc=1&random=3134111724&ipr=y"),
            http("request_35")
			.get(uri10 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=2556255023&ipr=y"),
            http("request_36")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s05399994625564?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A52%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed&events=event12&c21=HomePage_Launch%20Login%3ADisplayed&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1"),
            http("request_37")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0037_request.json"))))
		.pause(1)
		.exec(http("request_38")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s01906835516250?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A54%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=%20&c3=Home&v3=Home&c8=100&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1")
			.resources(http("request_39")
			.get(uri04 + "/flap/1688/280/image/5b97d8ce1ee25982.jpg?q=50")))
		.pause(2)
		.exec(http("request_40")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s05037126800010?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A45%3A57%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=HomePage&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Login%20Displayed%20Exit&pid=HomePage&pidt=1&oid=function%28%29%7B%7D&oidt=2&ot=SUBMIT&c21=HomePage_Launch%20Login%3ADisplayed%20Exit&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1")
			.resources(http("request_41")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0041_request.json"))))
		.pause(4)
		.exec(http("request_42")
			.get(uri04 + "/flap/1688/280/image/cd4ce54d834827f9.jpg?q=50")
			.resources(http("request_43")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0043_request.json"))))
		.pause(2)
		.exec(http("request_44")
			.get(uri04 + "/flap/1688/280/image/c85581b9f5c5c5e8.jpg?q=50"))
		.pause(2)
		.exec(http("request_45")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0045_request.json"))
			.resources(http("request_46")
			.get(uri04 + "/flap/1688/280/image/39ae513ae9d89b2a.jpg?q=50")))
		.pause(3)
		.exec(http("request_47")
			.get(uri04 + "/flap/1688/280/image/b449b8dca0f0b945.jpg?q=50")
			.resources(http("request_48")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0048_request.json"))))
		.pause(4)
		.exec(http("request_49")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0049_request.json")))
		.pause(4)
		// ElectronicsTab
		.exec(http("request_50")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0050_request.json")))
		.pause(3)
		.exec(http("request_51")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0051_request.json"))
			.resources(http("request_52")
			.get(uri04 + "/image/275/275/j7qi9ow0/bedsheet/w/e/y/ivyrose-8901633329624-flat-bombay-dyeing-original-imaexwy3ncqh663q.jpeg?q=80")
			.headers(headers_8),
            http("request_53")
			.post("/api/4/page/fetch")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0053_request.json")),
            http("request_54")
			.get(uri04 + "/merch/240/240/images/1469767653274.jpg?q=90"),
            http("request_55")
			.get(uri04 + "/flap/240/240/image/b1051228f256a5b1.jpg?q=90"),
            http("request_56")
			.get(uri04 + "/flap/50/50/image/f1c79c70cf13aecc.jpg?q=50"),
            http("request_57")
			.get(uri12 + "/img/fa_8b4b59.png"),
            http("request_58")
			.get(uri04 + "/flap/50/50/image/046b409d7e991160.jpg?q=50"),
            http("request_59")
			.get(uri04 + "/flap/50/50/image/8f47908885310df4.jpg?q=50"),
            http("request_60")
			.get(uri04 + "/flap/50/50/image/f4338712b63e0db6.jpg?q=50"),
            http("request_61")
			.get(uri04 + "/flap/50/50/image/17431e9cee1a66a9.jpg?q=50"),
            http("request_62")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0062_request.json")),
            http("request_63")
			.get(uri04 + "/flap/50/50/image/2715bed9f7f4d53a.jpg?q=50"),
            http("request_64")
			.get(uri04 + "/flap/50/50/image/a298f95e6c6a434a.jpg?q=50"),
            http("request_65")
			.get(uri04 + "/flap/50/50/image/84ca69229ed9f2ac.jpg?q=50"),
            http("request_66")
			.get(uri04 + "/flap/50/50/image/7b375f96dc2bb041.jpg?q=50"),
            http("request_67")
			.get(uri04 + "/flap/50/50/image/b2c4eb52d9ff0487.jpg?q=50"),
            http("request_68")
			.get(uri04 + "/flap/50/50/image/6f5aa304ac2dcda6.jpg?q=50"),
            http("request_69")
			.get(uri04 + "/merch/240/240/images/1469767493020.jpg?q=90"),
            http("request_70")
			.get(uri04 + "/flap/240/240/image/a2598d.jpg?q=90"),
            http("request_71")
			.get(uri04 + "/flap/240/240/image/d31310195a763595.jpg?q=90"),
            http("request_72")
			.get(uri04 + "/merch/240/240/images/1491727341203.jpg?q=90"),
            http("request_73")
			.get(uri04 + "/flap/240/240/image/40462d4271cfe284.jpeg?q=90"),
            http("request_74")
			.get(uri04 + "/flap/240/240/image/a1a2b810e99c8401.jpg?q=90"),
            http("request_75")
			.get(uri04 + "/flap/50/50/image/25a9424f5ad0ca14.jpg?q=50"),
            http("request_76")
			.get(uri04 + "/flap/50/50/image/10c78e01839650c0.jpg?q=50"),
            http("request_77")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s0239091428565?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A46%3A27%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=CLP%3Amobile-phones-store&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pid=HomePage&pidt=1&oid=https%3A%2F%2Fwww.flipkart.com%2Fmobile-phones-store%3Fotracker%3Dnmenu_sub_Electronics_0_Mobiles&ot=A&pageType=FLIPKART%3ACLP&events=event1&products=%3BCLP%3B%3B%3B%3BeVar93%3DFLIPKART&aamb=6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y&c1=CLP%3Amobile-phones-store&v1=CLP%3Amobile-phones-store&c3=FLIPKART%3ACLP&v3=FLIPKART%3ACLP&c4=CLP%3Amobile-phones-store&v4=logout&c11=nmenu_sub_Electronics_0_Mobiles&c25=FLIPKART%3AHomePage&c26=HomePage&c27=14&c35=https%3A%2F%2Fwww.flipkart.com%2Fmobile-phones-store%3Fotracker%3Dnmenu_sub_Electronics_0_Mobiles&c43=Logout%3AFlipkartFirst_Inactive&c45=4263&v50=CLP%3Amobile-phones-store&c66=TI156481475043252348860051101634977210374484374642797094312791553703&v99=NON_LOGGED_IN&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1"),
            http("request_78")
			.get(uri06 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0"),
            http("request_79")
			.get(uri04 + "/flap/480/480/image/8f47908885310df4.jpg?q=50"),
            http("request_80")
			.get(uri04 + "/flap/480/480/image/17431e9cee1a66a9.jpg?q=50"),
            http("request_81")
			.get(uri04 + "/flap/480/480/image/f4338712b63e0db6.jpg?q=50"),
            http("request_82")
			.get(uri04 + "/flap/480/480/image/f1c79c70cf13aecc.jpg?q=50"),
            http("request_83")
			.get(uri04 + "/flap/480/480/image/046b409d7e991160.jpg?q=50"),
            http("request_84")
			.get(uri04 + "/flap/480/480/image/2715bed9f7f4d53a.jpg?q=50"),
            http("request_85")
			.get(uri08 + "/pagead/1p-user-list/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&cdct=2&is_vtc=1&random=4009303383"),
            http("request_86")
			.get(uri10 + "/1011966879/?guid=ON&script=0&cdct=2&is_vtc=1&random=3303505203&ipr=y"),
            http("request_87")
			.get(uri10 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&cdct=2&is_vtc=1&random=1393904742&ipr=y"),
            http("request_88")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0088_request.json")),
            http("request_89")
			.get(uri07 + "/b/ss/flipkart-prd/1/JS-1.5.1/s07702897371481?AQB=1&ndh=1&pf=1&t=3%2F7%2F2019%206%3A46%3A29%206%200&mid=02591661699850965983215124144182341650&aamlh=12&ce=UTF-8&ns=flipkart&pageName=CLP%3Amobile-phones-store&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=%20&c3=StoreLanding&v3=StoreLanding&c8=100&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=1231&bh=612&AQE=1")))
		.pause(4)
		.exec(http("request_90")
			.post("/api/1/fdp")
			.headers(headers_37)
			.body(RawFileBody("/suresh/0090_request.json")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}