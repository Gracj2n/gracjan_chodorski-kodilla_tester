package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class KodillaLoginPom {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://kodilla.com/pl/test/login");

        WebElement emailField = webDriver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"email\"]"));
        WebElement passwordField = webDriver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"password\"]"));

        emailField.sendKeys("test1234@mail.com");
        passwordField.sendKeys("123123123");
    }
}
