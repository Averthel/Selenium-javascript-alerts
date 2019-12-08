package tests;

import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.Test;
import page.object.MainPage;

import static navigation.ApplicationURLs.APP_URL;
import static org.testng.Assert.assertTrue;

public class JavaScripAlertsTests extends TestBase {

    @Test
    public void javaScriptAlertTest(){
        DriverUtils.navigateToPage(APP_URL);

        MainPage mainPage = new MainPage();
        mainPage.clickOnJsAlertButton();

        DriverManager.getWebDriver().switchTo().alert().accept();
        String result = mainPage.getResultText();

        assertTrue(result.contains("You successfuly clicked an alert"));
        
    }
}
