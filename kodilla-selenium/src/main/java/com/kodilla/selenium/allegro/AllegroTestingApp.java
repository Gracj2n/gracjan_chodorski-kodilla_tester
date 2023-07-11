package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Data/chromedriver_mac64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://allegro.pl");

        WebElement alertAccept = webDriver.findElement(By.xpath("//button[@data-testid=\"accept_home_view_action\"]"));
        alertAccept.click();

        WebElement searchField = webDriver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        searchField.sendKeys("Mavic mini");
        searchField.submit();
    }
}
