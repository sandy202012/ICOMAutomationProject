package driverutil;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Driver {

    public static String getDriversPath() {
        String userDirectory = System.getProperty("user.dir");
        return userDirectory + "/drivers";

    }

    public static void maximize_window(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public static void javascript_click(WebDriver driver, WebElement element)
    {
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);
        }

        public static boolean waitforElementtoAppearbyXpath(WebDriver driver,String xpath,long timeoutInSeconds,String timeoutMessage) {
            boolean waituntil = false;
            {
                WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
                waituntil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();

            }

            return waituntil = true;

        }
//find for wait for pageload

    public static void waituntilPageLoad(WebDriver driver)
    {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        if(j.executeScript("return.document.readyState").toString().equals("complete")
        {
            System.out.println("Page is Loaded successfully");
        }
    }

    //find about this
    public static void waitforInvisiblityofElement(WebDriver driver,WebElement element,Duration waittime)
    {

    }

    public static void waitforVisiblityofElement(WebDriver driver,WebElement element,Duration waittime)
    }



