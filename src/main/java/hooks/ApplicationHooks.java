//package hooks;
//
//import com.gemini.generic.MobileAction;
//import io.appium.java_client.AppiumDriver;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.Properties;
//
//
//public class ApplicationHooks {
//
//    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
//    private static final String appLocation = System.getProperty("user.dir") + "/src/test/resources/app/";
//
//    private static Properties dataProp;
//
//    @Before(order = 0)
//    public void loadProperty() {
//        Properties properties = null;
//        try {
//            properties = new Properties();
//            FileInputStream fis = new FileInputStream(new File("src/test/resources/appium-config.properties"));
//            properties.load(fis);
//            System.out.println("load");
//
//        } catch (IOException e) {
//
//            throw new RuntimeException(e);
//        }
//        dataProp = properties;
//    }
//
//    @Before(order=1)
//    public void setup(Scenario scenario) {
//        System.out.println("Running - " + scenario.getName());
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", getProperty("platformName"));
//        capabilities.setCapability("appium:platformVersion", getProperty("platformVersion"));
//        capabilities.setCapability("appium:deviceName", getProperty("deviceName"));
//        capabilities.setCapability("appium:app", appLocation + getProperty("app"));
//
//        System.out.println(capabilities);
//
//        try {
//            URL url = new URL(getProperty("appiumURL"));
//            driver.set(new AppiumDriver(url, capabilities));
//            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public static synchronized AppiumDriver getDriver() {
//        return driver.get();
//    }
//
//    public static String getProperty(String key) {
//        return dataProp.getProperty(key);
//    }
//
//    @After(order = 0)
//    public void tearDown() {
//        getDriver().quit();
//        System.out.println("close");
//    }
//
//    @After(order = 1)
//    public void takeSnapOnFail(Scenario scenario) {
//        if (scenario.isFailed()) {
//            System.out.println(scenario.getName() + " failed - taking screenshot...");
//        }
//    }
//
//}
