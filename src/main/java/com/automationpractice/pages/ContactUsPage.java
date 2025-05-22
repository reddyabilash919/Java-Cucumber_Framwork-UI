package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void selectSubjectHeading(String subject) {
        WebElement subjectDropdown = driver.findElement(By.id("id_contact"));
        Select select = new Select(subjectDropdown);
        select.selectByVisibleText(subject);
    }


    public void enterMessage(String message) {
        WebElement messageField = driver.findElement(By.id("message"));
        messageField.sendKeys(message);
    }

    public void clickSendButton() {
        WebElement sendButton = driver.findElement(By.id("submitMessage"));
        sendButton.click();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }
    
}
