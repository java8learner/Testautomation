package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage {

	
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    protected void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    
    // Method to accept cookies
    public void acceptCookies() {
        try {
            // Accept the first cookie consent
            WebElement cookieAcceptButton1 = driver.findElement(Locators.COOKIE_ACCEPT_BUTTON_1);
            waitForElementToBeVisible(cookieAcceptButton1);
            cookieAcceptButton1.click();

            // Accept the second cookie consent
            WebElement cookieAcceptButton2 = driver.findElement(Locators.COOKIE_ACCEPT_BUTTON_2);
            waitForElementToBeVisible(cookieAcceptButton2);
            cookieAcceptButton2.click();
        } catch (Exception e) {
            System.out.println("Cookies accept buttons not found or already accepted: " + e.getMessage());
        }
    }
    
    // Methods to click on common elements
    public void clickAboutMe() {
        WebElement element = driver.findElement(Locators.ABOUT_ME_LINK);
        waitForElementToBeVisible(element);
        element.click();
    }
    
    

    public SayHelloPage clickSayHello() {
        WebElement element = driver.findElement(Locators.SAY_HELLO_LINK);
        waitForElementToBeVisible(element);
        element.click();
        
        return new SayHelloPage(driver); 
    }
    
    

    public NewsletterPage clickNewsletter() {
        try {
            WebElement element = driver.findElement(Locators.NEWSLETTER_LINK);
            waitForElementToBeVisible(element);
            
            System.out.println("Element found and visible, attempting to click.");

            // Scroll into view and click using JavaScript
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            
            System.out.println("Clicked the newsletter link.");
        } catch (Exception e) {
            System.out.println("Failed to click the newsletter link using regular click: " + e.getMessage());
            // Use JavaScript click as a fallback
            try {
                WebElement element = driver.findElement(Locators.NEWSLETTER_LINK);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                System.out.println("Clicked the newsletter link using JavaScript.");
            } catch (Exception jsEx) {
                System.out.println("Failed to click the newsletter link using JavaScript: " + jsEx.getMessage());
            }
        }
        
        return new NewsletterPage(driver);
    }

    public void clickChangeLanguage() {
        WebElement element = driver.findElement(Locators.LANGUAGE_BUTTON);
        waitForElementToBeVisible(element);
        element.click();
    }

    // Methods to click on social media links
    public void clickPinterest() {
        WebElement element = driver.findElement(Locators.PINTEREST);
        waitForElementToBeVisible(element);
        element.click();
    }

    public void clickYoutube() {
        WebElement element = driver.findElement(Locators.YOUTUBE);
        waitForElementToBeVisible(element);
        element.click();
    }

    public void clickInstagram() {
        WebElement element = driver.findElement(Locators.INSTAGRAM);
        waitForElementToBeVisible(element);
        element.click();
    }
    
    public void clickHome() {
        WebElement element = driver.findElement(Locators.HOME);
        waitForElementToBeVisible(element);
        element.click();
    	
    }
    
    public void clickRecipes() {
        WebElement element = driver.findElement(Locators.RECIPES);
        waitForElementToBeVisible(element);
        element.click();
    	
    }
    
    public void clickBlog() {
        WebElement element = driver.findElement(Locators.BLOG);
        waitForElementToBeVisible(element);
        element.click();
    	
    }
    
    public void clickMealPrep() {
        WebElement element = driver.findElement(Locators.MEAL);
        waitForElementToBeVisible(element);
        element.click();
    	
    }
    
    public void clickParty() {
        WebElement element = driver.findElement(Locators.PARTY);
        waitForElementToBeVisible(element);
        element.click();
    	
    }
}
