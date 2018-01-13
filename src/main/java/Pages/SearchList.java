package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchList extends BasePage {

    public SearchList(AndroidDriver driver) {
        super(driver);
    }

   
    public SearchList search() {
    	
    	findElements(By.id("com.imdb.mobile:id/splash_not_now")).get(0).click();
    	findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
    	
    	 sendKeys(By.id("com.imdb.mobile:id/search"),"imdb");
    	return this;
    }
    //com.imdb.mobile:id/search
}