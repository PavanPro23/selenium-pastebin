package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PastebinHomePage;

public class PastebinTest {
    private WebDriver driver;
    private PastebinHomePage pastebinHomePage;

    @BeforeEach
    public void setUp() {
        // Initialize WebDriver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com");

        // Initialize Page Object
        pastebinHomePage = new PastebinHomePage(driver);
    }

    @Test
    public void testCreateNewPaste() {
        pastebinHomePage.enterCode("Hello from WebDriver");
        pastebinHomePage.selectPasteExpiration();
        pastebinHomePage.enterPasteName("helloweb");
        pastebinHomePage.clickCreateNewPasteButton();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}