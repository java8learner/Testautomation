package com.example.pages;

import org.openqa.selenium.By;

public class Locators {
	
    // Locators for common elements
    public static final By ABOUT_ME_LINK = By.cssSelector("#menu-item-4853 font > font");
    public static final By SAY_HELLO_LINK = By.cssSelector("#menu-item-2447 font > font"); 
    public static final By NEWSLETTER_LINK = By.cssSelector("#menu-item-6815 font > font"); 
    public static final By LANGUAGE_BUTTON = By.id("changeLanguage"); 
    

    // Locators for social media links
    public static final By PINTEREST = By.linkText("pinterest"); 
    public static final By YOUTUBE = By.linkText("Youtube"); 
    public static final By INSTAGRAM = By.linkText("instagram"); 
    
    //Locators for Page Links
    
    public static final By HOME = By.cssSelector("#menu-item-2419 font > font");
    public static final By RECIPES = By.cssSelector("#menu-item-2361 > a");
    public static final By BLOG = By.cssSelector("#menu-item-2422 > a > font > font");
    public static final By MEAL = By.cssSelector("#menu-item-4836 font > font"); 
    public static final By PARTY = By.cssSelector("#menu-item-6442 font > font"); 
    
    //newsletterPage
    
    public static By NAME = By.name("fields[name]"); 
    public static By EMAIL = By.name("fields[email]"); 
    public static By SUBSCRIBE = By.cssSelector(".ml-embedded:nth-child(2) > #mlb2-13717551 .primary"); 

    

    // Locators for cookie accept buttons
    public static final By COOKIE_ACCEPT_BUTTON_1 = By.cssSelector("div.sc-qRumB.bcoUVc.amc-focus-first[tabindex='0'][color='#41a4a9'][format='primary']");
    public static final By COOKIE_ACCEPT_BUTTON_2 = By.id("CookieBoxSaveButton");
    
    //Locators for SayHello Page
    
    public static final By NAMEH = By.name("your-name"); 
    public static final By EMAILH = By.name("your-email");
    public static final By SUBJECT = By.name("your-subject"); 
    public static final By MESSAGE = By.name("your-message"); 
    public static final By SUBMIT = By.cssSelector(".wpcf7-submit"); 

}
