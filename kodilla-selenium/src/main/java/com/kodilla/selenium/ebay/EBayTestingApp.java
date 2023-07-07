package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/data/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        //WebElement searchField = driver.findElement(By.className("gh-tb ui-autocomplete-input"));
        WebElement searchField = driver.findElement(By.name("_nkw"));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
