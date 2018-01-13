package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    protected WebDriverWait waitReduced;
   

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        waitReduced = new WebDriverWait(driver, 1);
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    
    public List<WebElement> findElements(By by){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public String getText(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
    }

    public void sendKeys(By by, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);
    }

    
}