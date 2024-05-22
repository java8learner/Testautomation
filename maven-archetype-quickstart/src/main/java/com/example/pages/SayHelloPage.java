package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SayHelloPage extends BasePage {

	public SayHelloPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    public void enterNameH(String name) {
        WebElement nameElement = driver.findElement(Locators.NAMEH);
        waitForElementToBeVisible(nameElement);
        nameElement.sendKeys(name);
    }

    public void enterEmailH(String email) {
        WebElement emailElement = driver.findElement(Locators.EMAILH);
        waitForElementToBeVisible(emailElement);
        emailElement.sendKeys(email);
    }
    
    public void enterSubject(String subject) {
        WebElement subjectElement = driver.findElement(Locators.SUBJECT);
        waitForElementToBeVisible(subjectElement);
        subjectElement.sendKeys(subject);
    }
    
    public void enterText(String text) {
        WebElement textElement = driver.findElement(Locators.MESSAGE);
        waitForElementToBeVisible(textElement);
        textElement.sendKeys(text);
    }

    public void clickSubmit() {
        WebElement submitElement = driver.findElement(Locators.SUBMIT);
        waitForElementToBeVisible(submitElement);
        submitElement.click();
    }

}
