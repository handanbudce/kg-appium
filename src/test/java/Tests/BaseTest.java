package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import Pages.AccountPage;

import Pages.LoginPage;

import Pages.SearchList;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;
  

    

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.android();

        // Please replace the below 'APK Path' with the path on your pc.
        caps.setCapability(MobileCapabilityType.APP, "C:/Users/Asus/Desktop/Apps/com.imdb.mobile-7.1.1.107110100-APK4Fun.com.apk");

        // Please replace the device name with your own device name.
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"af23e0d9");
		caps.setCapability("appPackage", "com.imdb.mobile");
		caps.setCapability("appActivity", "com.imdb.mobile.landingpage.LandingPagesActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        
       

    }
    //login id com.imdb.mobile:id/imdb_auth_portal
    //email ap_email
    //ap_password
    //signInSubmit buton
    //konum popup id com.android.packageinstaller:id/permission_message
    //menu işareti id com.imdb.mobile:id/menu_account
    //search işareti:com.imdb.mobile:id/search
    // kullanci adi görunusu : id com.imdb.mobile:id/username

}