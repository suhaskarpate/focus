import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends Simulation {

  // 1. Common HTTP Configuration
  val httpProtocol = http
    .baseUrl("yourURL goes here")
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0")


  // 2. Scenario Defination
  val scn = scenario("Suhas")
    .exec(http("Visit Category")
      .get(" "))
    .pause(7)


  // 3. Load Scenario
  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}