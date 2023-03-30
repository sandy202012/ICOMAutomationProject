package pageutils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.concurrent.TimeUnit;


public class PageUtil {

   public static boolean checkPageTitle(WebDriver driver,String title) {
       String pagetitle = driver.getTitle();
       if (pagetitle.equalsIgnoreCase(title)) {
           return true;
       } else {
           return false;
       }
   }
       public static void scrolltoBottom(WebDriver driver)
       {
           JavascriptExecutor j = (JavascriptExecutor) driver;
           j.executeScript("window.scrollTo(0,document.body.scrollHeight");
       }

       public static void scrolltoTop(WebDriver driver)
       {
           JavascriptExecutor j = (JavascriptExecutor) driver;
           j.executeScript("window.scrollTo(0,0)");
    }


    public static WebElement fluentWait(WebDriver driver, String path, int TimeOut)
    {

       WebElement element= new FluentWait<WebDriver>(driver)
                .withTimeout(TimeOut, TimeUnit.SECONDS
                        .pollingEvery(1, TimeUnit.SECONDS)
                        .ignoring(WebDriverException.class)
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                return element;
    }





    }
}
