package com.kodilla.selenium.kodilla_shop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaSearchPomTestSuite {
    KodillaSearchPom kodillaSearchPom;
    WebDriver webDriver;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        kodillaSearchPom = new KodillaSearchPom(webDriver);
        webDriver.get("https://kodilla.com/pl/test/store");
    }

    @Test
    public void shouldSearchForNoteBook() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("NoteBook");
//        List<WebElement> foundElements = webDriver.findElements(By.className("element"));
//        System.out.println(foundElements.get(0).findElements(By.tagName("h2")));

    }

    @AfterEach
    public void closeTest() {
        kodillaSearchPom.close();
    }
}