package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignInMenu() {
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();
    }

    public void clickOnSignOutMenu() {
        WebElement signOutButton = driver.findElement(By.className("logout"));
        signOutButton.click();
    }

    public String getUserName() {
        WebElement userName = driver.findElement(By.className("account"));
        return userName.getText();
    }

    public void navigateToHomePage(String url) {
        driver.get(url);
    }
}
