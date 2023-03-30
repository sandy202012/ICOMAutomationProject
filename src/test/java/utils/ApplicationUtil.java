package utils;

import appxpaths.AppXpathsConstants;
import driverutil.Driver;
import org.openqa.selenium.WebDriver;
import pageutils.PageUtil;

public class ApplicationUtil {
    public static boolean openApplication(WebDriver driver, String url, String title) {
        Driver.maximize_window(driver);
        driver.get(url);
        Driver.waitForElementToAppearByXpath(driver, AppXpathsConstants.username, 60, "Login is not confirmed");
        return PageUtil.checkPageTitle(driver,title);

    }
}
