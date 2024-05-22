package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsletterPage extends BasePage {

	public NewsletterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
    public void enterName(String name) {
        WebElement nameElement = driver.findElement(Locators.NAME);
        waitForElementToBeVisible(nameElement);
        nameElement.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(Locators.EMAIL);
        waitForElementToBeVisible(emailElement);
        emailElement.sendKeys(email);
    }

    public void clickSubscribe() {
        WebElement subscribeElement = driver.findElement(Locators.SUBSCRIBE);
        waitForElementToBeVisible(subscribeElement);
        subscribeElement.click();
    }
}
