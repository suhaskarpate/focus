
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordRenuka extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.google.com")
		.inferHtmlResources()
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")

	val headers_0 = Map("Accept" -> "*/*")

	val headers_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_25 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://www.amazon.com")

	val headers_154 = Map(
		"Accept" -> "*/*",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_161 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_163 = Map(
		"Accept" -> "text/html,*/*",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_164 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "text/plain;charset=UTF-8")

	val headers_183 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://www.amazon.com")

	val headers_188 = Map("Origin" -> "https://www.amazon.com")

	val headers_250 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_329 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Origin" -> "https://www.amazon.com")

    val uri01 = "http://amazon.com"
    val uri02 = "https://ib.adnxs.com"
    val uri03 = "https://pixel.advertising.com/ups/56466/sync"
    val uri04 = "https://dpm.demdex.net/ibs:dpid=139200&dpuuid=z9XED42SQSKPqq9dgM36mQ&redir=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dadobe.com%26id%3D%24%7BDD_UUID%7D"
    val uri05 = "https://www.facebook.com/fr/r.php"
    val uri06 = "https://sync.ipredictive.com/d/sync/cookie/generic"
    val uri07 = "https://completion.amazon.com/api/2017/suggestions"
    val uri08 = "https://tags.bluekai.com/site/36840"
    val uri09 = "https://analytics.twitter.com/i/adsct"
    val uri10 = "https://images-na.ssl-images-amazon.com/images"
    val uri11 = "https://image6.pubmatic.com/AdServer/UCookieSetPug"
    val uri12 = "https://unagi-na.amazon.com/1/events/com.amazon.csm.nexusclient.prod"
    val uri13 = "https://c1.adform.net/serving/cookie/match"
    val uri14 = "https://usermatch.krxd.net/um/v2"
    val uri15 = "https://www.amazon.com"
    val uri16 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/1063929773"
    val uri17 = "https://cm.g.doubleclick.net/pixel"
    val uri18 = "https://sync.search.spotxchange.com/partner"
    val uri20 = "https://match.adsrvr.org/track/cmb/generic"
    val uri21 = "https://cms.analytics.yahoo.com/cms"
    val uri22 = "https://sync.1rx.io/usersync2/rmpssp"
    val uri23 = "https://fls-na.amazon.com/1/batch/1"
    val uri24 = "https://token.rubiconproject.com/token"
    val uri25 = "https://m.media-amazon.com/images/G/01"
    val uri26 = "https://x.bidswitch.net"
    val uri27 = "https://s.amazon-adsystem.com"
    val uri28 = "https://a8ca9911d316846fa9811995b70f0a056.profile.cdg54.cloudfront.net/test.png"
    val uri29 = "https://bh.contextweb.com/bh/rtset"
    val uri30 = "https://ssum-sec.casalemedia.com/usermatchredir"
    val uri31 = "https://aa.agkn.com/adscores/g.pixel"

	val scn = scenario("RecordRenuka")
		.exec(http("request_0")
			.get("/complete/search?client=firefox&q=fl")
			.headers(headers_0))
		.pause(4)
		.exec(http("request_1")
			.get("/complete/search?client=firefox&q=ama")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_2")
			.get("/complete/search?client=firefox&q=amaz")
			.headers(headers_0)
			.resources(http("request_3")
			.get("/complete/search?client=firefox&q=amazo")
			.headers(headers_0),
            http("request_4")
			.get("/complete/search?client=firefox&q=amazon")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_5")
			.get(uri01 + "/")
			.headers(headers_5)
			.resources(http("request_6")
			.get(uri10 + "/I/41gCbfiTdaL._RC|516fcOUE-HL.css,01evdoiemkL.css,01K+Ps1DeEL.css,31pdJv9iSzL.css,01tgK36lpGL.css,11UGC+GXOPL.css,21LK7jaicML.css,11L58Qpo0GL.css,21kyTi1FabL.css,01Xl9KigtzL.css,01YhS3Cs-hL.css,21GwE3cR-yL.css,019SHZnt8RL.css,01wAWQRgXzL.css,21bWcRJYNIL.css,11WgRxUdJRL.css,01dU8+SPlFL.css,11ocrgKoE-L.css,01SHjPML6tL.css,111-D2qRjiL.css,01QrWuRrZ-L.css,310Imb6LqFL.css,11Z1a0FxSIL.css,01Alnvtt1zL.css,21mOLw+nYYL.css,01L8Y-JFEhL.css_.css?AUIClients/AmazonUI")
			.headers(headers_6),
            http("request_7")
			.get(uri10 + "/I/210UtsRqV6L._RC|71dR5W0gVtL.css,11zh5zoa5AL.css,31Yu4XBxpVL.css,21+aU+R3IiL.css,31wWWC6YAvL.css,11G4HxMtMSL.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/AmazonNavigationDesktopMetaAsset")
			.headers(headers_6),
            http("request_8")
			.get(uri10 + "/I/41+7YbWTUkL.css?AUIClients/AmazonGatewayAuiAssets")
			.headers(headers_6),
            http("request_9")
			.get(uri10 + "/G/01/x-locale/redirect-overlay/redirect-overlay-nav-https-20190717._CB442365648_.css")
			.headers(headers_6),
            http("request_10")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/February/Dashboard/Baby120X._CB468850882_SY85_.jpg"),
            http("request_11")
			.get(uri10 + "/G/01/gno/sprites/nav-sprite-global_bluebeacon-1x_optimized_layout1._CB468670774_.png"),
            http("request_12")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/InternationalMarketplace/InternationalMarketplace_Desktop_IN_1X._CB462834117_.jpg"),
            http("request_13")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/February/Dashboard/Toys120X._CB468851693_SY85_.jpg"),
            http("request_14")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/cel_260._SY260_CB442727991_.jpg"),
            http("request_15")
			.get(uri10 + "/G/01/US-hq/2019/img/Certified_Refurbished/XCM_Manual_1170890_desktop_tiles_260x260_Certified_Refurbished_XCM_Manual_1170890_us_certified_refurbished_desktop_tiles_260x260_3_1557752691_jpg._SY260_CB464246645_.jpg"),
            http("request_16")
			.get(uri10 + "/G/01/amazonglobal/images/Fuji/SWM/English/2018/September/Fuji_EN_SWM_TodaysDeals_Sep18._CB484652360_.png"),
            http("request_17")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/February/Dashboard/switch120x._CB468852238_SY85_.jpg"),
            http("request_18")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/February/Dashboard/computer120x._CB468850970_SY85_.jpg"),
            http("request_19")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Currencies_1X_en_US._CB441114205_.jpg"),
            http("request_20")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Deals_2X_en_US._CB440735705_.jpg"),
            http("request_21")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Ship100_1X_en_US._CB440786406_.jpg"),
            http("request_22")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Language_1X_en_US._CB440783573_.jpg"),
            http("request_23")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_ImportFees_1X_en_US._CB440735704_.jpg"),
            http("request_24")
			.get(uri10 + "/I/31XlowZhFDL._AC_SY200_.jpg"),
            http("request_25")
			.get(uri10 + "/I/41uBWDcHdHL.js?AUIClients/AmazonGatewayAuiAssets")
			.headers(headers_25),
            http("request_26")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_TrackPackage_1X_en_US._CB440735646_.jpg"),
            http("request_27")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_SecurePayment_1X_en_US._CB440735707_.jpg"),
            http("request_28")
			.get(uri10 + "/I/41zM2Tgk0OL._AC_SY200_.jpg"),
            http("request_29")
			.get(uri10 + "/I/410MRqhuwKL._AC_SY200_.jpg"),
            http("request_30")
			.get(uri10 + "/I/41J1OkWlWnL._AC_SY200_.jpg"),
            http("request_31")
			.get(uri10 + "/I/51kKwdmAYzL._AC_SY200_.jpg"),
            http("request_32")
			.get(uri10 + "/I/01gMokLtdHL.js?AUIClients/GenericObservableJS")
			.headers(headers_25),
            http("request_33")
			.get(uri10 + "/I/61kzhTBl2qL.js?AUIClients/AmazonUIjQuery")
			.headers(headers_25),
            http("request_34")
			.get(uri10 + "/I/41R9FArsBDL._AC_SY200_.jpg"),
            http("request_35")
			.get(uri10 + "/I/31i3tpuXxxL._AC_SY200_.jpg"),
            http("request_36")
			.get(uri10 + "/I/41h6jz58IvL._AC_SY200_.jpg"),
            http("request_37")
			.get(uri10 + "/I/511M6ML2t7L._AC_SY200_.jpg"),
            http("request_38")
			.get(uri10 + "/I/31tj-WzzMwL._AC_SY200_.jpg"),
            http("request_39")
			.get(uri10 + "/I/513ttWDr7eL._AC_SY200_.jpg"),
            http("request_40")
			.get(uri10 + "/I/41o9DDENLtL._AC_SY200_.jpg"),
            http("request_41")
			.get(uri10 + "/G/01/amazonui/loading/loading-4x._CB391853216_.gif"),
            http("request_42")
			.get(uri10 + "/I/51I%2BteGzpCL._AC_SY200_.jpg"),
            http("request_43")
			.get(uri10 + "/I/51bnVGFpBML._AC_SY200_.jpg"),
            http("request_44")
			.get(uri10 + "/I/41yXE4pZvmL._AC_SY200_.jpg"),
            http("request_45")
			.get(uri10 + "/I/51c9DHPlQQL._AC_SY200_.jpg"),
            http("request_46")
			.get(uri10 + "/I/51pbzBdyDDL._AC_SY200_.jpg"),
            http("request_47")
			.get(uri10 + "/I/41UY4Pnw0SL._AC_SY200_.jpg"),
            http("request_48")
			.get(uri10 + "/I/51%2BSjJDzHfL._AC_SY200_.jpg"),
            http("request_49")
			.get(uri10 + "/I/51i8PRcQe1L._AC_SY200_.jpg"),
            http("request_50")
			.get(uri10 + "/I/41vDDbUotBL._AC_SY200_.jpg"),
            http("request_51")
			.get(uri10 + "/I/51gkl7jeeDL._AC_SY200_.jpg"),
            http("request_52")
			.get(uri10 + "/I/41i8O1V8OxL._AC_SY200_.jpg"),
            http("request_53")
			.get(uri10 + "/I/515uA1og8oL._AC_SY200_.jpg"),
            http("request_54")
			.get(uri10 + "/I/51D7Et9OMdL._AC_SY200_.jpg"),
            http("request_55")
			.get(uri10 + "/I/41ztrGhKb5L._AC_SY200_.jpg"),
            http("request_56")
			.get(uri10 + "/I/51EXcNKQgoL._AC_SY200_.jpg"),
            http("request_57")
			.get(uri10 + "/I/51svo-NudtL._AC_SY200_.jpg"),
            http("request_58")
			.get(uri10 + "/I/31HEn5xo41L._AC_SY200_.jpg"),
            http("request_59")
			.get(uri10 + "/I/41tqrbHa9ZL._AC_SY200_.jpg"),
            http("request_60")
			.get(uri10 + "/I/31OPJV1439L._AC_SY200_.jpg"),
            http("request_61")
			.get(uri10 + "/I/51ZWF-gxYAL._AC_SY200_.jpg"),
            http("request_62")
			.get(uri25 + "/AUIClients/InternationalCustomerPreferencesNavAssets-icp_sprite-7d1bfde38eb13748605e178896ede63a4aa68e0c._V2_.png"),
            http("request_63")
			.get(uri10 + "/I/4174LClPNvL._AC_SY200_.jpg"),
            http("request_64")
			.get(uri10 + "/I/41KpVUxylVL._AC_SY200_.jpg"),
            http("request_65")
			.get(uri25 + "/AUIClients/AmazonUICarousel-arrows-c495a9b59afd9b35a08c12513d40b8c7e7771499._V2_.png"),
            http("request_66")
			.get(uri10 + "/I/31g2EsPYqLL._AC_SY200_.jpg"),
            http("request_67")
			.get(uri10 + "/I/516gPXAOs5L._AC_SY200_.jpg"),
            http("request_68")
			.get(uri25 + "/AUIClients/AmazonUISpinner-spinner_gray_2x-305997434ebd5a72cd3aa598a019fcc6e1efe23a._V2_.gif"),
            http("request_69")
			.get(uri10 + "/I/41gvm-DlPxL._AC_SY200_.jpg"),
            http("request_70")
			.get(uri10 + "/I/41IX99CZ6WL._AC_SY200_.jpg"),
            http("request_71")
			.get(uri10 + "/I/313t01qTlzL._AC_SY200_.jpg"),
            http("request_72")
			.get(uri10 + "/I/414teYAMdjL._AC_SY200_.jpg"),
            http("request_73")
			.get(uri10 + "/I/414jGl7GJTL._AC_SY200_.jpg"),
            http("request_74")
			.get(uri10 + "/I/41-EhqlLSEL._AC_SY200_.jpg"),
            http("request_75")
			.get(uri10 + "/I/21SvI%2B2e4eL._AC_SY200_.jpg"),
            http("request_76")
			.get(uri10 + "/I/41an7u1tzkL._AC_SY200_.jpg"),
            http("request_77")
			.get(uri10 + "/I/51GUIC3ftVL._AC_SY200_.jpg"),
            http("request_78")
			.get(uri10 + "/I/419rEU%2B0KyL._AC_SY200_.jpg"),
            http("request_79")
			.get(uri10 + "/I/61ZJuP6fwgL._AC_SY200_.jpg"),
            http("request_80")
			.get(uri10 + "/I/51SjmLkdUKL._AC_SY200_.jpg"),
            http("request_81")
			.get(uri10 + "/G/01/personalization/ybh/loading-4x-gray._CB317976265_.gif"),
            http("request_82")
			.get(uri10 + "/I/41fV1d6x8iL._AC_SY200_.jpg"),
            http("request_83")
			.get(uri10 + "/I/31S6jpIf+nL.js?AUIClients/AmazonGatewayHerotatorJS")
			.headers(headers_25),
            http("request_84")
			.get(uri10 + "/I/11VbV%2B%2BKhQL.js?AUIClients/RetailWebsiteOverlayAUIAssets")
			.headers(headers_25),
            http("request_85")
			.get(uri10 + "/I/41YUeDE3zHL._RC|71lxsBUfy6L.js,61u3dpzHy+L.js,41W9ohA0e+L.js,11vrNkbdcvL.js,21SHd9g2LAL.js,31xNSJua7KL.js,51YeRc8UK1L.js,31R1liuRRmL.js_.js?AUIClients/AmazonNavigationDesktopMetaAsset")
			.headers(headers_25),
            http("request_86")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fstaticb%26id%3DKZACB4BCRPWSQ2CXX97F:0"),
            http("request_87")
			.get(uri10 + "/I/11-BZEJ8lnL._RC|61GQ9IdK7HL.js,21Of0-9HPCL.js,012FVc3131L.js,119KAWlHU6L.js,51xL2QLv4YL.js,11AHlQhPRjL.js,016iHgpF74L.js,11aNYFFS5hL.js,116tgw9TSaL.js,211-p4GRUCL.js,01PoLXBDXWL.js,61BanVD+50L.js,01mi-J86cyL.js,11WhBvHM7eL.js,31UWuPgtTtL.js,01rpauTep4L.js,01iyxuSGj4L.js,018kT7oogLL.js_.js?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_88")
			.get(uri10 + "/I/31K9Wbsn%2BKL._AC_SY200_.jpg"),
            http("request_89")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_CS_1X_en_US._CB440735705_.jpg"),
            http("request_90")
			.get(uri10 + "/I/415vAS0SRLL._AC_SY200_.jpg"),
            http("request_91")
			.get(uri10 + "/I/51ZPRXJOQ3L._AC_SY200_.jpg"),
            http("request_92")
			.get(uri10 + "/I/41QHaDbCTaL._AC_SY200_.jpg"),
            http("request_93")
			.get(uri10 + "/I/41DtVFoa8TL._AC_SY200_.jpg"),
            http("request_94")
			.get(uri10 + "/I/31FJ-IwYMgL._AC_SY200_.jpg"),
            http("request_95")
			.get(uri10 + "/I/3181OApGFfL._AC_SY200_.jpg"),
            http("request_96")
			.get(uri10 + "/I/51AjFs0WzpL._AC_SY200_.jpg"),
            http("request_97")
			.get(uri10 + "/I/41kaOFDXzSL._AC_SY200_.jpg"),
            http("request_98")
			.get(uri10 + "/I/515IAQsQGjL._AC_SY200_.jpg"),
            http("request_99")
			.get(uri10 + "/I/31AZvhYLyeL._AC_SY200_.jpg"),
            http("request_100")
			.get(uri10 + "/I/51JZvav6OoL._AC_SY200_.jpg"),
            http("request_101")
			.get(uri10 + "/I/31qwualUaLL._AC_SY200_.jpg"),
            http("request_102")
			.get(uri10 + "/I/51lSZZf-1UL._AC_SY200_.jpg"),
            http("request_103")
			.get(uri10 + "/I/51lP1uY8fuL._AC_SY200_.jpg"),
            http("request_104")
			.get(uri10 + "/I/31jWncwacjL._AC_SY200_.jpg"),
            http("request_105")
			.get(uri10 + "/I/51%2BjyE6JR1L._AC_SY200_.jpg"),
            http("request_106")
			.get(uri10 + "/I/51dtk9gmSuL._AC_SY200_.jpg"),
            http("request_107")
			.get(uri10 + "/I/51NV8Uil7wL._AC_SY200_.jpg"),
            http("request_108")
			.get(uri10 + "/I/61DtwsUMlVL._AC_SY200_.jpg"),
            http("request_109")
			.get(uri10 + "/I/51UN5ccVvzL._AC_SY200_.jpg"),
            http("request_110")
			.get(uri10 + "/I/51aaJKH2KnL._AC_SY200_.jpg"),
            http("request_111")
			.get(uri10 + "/I/51EDqK3ZMBL._AC_SY200_.jpg"),
            http("request_112")
			.get(uri10 + "/I/51h-o5EjEXL._AC_SY200_.jpg"),
            http("request_113")
			.get(uri10 + "/I/51gDLYvqWfL._AC_SY200_.jpg"),
            http("request_114")
			.get(uri10 + "/I/51IyAvuNtUL._AC_SY200_.jpg"),
            http("request_115")
			.get(uri10 + "/I/51TS77D7hFL._AC_SY200_.jpg"),
            http("request_116")
			.get(uri10 + "/I/41oDV%2BBve5L._AC_SY200_.jpg"),
            http("request_117")
			.get(uri10 + "/I/51GWbs5CNDL._AC_SY200_.jpg"),
            http("request_118")
			.get(uri10 + "/I/41L5-insbRL._AC_SY200_.jpg"),
            http("request_119")
			.get(uri10 + "/I/410glGz65uL._AC_SY200_.jpg"),
            http("request_120")
			.get(uri10 + "/I/41-oL82ubgL._AC_SY200_.jpg"),
            http("request_121")
			.get(uri10 + "/I/511gOXJIAiL._AC_SY200_.jpg"),
            http("request_122")
			.get(uri10 + "/I/41W8I18G9bL._AC_SY200_.jpg"),
            http("request_123")
			.get(uri10 + "/I/419v9MV5mwL._AC_SY200_.jpg"),
            http("request_124")
			.get(uri10 + "/I/31DKkvHtG1L._AC_SY200_.jpg"),
            http("request_125")
			.get(uri10 + "/I/510zhES3X%2BL._AC_SY200_.jpg"),
            http("request_126")
			.get(uri10 + "/I/41IjL6rfJVL._AC_SY200_.jpg"),
            http("request_127")
			.get(uri10 + "/I/41tCCriO5dL._AC_SY200_.jpg"),
            http("request_128")
			.get(uri10 + "/I/41DZD3WcZhL._AC_SY200_.jpg"),
            http("request_129")
			.get(uri10 + "/I/414KRBMS0iL._AC_SY200_.jpg"),
            http("request_130")
			.get(uri10 + "/I/41ucIHK-PXL._AC_SY200_.jpg"),
            http("request_131")
			.get(uri10 + "/I/51Dtpjcy3oL._AC_SY200_.jpg"),
            http("request_132")
			.get(uri10 + "/I/41G9TU14OQL._AC_SY200_.jpg"),
            http("request_133")
			.get(uri10 + "/I/41txJJ4JnLL._AC_SY200_.jpg"),
            http("request_134")
			.get(uri10 + "/I/41EenIzK9VL._AC_SY200_.jpg"),
            http("request_135")
			.get(uri10 + "/I/51lk4UAr95L._AC_SY200_.jpg"),
            http("request_136")
			.get(uri10 + "/I/31d99dG%2B00L._AC_SY200_.jpg"),
            http("request_137")
			.get(uri10 + "/I/31cwC4PHpRL._AC_SY200_.jpg"),
            http("request_138")
			.get(uri10 + "/I/31PHk3KDzoL._AC_SY200_.jpg"),
            http("request_139")
			.get(uri10 + "/I/41GQo4Z9rIL._AC_SY200_.jpg"),
            http("request_140")
			.get(uri10 + "/I/31eiNDQs8FL._AC_SY200_.jpg"),
            http("request_141")
			.get(uri10 + "/I/418QYKtmg0L._AC_SY200_.jpg"),
            http("request_142")
			.get(uri10 + "/I/31bg5sduOSL._AC_SY200_.jpg"),
            http("request_143")
			.get(uri10 + "/I/410fkbd%2BzxL._AC_SY200_.jpg"),
            http("request_144")
			.get(uri10 + "/I/318YLyDHMnL._AC_SY200_.jpg"),
            http("request_145")
			.get(uri10 + "/I/41U8HIhsZkL._AC_SY200_.jpg"),
            http("request_146")
			.get(uri10 + "/I/310jp7fhDGL._AC_SY200_.jpg"),
            http("request_147")
			.get(uri10 + "/I/31-9%2BcTF3CL._AC_SY200_.jpg"),
            http("request_148")
			.get(uri10 + "/I/61LoiAl0OPL._AC_SY200_.jpg"),
            http("request_149")
			.get(uri10 + "/I/51iqVewZTwL._AC_SY200_.jpg"),
            http("request_150")
			.get(uri10 + "/I/517ZASqqVdL._AC_SY200_.jpg"),
            http("request_151")
			.get(uri10 + "/I/51-tQsDWVqL._AC_SY200_.jpg"),
            http("request_152")
			.get(uri10 + "/I/61MP7ByMmIL._AC_SY200_.jpg"),
            http("request_153")
			.get(uri10 + "/I/51ZlymScAQL._AC_SY200_.jpg"),
            http("request_154")
			.post(uri15 + "/ah/ajax/counter?ctr=desktop_ajax_atf&exp=1564815156262&rId=KZACB4BCRPWSQ2CXX97F&mkId=ATVPDKIKX0DER&h=a4b4780b69926302a8d3b27660ccecc53acdca97e6862d85fbbee38c8ea7730b")
			.headers(headers_154),
            http("request_155")
			.get(uri25 + "/AUIClients/AmazonGatewayAuiAssets-gw_sprite_desktop-25075f36f083535bad9a2e0edabbb339435e8e65._V2_.png"),
            http("request_156")
			.get(uri10 + "/G/01/AmazonExports/Projects/Amber/Fuji_Hero_Amber_en_US_1X._CB441989098_.jpg"),
            http("request_157")
			.get(uri10 + "/G/01/AMAZON_FASHION/2019/EDITORIAL/SUM1/AF_GW/DHERO/DH_W_J_ShellYes_1x._CB463092559_.jpg"),
            http("request_158")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/April/Hero/Hero_Currency_EN_1X._CB466692681_.jpg"),
            http("request_159")
			.post(uri15 + "/gp/redirection/canada.html")
			.headers(headers_154)
			.formParam("path", "/")
			.formParam("queryString", "?ie=UTF8")
			.formParam("pageType", "Gateway")
			.formParam("referer", ""),
            http("request_160")
			.get(uri15 + "/empty.gif?1564815038471"),
            http("request_161")
			.get(uri15 + "/gp/prime/digital-adoption/navigation-bar/132-0340626-5925042?type=load&isPrime=false&referrer=&height=654&width=1349&_=1564815038498")
			.headers(headers_161),
            http("request_162")
			.get(uri10 + "/G/01/AUIClients/ClientSideMetricsAUIJavascript@jserrorsForester.10f2559e93ec589d92509318a7e2acbac74c343a._V2_.js")
			.headers(headers_25),
            http("request_163")
			.get(uri15 + "/gp/glow/get-toaster.html?aisTransitionState=IN&pageType=Gateway&storeName=generic&rancorLocationSource=IP_GEOLOCATION&_=1564815038684")
			.headers(headers_163),
            http("request_164")
			.post(uri12)
			.headers(headers_164)
			.body(RawFileBody("/recordrenuka/0164_request.txt")),
            http("request_165")
			.get(uri25 + "/csm/showads.v2.js")
			.headers(headers_25),
            http("request_166")
			.post(uri15 + "/gp/overlay/display.html")
			.headers(headers_163)
			.formParam("origSessionId", "132-0340626-5925042")
			.formParam("subPageType", "null")
			.formParam("pageType", "Gateway")
			.formParam("ASIN", "null")
			.formParam("path", "/")
			.formParam("isAUI", "1")
			.formParam("referrer", "")
			.formParam("queryString", ""),
            http("request_167")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26sw%3D1366%26sh%3D768%26vw%3D1349%26vh%3D654%26m%3D1%26sc%3DKZACB4BCRPWSQ2CXX97F%26ue%3D5%26bb%3D282%26ns%3D286%26be%3D485%26cf%3D849%26ne%3D850%26af%3D948%26fn%3D948%26pc%3D2927%26tc%3D-2205%26na_%3D-2205%26ul_%3D-1564815036579%26_ul%3D-1564815036579%26rd_%3D-1564815036579%26_rd%3D-1564815036579%26fe_%3D-1074%26lk_%3D-1070%26_lk%3D-1070%26co_%3D-1070%26_co%3D-1070%26sc_%3D-2205%26rq_%3D-1070%26rs_%3D-979%26_rs%3D-61%26dl_%3D-55%26di_%3D536%26de_%3D675%26_de%3D675%26_dc%3D2917%26ld_%3D2917%26_ld%3D-1564815036579%26ntd%3D-9%26ty%3D0%26rc%3D0%26hob%3D1%26hoe%3D5%26ld%3D2927%26t%3D1564815039506%26ctb%3D1%26rt%3Dcf%3A55-3-4-48-1-0-1_af%3A67-3-4-60-1-0-1_ld%3A151-7-4-138-3-0-1%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.19.4-2019-07-24%7Cnavbar%7Cfls-na%7CgwCFImgNoCache%7Ccsm-feature-touch-enabled%3Afalse%7Ciss-on-time%26viz%3Dvisible%3A3%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1%26ui%3D2:2934"),
            http("request_168")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-3-active%26cf0%3D2939%26pc0%3D2939%26ld0%3D2939%26t0%3D1564815039518%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2939"),
            http("request_169")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-4-active%26cf0%3D2939%26pc0%3D2939%26ld0%3D2939%26t0%3D1564815039518%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2939"),
            http("request_170")
			.get(uri15 + "/gp/uedata?ld&v=0.204717.0&id=KZACB4BCRPWSQ2CXX97F&sw=1366&sh=768&vw=1349&vh=654&m=1&sc=KZACB4BCRPWSQ2CXX97F&ue=5&bb=282&ns=286&be=485&cf=849&ne=850&af=948&fn=948&pc=2927&tc=-2205&na_=-2205&ul_=-1564815036579&_ul=-1564815036579&rd_=-1564815036579&_rd=-1564815036579&fe_=-1074&lk_=-1070&_lk=-1070&co_=-1070&_co=-1070&sc_=-2205&rq_=-1070&rs_=-979&_rs=-61&dl_=-55&di_=536&de_=675&_de=675&_dc=2917&ld_=2917&_ld=-1564815036579&ntd=-9&ty=0&rc=0&hob=1&hoe=5&ld=2927&t=1564815039506&ctb=1&rt=cf:55-3-4-48-1-0-1_af:67-3-4-60-1-0-1_ld:151-7-4-138-3-0-1&csmtags=aui|aui:aui_build_date:3.19.4-2019-07-24|navbar|fls-na|gwCFImgNoCache|csm-feature-touch-enabled:false|iss-on-time&viz=visible:3&pty=Gateway&spty=desktop&pti=desktop&tid=KZACB4BCRPWSQ2CXX97F&aftb=1&ui=2"),
            http("request_171")
			.get(uri15 + "/favicon.ico"),
            http("request_172")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26sc0%3Dportal-bb%26pc0%3D1%26ld0%3D1%26t0%3D1564815036863%26sc1%3Diss-init-pc%26bb1%3D290%26cf1%3D2005%26be1%3D2005%26pc1%3D2005%26ld1%3D2005%26t1%3D1564815038584%26sc2%3Dh1Af%26cf2%3D300%26pc2%3D300%26ld2%3D300%26t2%3D1564815036879%26sc3%3Ddesktop-banner-stripe-visible%26cf3%3D301%26pc3%3D302%26ld3%3D302%26t3%3D1564815036881%26sc4%3Ddesktop-grid-4-visible%26cf4%3D304%26pc4%3D304%26ld4%3D304%26t4%3D1564815036883%26sc5%3Ddesktop-grid-4-active%26cf5%3D313%26pc5%3D314%26ld5%3D314%26t5%3D1564815036893%26sc6%3DcsmCELLSframework%26bb6%3D486%26pc6%3D486%26ld6%3D486%26t6%3D1564815037065%26sc7%3DcsmCELLSpdm%26bb7%3D486%26pc7%3D540%26ld7%3D540%26t7%3D1564815037119%26sc8%3DcsmCELLSvpm%26bb8%3D540%26pc8%3D540%26ld8%3D540%26t8%3D1564815037119%26sc9%3DcsmCELLSfem%26bb9%3D541%26pc9%3D541%26ld9%3D541%26t9%3D1564815037120%26sc10%3Due_sushi_v1%26bb10%3D542%26pc10%3D543%26ld10%3D543%26t10%3D1564815037122%26sc11%3Ddesktop-grid-1-visible%26cf11%3D850%26pc11%3D850%26ld11%3D850%26t11%3D1564815037429%26sc12%3Ddesktop-grid-2-visible%26cf12%3D851%26pc12%3D851%26ld12%3D851%26t12%3D1564815037430%26sc13%3Ddesktop-grid-3-visible%26cf13%3D851%26pc13%3D851%26ld13%3D851%26t13%3D1564815037430%26sc14%3Ddesktop-top-visible%26cf14%3D948%26pc14%3D948%26ld14%3D948%26t14%3D1564815037527%26sc15%3DspLoadJs%26cf15%3D949%26pc15%3D949%26ld15%3D949%26t15%3D1564815037528%26sc16%3Dgateway-asset-load%26cf16%3D1096%26pc16%3D1096%26ld16%3D1096%26t16%3D1564815037675%26sc17%3DjQueryReady%26cf17%3D1096%26pc17%3D1096%26ld17%3D1096%26t17%3D1564815037675%26sc18%3DnavCF%26cf18%3D1102%26pc18%3D1102%26ld18%3D1102%26t18%3D1564815037681%26sc19%3DgwGridInit%26cf19%3D1110%26pc19%3D1110%26ld19%3D1110%26t19%3D1564815037689%26sc20%3DgwBTFGridInit%26cf20%3D1115%26pc20%3D1115%26ld20%3D1115%26t20%3D1564815037694%26sc21%3Ddesktop-1-visible%26cf21%3D1179%26pc21%3D1179%26ld21%3D1179%26t21%3D1564815037758%26sc22%3Ddesktop-2-visible%26cf22%3D1189%26pc22%3D1189%26ld22%3D1189%26t22%3D1564815037768%26sc23%3Ddesktop-3-visible%26cf23%3D1207%26pc23%3D1208%26ld23%3D1208%26t23%3D1564815037787%26sc24%3Ddesktop-4-visible%26cf24%3D1218%26pc24%3D1218%26ld24%3D1218%26t24%3D1564815037797%26sc25%3Ddesktop-5-visible%26cf25%3D1228%26pc25%3D1228%26ld25%3D1228%26t25%3D1564815037807%26sc26%3Ddesktop-6-visible%26cf26%3D1240%26pc26%3D1240%26ld26%3D1240%26t26%3D1564815037819%26sc27%3Ddesktop-7-visible%26cf27%3D1253%26pc27%3D1253%26ld27%3D1253%26t27%3D1564815037832%26sc28%3DgwLayoutReady%26cf28%3D1951%26pc28%3D1951%26ld28%3D1951%26t28%3D1564815038530%26sc29%3DgwAUIReady%26cf29%3D1956%26pc29%3D1956%26ld29%3D1956%26t29%3D1564815038535%26sc30%3Dgw-hero-btf-populate%26cf30%3D2197%26pc30%3D2197%26ld30%3D2197%26t30%3D1564815038776%26sc31%3DgwHerotatorActive%26cf31%3D2213%26pc31%3D2213%26ld31%3D2213%26t31%3D1564815038792%26ctb%3D1:2934"),
            http("request_173")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3DjQueryDomReady%26cf0%3D2937%26pc0%3D2937%26ld0%3D2937%26t0%3D1564815039516%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2937"),
            http("request_174")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-top-active%26cf0%3D2938%26pc0%3D2938%26ld0%3D2938%26t0%3D1564815039517%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2938"),
            http("request_175")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-5-active%26cf0%3D2940%26pc0%3D2940%26ld0%3D2940%26t0%3D1564815039519%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2940"),
            http("request_176")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-1-active%26cf0%3D2938%26pc0%3D2938%26ld0%3D2938%26t0%3D1564815039517%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2938"),
            http("request_177")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-2-active%26cf0%3D2938%26pc0%3D2938%26ld0%3D2938%26t0%3D1564815039517%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2938"),
            http("request_178")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-6-active%26cf0%3D2940%26pc0%3D2940%26ld0%3D2940%26t0%3D1564815039519%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2940"),
            http("request_179")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3Ddesktop-7-active%26cf0%3D2940%26pc0%3D2940%26ld0%3D2940%26t0%3D1564815039519%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2941"),
            http("request_180")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:KZACB4BCRPWSQ2CXX97F$uedata=s:%2Fgp%2Fuedata%3Fld%26v%3D0.204717.0%26id%3DKZACB4BCRPWSQ2CXX97F%26ctb%3D1%26sc0%3DjQueryWindowLoad%26cf0%3D2941%26pc0%3D2943%26ld0%3D2948%26t0%3D1564815039527%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2948"),
            http("request_181")
			.post(uri15 + "/gp/product/sessionCacheUpdateHandler.html")
			.headers(headers_154)
			.formParam("sessionCacheUpdateFlag", "1")
			.formParam("pageType", "Gateway")
			.formParam("browserWidth", "1349")
			.formParam("browserHeight", "654")
			.formParam("token", "fVoboEDsYMjWCjzTN8sCObLZif2/oaBmQ3S2N5KuRr8=")))
		.pause(3)
		.exec(http("request_182")
			.head(uri10 + "/G/01/AmazonExports/Fuji/2019/InternationalMarketplace/InternationalMarketplace_Desktop_IN_1X._CB462834117_.jpg")
			.headers(headers_25)
			.resources(http("request_183")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_rg-cc7ebaa05a2cd3b02c0929ac0475a44ab30b7efa._V2_.woff2")
			.headers(headers_183),
            http("request_184")
			.head(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_SecurePayment_1X_en_US._CB440735707_.jpg")
			.headers(headers_25),
            http("request_185")
			.head(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_ImportFees_1X_en_US._CB440735704_.jpg")
			.headers(headers_25),
            http("request_186")
			.head(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Ship100_1X_en_US._CB440786406_.jpg")
			.headers(headers_25),
            http("request_187")
			.head(uri10 + "/G/01/AmazonExports/Fuji/2019/July/BubbleShoveler/Fuji_Bubble_Currencies_1X_en_US._CB441114205_.jpg")
			.headers(headers_25),
            http("request_188")
			.get(uri10 + "/G/01/x-locale/checkout/signin-banner._CB356015500_.gif")
			.headers(headers_188),
            http("request_189")
			.get(uri10 + "/G/01/authportal/common/css/ap-checkout-frn._CB319237959_.css")
			.headers(headers_25),
            http("request_190")
			.get(uri10 + "/G/01/nav2/gamma/accessoriesCSS/US/combined-3689044428._CB189697042_.css")
			.headers(headers_25),
            http("request_191")
			.get(uri10 + "/I/61nWue9aMgL._RC|210LbiKyCML.css,31j6BOPjmzL.css,01zWxM9Vh0L.css,41bCmfUZAIL.css,219oCRGl-sL.css,212hS9k0-iL.css,11h8y826C1L.css,31dTK1hHb6L.css,21W5fiSj06L.css,31Wg0ai095L.css,11Z7S+lK47L.css,01NW8VTUeVL.css,011uHgmxBfL.css,21zZrVyNRgL.css,31j4n5vuY7L.css,31SN3jkqdEL.css,21Wf53xZ5jL.css,01OhA16ND1L.css,01U22TK7kxL.css,01tBHVauY+L.css,01BwcPgON+L.css,4141SCbgXGL.css,01YwSO+Cb3L.css,217hKFTenEL.css,21Y7AgzPf6L.css,01qwEWNuxuL.css,21qxDmhZV3L.css,11XXguyjjZL.css,31LPDlue2jL.css,01clde05tlL.css,01AT3O0C6cL.css,01vF6gFybxL.css_.css?AUIClients/USHardlinesDetailPageMetaAssetVariable_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_192")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_rg-8a9db402d8966ae93717c348b9ab0bd08703a7a7._V2_.woff")
			.headers(headers_183),
            http("request_193")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_rgit-a4dc98d644ff2aedd41da3da462f09ffce86eafb._V2_.woff")
			.headers(headers_183),
            http("request_194")
			.get(uri10 + "/G/01/x-locale/cs/projects/text-trace/texttrace_typ._CB353754787_.js")
			.headers(headers_25),
            http("request_195")
			.get(uri10 + "/G/01/nav2/gamma/websiteGridCSS/websiteGridCSS-websiteGridCSS-48346.css._CB176526456_.css")
			.headers(headers_25),
            http("request_196")
			.get(uri10 + "/G/01/authportal/flex/reduced-nav/ap-flex-reduced-nav-2.1._CB343920894_.css")
			.headers(headers_25),
            http("request_197")
			.get(uri10 + "/G/01/x-locale/common/login/fwcim._CB454428048_.js")
			.headers(headers_25),
            http("request_198")
			.get(uri10 + "/G/01/gno/images/general/navAmazonLogoFooter._CB169459313_.gif")
			.headers(headers_188),
            http("request_199")
			.get(uri10 + "/G/01/x-locale/personalization/yourstore/js/ratings-bar-366177._CB204593665_.js")
			.headers(headers_25),
            http("request_200")
			.get(uri10 + "/I/41fMrDoAFbL._RC|713XYSQZReL.js,61qWn4HFtuL.js,41W9ohA0e+L.js,11vrNkbdcvL.js,21SHd9g2LAL.js,311T8Q1zWKL.js,51+klsvwgqL.js,31IEOtBPX+L.js_.js?AUIClients/AmazonNavigationDesktopMetaAsset")
			.headers(headers_25),
            http("request_201")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_bd-b605252f87b8b3df5ae206596dac0938fc5888bc._V2_.woff")
			.headers(headers_183),
            http("request_202")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_bdit-57598ce426a612be5a1d15eee08252668fca5e7a._V2_.woff")
			.headers(headers_183),
            http("request_203")
			.get(uri10 + "/I/01Re6AqkVUL._RC|218rehcHYxL.js,118Say7HIZL.js,21E2aIDj6DL.js,41ybh3DZRmL.js,01g2etah0NL.js,31selSsN+1L.js,413u98XONQL.js,21hEt8rUbxL.js,51+io-0L8GL.js,01I-WWW2CuL.js,01AdYLY9rHL.js,01IOMCsVFCL.js,0185ITV0M6L.js,41DfHGdXUeL.js,21Ru4ioY6pL.js,01nnV9HCzgL.js,11f-8VjN-KL.js,71LEtO5Vv5L.js,01OrQ5AXqsL.js,31UjTApGOPL.js,01LHJt5PiyL.js,31Ac-cQ+ZWL.js,01VgEfU-GFL.js,01HmcbFsnFL.js,31sG+M5QN5L.js,11AVRVWTouL.js,11MQqFPEK+L.js,11G4c43OZvL.js,11gAPPElxuL.js,01X2zigX4kL.js,01OtvpwikQL.js,31qUdoxPE8L.js,01t2esUHF0L.js,01ZF+ovNflL.js,21PR-xiFCvL.js,61IqhqU9RvL.js,21YW9LKF2zL.js,21mymEONFtL.js,61no9IDtPrL.js,21OJDARBhQL.js,41s+OBPxTPL.js,516ZYb92ZBL.js,01IWUb29Q4L.js,11XCwN4o30L.js,01JzE3-DfLL.js,01YivelYW5L.js,016QFWAAdML.js,31NuG3-7xRL.js,011bX2ciJbL.js,21222B+rAzL.js,01gp3oqpb5L.js,31ItJPFyotL.js,21Hdm8NSZEL.js,01NGbPzAzBL.js,01NKGaW0w5L.js,01rEmdLLpxL.js,31bEXnVglKL.js,019W6kk1gjL.js,01hkseOXj6L.js,01mb5sKwNML.js,01yx6A7MuUL.js,51Ov-1jSvdL.js,21Yd5MhMsgL.js,01SRt0+qyqL.js_.js?AUIClients/USSoftlinesDetailPageMetaAsset_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_204")
			.post(uri23 + "/OE/")
			.headers(headers_164)
			.body(RawFileBody("/recordrenuka/0204_request.txt")),
            http("request_205")
			.post(uri12)
			.headers(headers_164)
			.body(RawFileBody("/recordrenuka/0205_request.txt")),
            http("request_206")
			.get(uri10 + "/G/01/x-locale/cs/orders/images/amazon-gc-100._CB192250695_.gif")
			.headers(headers_188),
            http("request_207")
			.get(uri10 + "/G/01/x-locale/communities/profile/customer-popover/script-13-min._CB224617671_.js")
			.headers(headers_25),
            http("request_208")
			.get(uri10 + "/G/01/x-locale/communities/profile/customer-popover/style-3._CB248984170_.css")
			.headers(headers_25),
            http("request_209")
			.get(uri10 + "/G/01/x-locale/cs/ya/images/new-link._CB192250664_.gif")
			.headers(headers_188),
            http("request_210")
			.get(uri10 + "/G/01/authportal/common/css/ap_global._CB318885489_.css")
			.headers(headers_25),
            http("request_211")
			.get(uri10 + "/G/01/x-locale/communities/profile/customer-popover/style-4._CB196325517_.css")
			.headers(headers_25),
            http("request_212")
			.get(uri10 + "/G/01/javascripts/lib/jquery/jquery-1.2.6.min._CB253690767_.js")
			.headers(headers_25),
            http("request_213")
			.get(uri10 + "/G/01/x-locale/cs/orders/images/acorn._CB192250692_.gif")
			.headers(headers_188),
            http("request_214")
			.get(uri10 + "/I/218rehcHYxL._RC|118Say7HIZL.js,21E2aIDj6DL.js,31qUdoxPE8L.js,41COmOfIQhL.js,31bEXnVglKL.js,31Gy8EGyyiL.js,41CV0dDW3VL.js,21NDIsf0a1L.js,015TRQC5i+L.js,61YT+iDMaXL.js,01lcH4zcTaL.js,01OtvpwikQL.js,21oXfLY3ypL.js,01qwoVEkKlL.js,01g2etah0NL.js,21bSviTzsOL.js,01t2esUHF0L.js,11wTwl+500L.js,61IqhqU9RvL.js,11XCwN4o30L.js,01YivelYW5L.js,016QFWAAdML.js,41Eko5EJ6TL.js,11Gx+6S5O-L.js,31W3ZjNTKKL.js,41FXCYfSyrL.js,31NuG3-7xRL.js,31ZS5TQVWDL.js,51j+bRqtq5L.js,01IQoRXvpnL.js,011bX2ciJbL.js,21222B+rAzL.js,01gp3oqpb5L.js,31ItJPFyotL.js,21Hdm8NSZEL.js,01NGbPzAzBL.js,011kwg0OTQL.js,01jLpHmb92L.js,014kCoIHgIL.js,019W6kk1gjL.js,01hkseOXj6L.js,01yx6A7MuUL.js,01mb5sKwNML.js,51Ov-1jSvdL.js,21Yd5MhMsgL.js,01SRt0+qyqL.js_.js?AUIClients/USHardlinesDetailPageMetaAssetVariable_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_215")
			.post(uri23 + "/OE/")
			.headers(headers_164)
			.body(RawFileBody("/recordrenuka/0215_request.txt")),
            http("request_216")
			.get(uri10 + "/G/01/authportal/common/js/ap-checkout-frn._CB309092179_.js")
			.headers(headers_25),
            http("request_217")
			.get(uri10 + "/G/01/x-locale/common/errors-alerts/error-styles-ssl._CB219086192_.css")
			.headers(headers_25),
            http("request_218")
			.get(uri10 + "/I/41gCbfiTdaL._RC|516fcOUE-HL.css,01evdoiemkL.css,01K+Ps1DeEL.css,31pdJv9iSzL.css,01tgK36lpGL.css,11UGC+GXOPL.css,21LK7jaicML.css,11L58Qpo0GL.css,21kyTi1FabL.css,01Xl9KigtzL.css,01YhS3Cs-hL.css,21GwE3cR-yL.css,019SHZnt8RL.css,01wAWQRgXzL.css,21bWcRJYNIL.css,11WgRxUdJRL.css,01dU8+SPlFL.css,11ocrgKoE-L.css,01SHjPML6tL.css,111-D2qRjiL.css,01QrWuRrZ-L.css,310Imb6LqFL.css,11Z1a0FxSIL.css,01Alnvtt1zL.css,21mOLw+nYYL.css,01L8Y-JFEhL.css_.css?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_219")
			.get(uri10 + "/G/01/x-locale/cs/orders/images/amazon-gcs-100._CB192250695_.gif")
			.headers(headers_188),
            http("request_220")
			.get(uri10 + "/I/51JP18NIwPL._RC|51D0EMWgTLL.css,01Q48KXvqCL.css,01K+Ps1DeEL.css,41ibHftuUXL.css,01x8BQfKtRL.css,11W1qxAlXLL.css,21VGMbCbf7L.css,11BHZ0bWckL.css,21ugv+CDRhL.css,012b9hnMFKL.css,01YhS3Cs-hL.css,21R-IHth0oL.css,01O8SHk5fgL.css,01T0I3IjgPL.css,21Upd-ZcZBL.css,11X17kCPZNL.css,01IZMVtllgL.css,11OIOt1XidL.css,011W31jTTCL.css,11AW5f+T2iL.css,01eaBDnVntL.css,31rwK42HApL.css,11YBKEDeqQL.css,01Alnvtt1zL.css,21kZwnjgOSL.css,011NpBFJsoL.css_.css?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_221")
			.get(uri10 + "/G/01/authportal/common/js/ap_global-1.1._CB306317608_.js")
			.headers(headers_25),
            http("request_222")
			.get(uri10 + "/G/01/common/sprites/sprite-communities._V136632413_.png")
			.headers(headers_188),
            http("request_223")
			.get(uri10 + "/G/01/authportal/common/images/amazon_logo_no-org_mid._CB153387053_.png")
			.headers(headers_188),
            http("request_224")
			.get(uri10 + "/G/01/x-locale/common/transparent-pixel._CB386942464_.gif")
			.headers(headers_188),
            http("request_225")
			.get(uri10 + "/G/01/x-locale/common/buttons/sign-in-secure._CB192194766_.gif")
			.headers(headers_188),
            http("request_226")
			.get(uri10 + "/I/61kzhTBl2qL._RC|11-BZEJ8lnL.js,61GQ9IdK7HL.js,21Of0-9HPCL.js,012FVc3131L.js,119KAWlHU6L.js,51xL2QLv4YL.js,11AHlQhPRjL.js,016iHgpF74L.js,11aNYFFS5hL.js,116tgw9TSaL.js,211-p4GRUCL.js,01PoLXBDXWL.js,61BanVD+50L.js,01mi-J86cyL.js,11WhBvHM7eL.js,31UWuPgtTtL.js,01rpauTep4L.js,01iyxuSGj4L.js,018kT7oogLL.js_.js?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_227")
			.get(uri10 + "/I/51za1s8qEiL._RC|31j6BOPjmzL.css,01ekIXTj5kL.css,0143vbaqMnL.css,01D-B-OeNDL.css,01KvCqKMBgL.css,21ckusqmu6L.css,210LbiKyCML.css,11MXghh1eBL.css,016ZWeUMVEL.css,31MkQHV3gaL.css,314gb2LkLML.css,01FtAuFRr3L.css,01RRH0yFa4L.css,01NW8VTUeVL.css,01rgQ3jqo7L.css,21jNhNxHFBL.css,01zWxM9Vh0L.css,011uHgmxBfL.css,01zmYtfbgDL.css,219oCRGl-sL.css,212hS9k0-iL.css,31TJtSmBkXL.css,21PjfsP9YvL.css,01wsp46SQTL.css,31SN3jkqdEL.css,01kwuiPOKIL.css,41fK6fT1tqL.css,01kymrLkG9L.css,21Wf53xZ5jL.css,01-8BURvQmL.css,01vF6gFybxL.css_.css?AUIClients/USMediaDetailPageMetaAsset_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_228")
			.get(uri10 + "/I/01Re6AqkVUL._RC|21E2aIDj6DL.js,41ybh3DZRmL.js,01g2etah0NL.js,0185ITV0M6L.js,41DfHGdXUeL.js,31selSsN+1L.js,413u98XONQL.js,218rehcHYxL.js,118Say7HIZL.js,21FBJlPfM6L.js,11f-8VjN-KL.js,01nCGM4u+qL.js,71LEtO5Vv5L.js,31UjTApGOPL.js,01LHJt5PiyL.js,31Ac-cQ+ZWL.js,01VgEfU-GFL.js,11MQqFPEK+L.js,01X2zigX4kL.js,21JtT0mJXEL.js,31vMFUg376L.js,01OtvpwikQL.js,31qUdoxPE8L.js,217XOv1WjVL.js,31bEXnVglKL.js,31Gy8EGyyiL.js,11p0nLfNCcL.js,11iHZuQapKL.js,01t2esUHF0L.js,01GhKb2usNL.js,61IqhqU9RvL.js,21YW9LKF2zL.js,21mymEONFtL.js,61no9IDtPrL.js,21OJDARBhQL.js,41s+OBPxTPL.js,516ZYb92ZBL.js,01IWUb29Q4L.js,11XCwN4o30L.js,01VEXCxz+aL.js,01JzE3-DfLL.js,016QFWAAdML.js,31NuG3-7xRL.js,019W6kk1gjL.js,01hkseOXj6L.js,01yx6A7MuUL.js,51Ov-1jSvdL.js,21Yd5MhMsgL.js,01SRt0+qyqL.js_.js?AUIClients/USMediaDetailPageMetaAsset_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_229")
			.get(uri10 + "/I/61kzhTBl2qL._RC|11-BZEJ8lnL.js,61ZlOK692aL.js,21Of0-9HPCL.js,012FVc3131L.js,119KAWlHU6L.js,51xL2QLv4YL.js,11AHlQhPRjL.js,016iHgpF74L.js,11bt9oJdqWL.js,116tgw9TSaL.js,211-p4GRUCL.js,01PoLXBDXWL.js,61CHawqrq1L.js,01mi-J86cyL.js,11WhBvHM7eL.js,31UWuPgtTtL.js,01rpauTep4L.js,01iyxuSGj4L.js,01ZJpGIwkoL.js_.js?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_230")
			.get(uri10 + "/G/01/browser-scripts/dpSpritesCSS/US-secure-combined-3520421511._CB358605974_.css")
			.headers(headers_25),
            http("request_231")
			.get(uri10 + "/G/01/x-locale/cs/css/images/amznbtn-sprite03._CB387356454_.png")
			.headers(headers_188),
            http("request_232")
			.get(uri10 + "/G/01/x-locale/communities/social/snwicons_v2._CB369764580_.png")
			.headers(headers_188),
            http("request_233")
			.get(uri10 + "/G/01/x-locale/cs/orders/images/btn-close._CB192250694_.gif")
			.headers(headers_188),
            http("request_234")
			.get(uri10 + "/G/01/x-locale/cs/help/images/spotlight/kindle-family-02b._CB354814520_.jpg")
			.headers(headers_188),
            http("request_235")
			.get(uri10 + "/I/01Re6AqkVUL._RC|11div+n5b+L.js,41ybh3DZRmL.js,31selSsN+1L.js,413u98XONQL.js,01I-WWW2CuL.js,21hEt8rUbxL.js,318rs4piGPL.js,01jEqq6I0UL.js,0185ITV0M6L.js,41DfHGdXUeL.js,217XOv1WjVL.js,21Ru4ioY6pL.js,01nnV9HCzgL.js,11H+quk5jAL.js,21FBJlPfM6L.js,11f-8VjN-KL.js,71LEtO5Vv5L.js,61RCMKFFdkL.js,31UjTApGOPL.js,01LHJt5PiyL.js,31Ac-cQ+ZWL.js,01VgEfU-GFL.js,0193uyIciNL.js,41D4kRuiy9L.js,31XRqstyNFL.js,11p0nLfNCcL.js,01s9HEfbt3L.js,11iHZuQapKL.js,61ZSPeOQowL.js,11AVRVWTouL.js,11MQqFPEK+L.js,41Cj37sVWhL.js,11G4c43OZvL.js,21Gfl9VxXFL.js,31t4ojoCyTL.js,11jf5oS-4FL.js,01X2zigX4kL.js,21YW9LKF2zL.js,21mymEONFtL.js,61no9IDtPrL.js,21OJDARBhQL.js,41s+OBPxTPL.js,516ZYb92ZBL.js,01IWUb29Q4L.js,01JzE3-DfLL.js_.js?AUIClients/USHardlinesDetailPageMetaAssetFixed")
			.headers(headers_25),
            http("request_236")
			.get(uri10 + "/G/01/authportal/common/images/amznbtn-sprite03._CB395592492_.png")
			.headers(headers_188),
            http("request_237")
			.get(uri10 + "/G/01/gno/sprites/nav-sprite-global_bluebeacon-1x_optimized_layout1._CB468670774_.png")
			.headers(headers_188),
            http("request_238")
			.get(uri10 + "/I/01IY99sMV0L._RC|01ekIXTj5kL.css,01KvCqKMBgL.css,21ckusqmu6L.css,01L3N0m1vjL.css,11xRy3bSkOL.css,0143vbaqMnL.css,01D-B-OeNDL.css,01zmYtfbgDL.css,21btGDRdJSL.css,01QUs5FVXoL.css,11MXghh1eBL.css,016ZWeUMVEL.css,41vOQb1k0LL.css,31MkQHV3gaL.css,314gb2LkLML.css,01FtAuFRr3L.css,01rgQ3jqo7L.css,21R+8v-fR4L.css,31TJtSmBkXL.css,11X8K4AolpL.css,21PjfsP9YvL.css,31mDqH7l3AL.css,014Z+MbaRaL.css,01RRH0yFa4L.css,31nCoS7b3RL.css,01ZGR4PDSTL.css,01dCidM2ztL.css,218XVPWf2YL.css,01f31VNCowL.css,01rgQ3jqo7L.css,01kwuiPOKIL.css,41fK6fT1tqL.css,01kymrLkG9L.css_.css?AUIClients/USHardlinesDetailPageMetaAssetFixed")
			.headers(headers_25),
            http("request_239")
			.get(uri10 + "/G/01/x-locale/cs/ya/images/shipment_large_lt._CB192250661_.gif")
			.headers(headers_188),
            http("request_240")
			.get(uri10 + "/G/01/advertising/dev/js/live/adSnippet._CB142890782_.js")
			.headers(headers_25),
            http("request_241")
			.get(uri10 + "/G/01/browser-scripts/fruitCSS/US-secure-combined-11313707._CB320013561_.css")
			.headers(headers_25),
            http("request_242")
			.get(uri10 + "/G/01/orderApplication/js/authPortal/sign-in._CB375965495_.js")
			.headers(headers_25),
            http("request_243")
			.get(uri10 + "/I/210UtsRqV6L._RC|71dR5W0gVtL.css,11WnO6PP7GL.css,31z2rY6PyVL.css,21+aU+R3IiL.css,31wWWC6YAvL.css,11G4HxMtMSL.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/AmazonNavigationDesktopMetaAsset")
			.headers(headers_25),
            http("request_244")
			.get(uri10 + "/G/01/authportal/flex/reduced-nav/ap-flex-reduced-nav-2.0._CB309092102_.js")
			.headers(headers_25),
            http("request_245")
			.get(uri10 + "/I/41aOEEWqg5L._RC|41ufqE3zTRL.css,210LbiKyCML.css,31j6BOPjmzL.css,01ekIXTj5kL.css,01KvCqKMBgL.css,21ckusqmu6L.css,01L3N0m1vjL.css,41NTvbcsBfL.css,01f0Gtj6a9L.css,0143vbaqMnL.css,01D-B-OeNDL.css,21btGDRdJSL.css,016ZWeUMVEL.css,31MkQHV3gaL.css,314gb2LkLML.css,01FtAuFRr3L.css,01QLwk8mu6L.css,014Z+MbaRaL.css,01RRH0yFa4L.css,01ZGR4PDSTL.css,018mGORJ7tL.css,01NW8VTUeVL.css,01rgQ3jqo7L.css,01zWxM9Vh0L.css,011uHgmxBfL.css,31SN3jkqdEL.css,01kwuiPOKIL.css,41fK6fT1tqL.css,01kymrLkG9L.css,21Wf53xZ5jL.css,01OhA16ND1L.css,01qwEWNuxuL.css,21qxDmhZV3L.css,11XXguyjjZL.css,31LPDlue2jL.css,01clde05tlL.css,219oCRGl-sL.css,01AT3O0C6cL.css,01vF6gFybxL.css_.css?AUIClients/USSoftlinesDetailPageMetaAsset_TURBO_DESKTOP")
			.headers(headers_25),
            http("request_246")
			.get(uri10 + "/G/01/orderApplication/css/authPortal/sign-in._CB392399058_.css")
			.headers(headers_25),
            http("request_247")
			.get(uri10 + "/G/01/kitchen/scheduled-delivery/sd_style-ScheduledDeliveryJavascript-v2-b1.0.118.0-min._CB290041502_.css")
			.headers(headers_25),
            http("request_248")
			.get(uri10 + "/G/01/twister/beta/twister-dpf.87b069b255db02b4805f7e714b617f8f._V1_.js")
			.headers(headers_25),
            http("request_249")
			.post(uri15 + "/gp/redirection/mexico.html/132-0340626-5925042")
			.headers(headers_154)
			.formParam("path", "/")
			.formParam("queryString", "?ie=UTF8")
			.formParam("pageType", "Gateway")
			.formParam("referer", ""),
            http("request_250")
			.get(uri27 + "/iu3?d=amazon.com&slot=navFooter&a2=0101f5011cdd0eb2c8b652d55c45a764036b3c69a2c032f3a6f0edad0a7a4bcf95dc&old_oo=0&ts=1564815036329&s=AVN2LGAA1OmT6J2hF5atClJYfSMKNG3OLZfg9tWSZtra&cb=1564815036329")
			.headers(headers_250),
            http("request_251")
			.get(uri27 + "/v3/pr?exlist=pp_ns_rx_bsw_bk_aold_gem_fw_imdb_twca_adelphic_adb_mp_sv_sx_af_kr_g_ox_index_an_rb_fbca_nd_y_rlsa_pm_tbl&fv=1.0&ex-pl-fbca=NmT-rS-IQbCzc0m70Xy5eg&ex-pl-twca=6n9Bk4caRKuYssmOS_gEgQ&a=cm&ep=8KTkgZlA4aw-e3KTmzAWB5L_DUMJSKm2f3e9n4JfTLLyoP9Xb9A7TD2fYO_DkLSA1vCuYq8-9DAUbiOaF0ItDrQHAq-9AtPN3NPhUk4JeiL9TLRvhIqYuXWtaD4adE1ZPV-Jb5qxRnlgt-PLPbonj-cYtHGM-CO3sr6p28YA56X_aXKvOZFxChdNQ2iZOWzZ2ff6dXzBAp0e9COm6PL0hQ")
			.headers(headers_250),
            http("request_252")
			.get(uri29 + "?pid=557477&ev=&rurl=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fid%3D%25%25VGUID%25%25%26ex%3Dpulsepoint.com"),
            http("request_253")
			.get(uri06 + "?https://s.amazon-adsystem.com/ecm3?id=${ADELPHIC_CUID}&ex=adelphic"),
            http("request_254")
			.get(uri05 + "?p=558293300959460&e=NmT-rS-IQbCzc0m70Xy5eg&r=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dfbca%26id%3DNmT-rS-IQbCzc0m70Xy5eg&s=1564815045&h=SzVEbkF1MXYxMVZTUzI3ekDxEnkfZul2yinJTcnjda9LJBxO"),
            http("request_255")
			.get(uri30 + "?s=184155&cb=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dindex%26id%3D__UID__&C=1"),
            http("request_256")
			.get(uri10 + "/G/01/acs/ux/widget/bxw-categorytiles-softlines/css/bxw-categorytiles-softlines.min.css")
			.headers(headers_6),
            http("request_257")
			.get(uri16 + "/?userId=wmuOo8dkRfeyPRwVhLQN9g&guid=ON&script=0"),
            http("request_258")
			.get(uri18 + "?adv_id=7922&redir=https://s.amazon-adsystem.com/ecm3?ex%3Dspotx.com%26id%3D%24SPOTX_USER_ID&__user_check__=1&sync_id=058769b9-b5bb-11e9-be0f-1d6193ca0307"),
            http("request_259")
			.get(uri03 + "?redir=true&_origin=1&verify=true"),
            http("request_260")
			.get(uri10 + "/G/01/acs/ux/widget/bxw-content-grid/dist/css/bxw-content-grid-1.1.4.min.css")
			.headers(headers_6),
            http("request_261")
			.get(uri31 + "?sid=9212284268"),
            http("request_262")
			.get(uri10 + "/I/210UtsRqV6L._RC|71dR5W0gVtL.css,11WnO6PP7GL.css,31z2rY6PyVL.css,21+aU+R3IiL.css,31wWWC6YAvL.css,11G4HxMtMSL.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/AmazonNavigationDesktopMetaAsset")
			.headers(headers_6),
            http("request_263")
			.get(uri27 + "/ecm3?id=05a03d9b-b5bb-11e9-a402-07b0ac9dfff1&ex=adelphic"),
            http("request_264")
			.get(uri21 + "?partner_id=AMAZON&ex=gemini"),
            http("request_265")
			.get(uri10 + "/G/01/AmazonExports/Fuji/2019/April/SWM/SWM_Currency_EN._CB466884771_.jpg"),
            http("request_266")
			.get(uri10 + "/I/41R9FArsBDL._AC_US218_.jpg"),
            http("request_267")
			.get(uri10 + "/G/01/amazonglobal/images/email/asins/DURM-2B5EB42FF5F1F81P._V531815299_.jpg"),
            http("request_268")
			.get(uri10 + "/G/01/amazonglobal/images/email/asins/DURM-2B5ECC8E3DA42415._V531815325_.jpg"),
            http("request_269")
			.get(uri10 + "/G/01/amazonglobal/images/email/asins/DURM-2B638E86650FFF18._V531815327_.jpg"),
            http("request_270")
			.get(uri10 + "/I/41UY4Pnw0SL._AC_AA80_QL65_.jpg"),
            http("request_271")
			.get(uri10 + "/I/41GGPRqTZtL._AC_US218_.jpg"),
            http("request_272")
			.get(uri10 + "/I/31qwualUaLL._AC_US218_.jpg"),
            http("request_273")
			.get(uri10 + "/I/51JZvav6OoL._AC_US218_.jpg"),
            http("request_274")
			.get(uri10 + "/I/51XcLFE99aL._AC_US218_.jpg"),
            http("request_275")
			.get(uri10 + "/I/41UY4Pnw0SL._AC_US218_.jpg"),
            http("request_276")
			.get(uri10 + "/I/51290l-LHWL._AC_US218_.jpg"),
            http("request_277")
			.get(uri10 + "/I/518B2PBNkHL._AC_US218_.jpg"),
            http("request_278")
			.get(uri08 + "?redir=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fid%3D%24_BK_UUID%26ex%3Dbluekai.com"),
            http("request_279")
			.get(uri10 + "/I/41kaOFDXzSL._AC_US218_.jpg"),
            http("request_280")
			.get(uri10 + "/I/31i3tpuXxxL._AC_US218_.jpg"),
            http("request_281")
			.get(uri10 + "/I/51uT9qIdpIL._AC_US218_.jpg"),
            http("request_282")
			.get(uri10 + "/G/01/amazonglobal/images/AG_HelpPage_RightRoto._CB357282813_.jpg"),
            http("request_283")
			.get(uri11 + "?rd=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fid%3D%23PM_USER_ID%26ex%3Dpubmatic.com"),
            http("request_284")
			.get(uri14 + "?partner=amzn"),
            http("request_285")
			.get(uri27 + "/ecm3?ex=mplatform.com&id=10526460441883289037"),
            http("request_286")
			.get(uri22 + "?sub=amazon&redir=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fid%3D%5BRX_UUID%5D%26ex%3Drhythmone.com"),
            http("request_287")
			.get(uri27 + "/ecm3?ex=index&id=0"),
            http("request_288")
			.get(uri27 + "/ecm3?ex=fbca&id=NmT-rS-IQbCzc0m70Xy5eg"),
            http("request_289")
			.get(uri13 + "?CC=1&party=1153&redirect_url=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dadform.net%26id%3D%24%7BUUID%7D"),
            http("request_290")
			.get(uri27 + "/ecm3?id=164581103136000438375&ex=neustar.biz"),
            http("request_291")
			.get(uri10 + "/I/41Jz-iOxeAL.js?AUIClients/AmazonPopoversAUIShim")
			.headers(headers_25),
            http("request_292")
			.get(uri10 + "/I/21CLcdv0yIL.js?AUIClients/RetailSearchImageLoader")
			.headers(headers_25),
            http("request_293")
			.get(uri02 + "/getuid?https://s.amazon-adsystem.com/ecm3?id=$UID&ex=appnexus.com"),
            http("request_294")
			.get(uri26 + "/ul_cb/sync_a9/https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dbidswitch.com%26id%3D%24%7BUUID%7D"),
            http("request_295")
			.get(uri27 + "/ecm3?ex=taboola.com&id=b2256602-4792-49c1-bf47-91a38b5e4e7f-tuct43eb446"),
            http("request_296")
			.get(uri10 + "/G/01/x-locale/common/transparent-pixel._CB386942464_.gif"),
            http("request_297")
			.get(uri24 + "?pid=2179&pt=n"),
            http("request_298")
			.get(uri27 + "/ecm3?id=y-izKZt0x1lxb_dAJyv6I1PIBDaBDsboRj7Gu2&status=NOT_FOUND&ex=gemini"),
            http("request_299")
			.get(uri27 + "/ecm3?id=DI%2BbvQ99999FGDP5&ex=bluekai.com"),
            http("request_300")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_bd-46b91bda68161c14e554a779643ef4957431987b._V2_.woff2")
			.headers(headers_183),
            http("request_301")
			.get(uri17 + "?google_nid=a9&google_cm=&ex=doubleclick.net&google_tc="),
            http("request_302")
			.get(uri25 + "/AUIClients/AmazonUIFont-amazonember_rgit-9cc1bb64eb270135f1adf3a4881c2ee5e7c37be5._V2_.woff2")
			.headers(headers_183),
            http("request_303")
			.get(uri25 + "/AUIClients/AmazonUIIcon@legacyImages-sprite_1x-6c462f5dc3bc3e40d0788502814fa7043355712a._V2_.png"),
            http("request_304")
			.get(uri10 + "/G/01/nav2/images/gui/searchSprite._CB280429789_.png"),
            http("request_305")
			.get(uri10 + "/G/01/AUIClients/ClientSideMetricsAUIJavascript-2652a9b368cb49fa24d71333217575d57b3a06da._V2_.js")
			.headers(headers_25),
            http("request_306")
			.get(uri10 + "/I/61kzhTBl2qL._RC|11-BZEJ8lnL.js,61ukzj4bv-L.js,21Of0-9HPCL.js,012FVc3131L.js,119KAWlHU6L.js,51psF-j89fL.js,11AHlQhPRjL.js,016iHgpF74L.js,11aNYFFS5hL.js,116tgw9TSaL.js,211-p4GRUCL.js,01PoLXBDXWL.js,61J2AypSEKL.js,01mi-J86cyL.js,11BOgvnnntL.js,31UWuPgtTtL.js,01rpauTep4L.js,01iyxuSGj4L.js,01BCGLVRoPL.js_.js?AUIClients/AmazonUI")
			.headers(headers_25),
            http("request_307")
			.get(uri10 + "/I/31Gy8EGyyiL._RC|01jJ55rhdUL.js,21wK5i3BT4L.js,01zSat8PreL.js,7181JJPbPRL.js_.js?AUIClients/RetailSearchAssets")
			.headers(headers_25),
            http("request_308")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:BFNR08Q27P3KZXA9NB2Z$uedata=s:%2Fmn%2Fsearch%2Fuedata%2F132-0340626-5925042%3Fld%26v%3D0.202699.0%26id%3DBFNR08Q27P3KZXA9NB2Z%26ctb%3D1%26sc0%3Ds_dimge%26bb0%3D1483%26pc0%3D1483%26ld0%3D1483%26t0%3D1564815048113%26pty%3DLanding%26spty%3Dundefined%26pti%3Dundefined%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:1483"),
            http("request_309")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:BFNR08Q27P3KZXA9NB2Z$uedata=s:%2Fmn%2Fsearch%2Fuedata%2F132-0340626-5925042%3Fld%26v%3D0.202699.0%26id%3DBFNR08Q27P3KZXA9NB2Z%26sc0%3DcsmCELLSframework%26bb0%3D1172%26pc0%3D1174%26ld0%3D1174%26t0%3D1564815047804%26sc1%3DcsmCELLSpdm%26bb1%3D1174%26pc1%3D1247%26ld1%3D1247%26t1%3D1564815047877%26sc2%3DcsmCELLSvpm%26bb2%3D1247%26pc2%3D1248%26ld2%3D1248%26t2%3D1564815047878%26sc3%3DcsmCELLSfem%26bb3%3D1248%26pc3%3D1248%26ld3%3D1248%26t3%3D1564815047878%26ctb%3D1:1479"),
            http("request_310")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:BFNR08Q27P3KZXA9NB2Z$uedata=s:%2Fmn%2Fsearch%2Fuedata%2F132-0340626-5925042%3Fld%26v%3D0.202699.0%26id%3DBFNR08Q27P3KZXA9NB2Z%26sw%3D1366%26sh%3D768%26vw%3D1349%26vh%3D654%26m%3D1%26sc%3DBFNR08Q27P3KZXA9NB2Z%26ue%3D3%26bb%3D1007%26ns%3D1028%26ne%3D1163%26cf%3D1326%26be%3D1171%26af%3D1326%26pc%3D1474%26tc%3D-2645%26na_%3D-2645%26ul_%3D-33%26_ul%3D-27%26rd_%3D-1564815046630%26_rd%3D-1564815046630%26fe_%3D-2639%26lk_%3D-2639%26_lk%3D-2639%26co_%3D-2639%26_co%3D-2639%26sc_%3D-2645%26rq_%3D-2575%26rs_%3D-115%26_rs%3D-115%26dl_%3D-33%26di_%3D1247%26de_%3D1259%26_de%3D1261%26_dc%3D1472%26ld_%3D1472%26_ld%3D-1564815046630%26ntd%3D-2%26ty%3D0%26rc%3D0%26hob%3D2%26hoe%3D3%26ld%3D1475%26t%3D1564815048105%26ctb%3D1%26rt%3Dcf%3A33-2-7-21-3-2-0_af%3A33-2-7-21-3-2-0_ld%3A35-2-7-21-3-2-0%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.19.3-2019-03-27%7Cnavbar%7Cfls-na%7Cadblk_no%7CZeroInViewport%7Ccsm-feature-touch-enabled%3Afalse%26viz%3Dvisible%3A3%26pty%3DLanding%26spty%3Dundefined%26pti%3Dundefined%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1%26ui%3D2:1478"),
            http("request_311")
			.post(uri23 + "/OE/")
			.headers(headers_164)
			.body(RawFileBody("/recordrenuka/0311_request.txt")),
            http("request_312")
			.get(uri27 + "/iu3?d=amazon.com&slot=navFooter&a2=0101f5011cdd0eb2c8b652d55c45a764036b3c69a2c032f3a6f0edad0a7a4bcf95dc&old_oo=0&ts=1564815045080&s=AWeaYcFSYJX2RtuyLwB1GFoSKGOjAoIjdpaTmkzWgyQn&cb=1564815045080")
			.headers(headers_250),
            http("request_313")
			.post(uri15 + "/gp/redirection/canada.html")
			.headers(headers_154)
			.formParam("path", "/l/16225016011")
			.formParam("queryString", "?ie=UTF8")
			.formParam("pageType", "Landing")
			.formParam("referer", "https://www.amazon.com/"),
            http("request_314")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:BFNR08Q27P3KZXA9NB2Z$uedata=s:%2Fmn%2Fsearch%2Fuedata%2F132-0340626-5925042%3Fld%26v%3D0.202699.0%26id%3DBFNR08Q27P3KZXA9NB2Z%26ctb%3D1%26sc0%3Diss-init-pc%26bb0%3D1032%26cf0%3D2047%26be0%3D2047%26pc0%3D2047%26ld0%3D2047%26t0%3D1564815048677%26pty%3DLanding%26spty%3Dundefined%26pti%3Dundefined%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:2048"),
            http("request_315")
			.get(uri27 + "/v3/pr?exlist=sv_sx_af_rx_kr_g_bsw_index_aold_an_rb_imdb_twca_pm_adb&fv=1.0&ex-pl-twca=6n9Bk4caRKuYssmOS_gEgQ&a=cm&ep=t1UWpdWK36VXrnYvDRfoZTcrAWO1yG5BU9Cs0S_yQVUvZ9dGoFe-P1f_d97nVuLt")
			.headers(headers_250),
            http("request_316")
			.get(uri15 + "/mn/search/uedata/132-0340626-5925042?ld&v=0.202699.0&id=BFNR08Q27P3KZXA9NB2Z&sw=1366&sh=768&vw=1349&vh=654&m=1&sc=BFNR08Q27P3KZXA9NB2Z&ue=3&bb=1007&ns=1028&ne=1163&cf=1326&be=1171&af=1326&pc=1474&tc=-2645&na_=-2645&ul_=-33&_ul=-27&rd_=-1564815046630&_rd=-1564815046630&fe_=-2639&lk_=-2639&_lk=-2639&co_=-2639&_co=-2639&sc_=-2645&rq_=-2575&rs_=-115&_rs=-115&dl_=-33&di_=1247&de_=1259&_de=1261&_dc=1472&ld_=1472&_ld=-1564815046630&ntd=-2&ty=0&rc=0&hob=2&hoe=3&ld=1475&t=1564815048105&ctb=1&rt=cf:33-2-7-21-3-2-0_af:33-2-7-21-3-2-0_ld:35-2-7-21-3-2-0&csmtags=aui|aui:aui_build_date:3.19.3-2019-03-27|navbar|fls-na|adblk_no|ZeroInViewport|csm-feature-touch-enabled:false&viz=visible:3&pty=Landing&spty=undefined&pti=undefined&tid=KZACB4BCRPWSQ2CXX97F&aftb=1&ui=2"),
            http("request_317")
			.get(uri04),
            http("request_318")
			.get(uri18 + "?adv_id=7922&redir=https://s.amazon-adsystem.com/ecm3?ex%3Dspotx.com%26id%3D%24SPOTX_USER_ID"),
            http("request_319")
			.get(uri26 + "/sync_a9/https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dbidswitch.com%26id%3D%24%7BUUID%7D"),
            http("request_320")
			.get(uri17 + "?google_nid=a9&google_cm&ex=doubleclick.net"),
            http("request_321")
			.get(uri03 + "?redir=true&_origin=1&verify=true"),
            http("request_322")
			.get(uri14 + "?partner=amzn"),
            http("request_323")
			.get(uri30 + "?s=184155&cb=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dindex%26id%3D__UID__"),
            http("request_324")
			.get(uri27 + "/ecm3?id=8Yu1Z4ghUaceAFT_H7jdP8WWwYjZzChgQG1x_JmYjWc&ex=rubiconproject.com&status=ok"),
            http("request_325")
			.get(uri15 + "/gp/prime/digital-adoption/navigation-bar?type=load&isPrime=false&referrer=https%3A%2F%2Fwww.amazon.com%2F&height=654&width=1349&_=1564815048672")
			.headers(headers_161),
            http("request_326")
			.get(uri13 + "?CC=1&party=1153&redirect_url=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dadform.net%26id%3D%24%7BUUID%7D"),
            http("request_327")
			.get(uri02 + "/bounce?%2Fgetuid%3Fhttps%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fid%3D%24UID%26ex%3Dappnexus.com"),
            http("request_328")
			.get(uri27 + "/ecm3?ex=doubleclick.net&google_error=3"),
            http("request_329")
			.get(uri07 + "?session-id=132-0340626-5925042&customer-id=&request-id=BFNR08Q27P3KZXA9NB2Z&page-type=Landing&lop=en_US&site-variant=desktop&client-info=amazon-search-ui&mid=ATVPDKIKX0DER&alias=videogames-intl-ship&searchTerm=a&suggestion-type=KEYWORD&suggestion-type=WIDGET&_=1564815048712")
			.headers(headers_329),
            http("request_330")
			.get(uri20 + "?ttd_pid=adconductor&ttd_tpi=1&rndcb=4746087121"),
            http("request_331")
			.get(uri27 + "/ecm3?id=0&ex=appnexus.com"),
            http("request_332")
			.get(uri27 + "/ecm3?ex=index&id=0"),
            http("request_333")
			.get(uri27 + "/ecm3?ex=survata.com&id=f36544ed-1aef-4d15-e41e-ab79b845350c"),
            http("request_334")
			.get(uri23 + "/OP/ATVPDKIKX0DER:132-0340626-5925042:BFNR08Q27P3KZXA9NB2Z$uedata=s:%2Fmn%2Fsearch%2Fuedata%2F132-0340626-5925042%3Fld%26v%3D0.202699.0%26id%3DBFNR08Q27P3KZXA9NB2Z%26ctb%3D1%26sc0%3Diss-warmup%3Asuccess%26bb0%3D2082%26cf0%3D3103%26be0%3D3103%26pc0%3D3103%26ld0%3D3103%26t0%3D1564815049733%26csmtags%3Diss-on-time%26pty%3DLanding%26spty%3Dundefined%26pti%3Dundefined%26tid%3DKZACB4BCRPWSQ2CXX97F%26aftb%3D1:3103"),
            http("request_335")
			.get(uri28),
            http("request_336")
			.get(uri09 + "?p_id=985&p_user_id=6n9Bk4caRKuYssmOS_gEgQ&twitter_redir=https%3A%2F%2Fs.amazon-adsystem.com%2Fecm3%3Fex%3Dtwca%26id%3D6n9Bk4caRKuYssmOS_gEgQ%26"),
            http("request_337")
			.get(uri27 + "/ecm3?p_user_id=6n9Bk4caRKuYssmOS_gEgQ&ex=twca&id=6n9Bk4caRKuYssmOS_gEgQ")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}