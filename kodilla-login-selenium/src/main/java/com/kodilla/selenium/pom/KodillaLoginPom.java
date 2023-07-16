package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//span[@class=\"close-icon\"]")
    WebElement closeAlert;

    WebDriver webDriver;

    public KodillaLoginPom(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void closeAlert() {
        closeAlert.click();
    }
    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

        String message = webDriver.switchTo().alert().getText();
        webDriver.switchTo().alert().dismiss();

        return message.equals("Jesteś teraz zalogowany!");
    }

    public void close() {
        webDriver.close();
    }
}
