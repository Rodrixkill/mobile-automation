package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.util.Properties;

public class GetProperties {
    private static GetProperties getProperties = null;
    private String driver;

    public String getMobile() {
        return driver;
    }

    public String getPackage() {
        return appPackage;
    }

    public String getActivity() {
        return appActivity;
    }

    private String appPackage;
    private String appActivity;

    public String getUrl() {
        return url;
    }

    private String url;
    private GetProperties(){
        Properties properties = new Properties();
        String nameFile = "mobile.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if (inputStream != null){
            try {
                properties.load(inputStream);
                driver = properties.getProperty("mobile");
                appPackage = properties.getProperty("package");
                appActivity = properties.getProperty("activity");
                url = properties.getProperty("url");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public  static  GetProperties getInstance(){
        if (getProperties == null)
            getProperties = new GetProperties();
        return getProperties;
    }
}
