package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaLoginPomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://kodilla.com/pl/test/login");

        KodillaLoginPom kodillaLoginPom = new KodillaLoginPom(webDriver);

        kodillaLoginPom.closeAlert();
        kodillaLoginPom.login("test@kodilla.com", "kodilla123");
        kodillaLoginPom.close();
    }
}
