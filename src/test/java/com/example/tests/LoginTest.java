package com.example.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testLogin() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the login page
            driver.get("https://example.com/login");
            
            // Find username and password fields
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            
            // Enter credentials
            usernameField.sendKeys("testuser");
            passwordField.sendKeys("password123");
            
            // Submit the form
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();
            
            // Verify successful login
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals("https://example.com/dashboard", currentUrl);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
