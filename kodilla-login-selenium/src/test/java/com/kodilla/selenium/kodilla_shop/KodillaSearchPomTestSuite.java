package com.kodilla.selenium.kodilla_shop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
        webDriver = new ChromeDriver(chromeOptions);
        kodillaSearchPom = new KodillaSearchPom(webDriver);
        webDriver.get("https://kodilla.com/pl/test/store");
    }

    @Test
    public void shouldSearchForNoteBook() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("NoteBook");
        Assertions.assertEquals(2, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForSchool() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("School");
        Assertions.assertEquals(1, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForSchoolDifferentSizeOfChar() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("scHoOl");
        Assertions.assertEquals(1, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForBrand() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("Brand");
        Assertions.assertEquals(1, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForBussines() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("Bussines");
        Assertions.assertEquals(1, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForGaming() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("Gaming");
        Assertions.assertEquals(1, kodillaSearchPom.foundElements.size());
    }

    @Test
    public void shouldSearchForPowerful() {
        kodillaSearchPom.closeAlert();
        kodillaSearchPom.search("Powerful");
        Assertions.assertEquals(0, kodillaSearchPom.foundElements.size());
    }

    @AfterEach
    public void closeTest() {
        kodillaSearchPom.close();
    }
}