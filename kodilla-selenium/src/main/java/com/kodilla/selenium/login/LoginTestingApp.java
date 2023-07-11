package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Data/chromedriver_mac64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://kodilla.com/pl/test/login");

        WebElement emailField = webDriver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys("email@g.c");
        WebElement passwordField = webDriver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys("1234");
        WebElement buttonField = webDriver.findElement(By.xpath("//html/body/section/form/button[@type=\"submit\"]"));
        buttonField.submit();
    }
}
