package com.example.tests;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.pages.HomePage;
import com.example.pages.NewsletterPage;
import com.example.pages.SayHelloPage;



public class KelianFoodsTest {
	
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void launchWebsite() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.kelianfood.com");

        // Create an instance of HomePage
        homePage = new HomePage(driver);

        // Accept cookies
        homePage.acceptCookies();

        // Wait for 30 seconds
        try {
            Thread.sleep(30000); // 30000 milliseconds = 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNewsletter() {
        // Navigate to the newsletter page
       NewsletterPage newsletterPage = homePage.navigateToNewsletter();
        newsletterPage.enterName("John Doe");
        newsletterPage.enterEmail("john.doe@example.com");
        newsletterPage.clickSubscribe();
        homePage.clickHome();
        

        // Add assertions or further actions here if needed
    }
    
    @Test
    public void testSayHello() {
    	SayHelloPage sayhelloPage = homePage.navigateToSayHello();
    	sayhelloPage.enterNameH("Nkup");
    	sayhelloPage.enterEmailH("nkup@duck.com");
    	sayhelloPage.enterSubject("Hello Baby");
    	sayhelloPage.enterText("just wanted to wish you a beautiful day");
    	sayhelloPage.clickSubmit();
    	homePage.clickHome();
    }

    @After
    public void tearDown() {
        // Quit the driver with an increased timeout
        if (driver != null) {
            try {
                driver.quit();
            } catch (WebDriverException e) {
                System.err.println("Error quitting WebDriver: " + e.getMessage());
            }

            // Attempt to kill the process manually as a fallback
            try {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            } catch (IOException e) {
                System.err.println("Failed to kill chromedriver process: " + e.getMessage());
            }
        }
    }
}
