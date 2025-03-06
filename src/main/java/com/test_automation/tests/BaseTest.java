package com.test_automation.tests;

import com.test_automation.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.getDriver();
        driver.get("https://www.example.com");
    }

    @Test
    public void exampleTest() {
        System.out.println("Running example test...");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
