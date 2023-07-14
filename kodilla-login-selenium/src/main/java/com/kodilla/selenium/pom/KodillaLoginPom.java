package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='passowrd']")
    WebElement passwordField;

    WebDriver webDriver;

    public KodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(chromeOptions);

        PageFactory.initElements(webDriver, KodillaLoginPom.class);

        webDriver.get("https://kodilla.com/pl/test/login");

        //WebElement emailField = webDriver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"email\"]"));
        //WebElement passwordField = webDriver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"password\"]"));
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void close() {
        webDriver.close();
    }
}
