package tests;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.Driver;

public class HomepageTests {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://cashwise.us/main");

        HomePage homePage = new HomePage();
        homePage.login("codewiser1@gmail.com", "admin123");

    }

}
