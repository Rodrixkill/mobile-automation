package sessionMobile;



import Session.FactorySession;
import io.appium.java_client.AppiumDriver;
import utils.GetProperties;

import java.time.Duration;

public class SessionMobile {
    private static SessionMobile instance = null;
    private AppiumDriver driver;
    private SessionMobile(){
        driver= FactorySession.make(GetProperties.getInstance().getMobile()).create();
    }

    public static SessionMobile getInstance(){
        if(instance==null)
            instance = new SessionMobile();
        return instance;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
