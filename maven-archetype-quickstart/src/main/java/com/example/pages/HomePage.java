package com.example.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    public void navigateToAboutMe() {
        clickAboutMe();
    }

    public SayHelloPage navigateToSayHello() {
        return clickSayHello();
    }
    
    public NewsletterPage navigateToNewsletter() {
        return clickNewsletter();
    }
    

}
