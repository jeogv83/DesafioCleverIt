package steps;

import org.openqa.selenium.WebDriver;
import pages.*;
import util.ScreenShot;

public class BaseTest {
    protected WebDriver driver = Hooks.getDriver();
    protected ScreenShot screenShot = new ScreenShot(driver);
    protected GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

}
