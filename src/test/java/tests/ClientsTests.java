package tests;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ClientsPage;
import pages.CommonPage;
import pages.HomePage;
import utilities.Driver;

import java.time.Duration;

public class ClientsTests {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    ClientsPage clientsPage = new ClientsPage();
    CommonPage commonPage = new CommonPage();


    @Test
    public void verifyEmptyResults(){
        driver.get("https://cashwise.us/main");
        homePage.login("codewiser1@gmail.com", "admin123");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(commonPage.sales));

        commonPage.sales.click();

        clientsPage.search("apple");

        Assert.assertTrue(clientsPage.listIsEmptyText.isDisplayed());
    }


}
