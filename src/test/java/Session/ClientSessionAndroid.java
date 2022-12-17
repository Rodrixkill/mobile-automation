package Session;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.GetProperties;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClientSessionAndroid implements SessionInterface {
    
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("platformVersion","12");
        //capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("udid","R58M70Y63RP");
        // capabilities.setCapability("deviceName","samsung_galaxy_web_7.1.1");
        capabilities.setCapability("deviceName","Galaxy S10+ de rodri");
        capabilities.setCapability("appPackage", GetProperties.getInstance().getPackage());
        capabilities.setCapability("appActivity",GetProperties.getInstance().getActivity());

        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL(GetProperties.getInstance().getUrl()), capabilities);
            driver.manage().timeouts().implicitlyWait( Duration.of(5, TimeUnit.SECONDS.toChronoUnit()));
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
        
}