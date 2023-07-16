package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class KodillaLoginPomTestSuite {

    KodillaLoginPom kodillaLoginPom;
    WebDriver webDriver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://kodilla.com/pl/test/login");

        kodillaLoginPom = new KodillaLoginPom(webDriver);
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "test@toniedziala.pl";
        String password = "password";
        kodillaLoginPom.closeAlert();
        boolean loggedIn = kodillaLoginPom.login(email, password);
        assertFalse(loggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";
        kodillaLoginPom.closeAlert();
        boolean loggedIn = kodillaLoginPom.login(email, password);
        assertTrue(loggedIn);
    }

    @AfterEach
    public void testDown() {
        kodillaLoginPom.close();
    }

}