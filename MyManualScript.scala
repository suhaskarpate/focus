import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends Simulation {

  // 1. Common HTTP Configuration
  val httpProtocol = http
<<<<<<< HEAD
    .baseUrl("yourURL goes here")
=======
    .baseUrl("https://demo.opencart.com")
>>>>>>> 599b307370a5e8f4f168757ab106146184885221
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")


  // 2. Scenario Defination
<<<<<<< HEAD
  val scn = scenario("Suhas")
    .exec(http("Visit Category")
      .get(" "))
=======
  val scn = scenario("Cart")
    .exec(http("Visit Category")
      .get("/catalog/view/theme/default/stylesheet/stylesheet.css"))
>>>>>>> 599b307370a5e8f4f168757ab106146184885221
    .pause(7)


  // 3. Load Scenario
  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}