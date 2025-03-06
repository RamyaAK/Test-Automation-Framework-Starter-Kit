package com.test_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default wait time
    }

    /**
     * Waits for an element to be visible.
     * @param element WebElement to wait for
     * @return WebElement once it is visible
     */
    protected WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Clicks on a WebElement after waiting for its visibility.
     * @param element WebElement to click
     */
    protected void click(WebElement element) {
        waitForElementToBeVisible(element).click();
    }

    /**
     * Sends text to a WebElement after waiting for its visibility.
     * @param element WebElement to send text
     * @param text Text to enter
     */
    protected void enterText(WebElement element, String text) {
        WebElement visibleElement = waitForElementToBeVisible(element);
        visibleElement.clear();
        visibleElement.sendKeys(text);
    }

    /**
     * Gets text from a WebElement after waiting for its visibility.
     * @param element WebElement to get text from
     * @return Extracted text
     */
    protected String getText(WebElement element) {
        return waitForElementToBeVisible(element).getText();
    }

    /**
     * Checks if an element is displayed on the page.
     * @param element WebElement to check
     * @return true if displayed, false otherwise
     */
    protected boolean isElementDisplayed(WebElement element) {
        try {
            return waitForElementToBeVisible(element).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
