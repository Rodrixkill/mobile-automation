package control;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionMobile.SessionMobile;

import java.time.Duration;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator=locator;
    }

    protected void find(){
        control= SessionMobile.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.find();
        control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.find();
            return control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getText(){
        this.find();
        return this.control.getText();
    }



}
