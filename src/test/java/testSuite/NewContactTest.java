package testSuite;

import control.Control;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Date;

public class NewContactTest {
    @Test
    public void verifyNewContact(){
        String projectName = "Proj" + new Date().getTime();
        String updateProjectName = "UpdateProj" + new Date().getTime();
        new Control(By.id("com.samsung.android.app.contacts:id/menu_create_contact")).click();





    }

}
