//package steps;
//
//import hooks.ApplicationHooks;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static org.junit.Assert.assertEquals;
//
//
//public class StepDefinition {
//    AppiumDriver driver = ApplicationHooks.getDriver();
//    @Given("open preference")
//    public void openPreference() {
//        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//    }
//
//    @When("open preferences dependencies")
//    public void openPreferencesDependencies() {
//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
//    }
//
//    @Then("select wifi box")
//    public void selectWifiBox() {
//        driver.findElement(AppiumBy.id("android:id/widget_frame")).click();
//    }
//
//    @And("open wifi settings")
//    public void openWifiSettings() {
//        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
//    }
//
//    @And("enter wifi name")
//    public void enterWifiName() {
//        String title = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//        assertEquals(title, "WiFi settings");
//        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("PIR4T3");
//    }
//
//    @And("click ok")
//    public void clickOk() {
//        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
//    }
//}
