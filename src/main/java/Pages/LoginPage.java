package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage signInWithIMDB(){
    	 
    	 click(By.id("com.imdb.mobile:id/imdb_auth_portal"));
        findElements(By.id("ap_email")).get(0).sendKeys("budcehandan@gmail.com");
        sendKeys(By.id("ap_password"),"12345678");
        findElements(By.id("signInSubmit")).get(0).click();
        Assert.assertTrue(findElements(By.id("com.android.packageinstaller:id/permission_message")).get(0).isDisplayed());
      
       return this;
    }

}