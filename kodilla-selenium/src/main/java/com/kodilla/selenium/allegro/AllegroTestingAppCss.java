package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AllegroTestingAppCss {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Data/chromedriver_mac64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://allegro.pl");

        //Amazon.pl
        //webDriver.get("https://amazon.pl");
        //WebElement alertAccept = webDriver.findElement(By.id("sp-cc-accept"));
        //WebElement searchField = webDriver.findElement(By.id("twotabsearchtextbox"));

        //WebElement alertAccept = webDriver.findElement(By.xpath("//button[@data-testid='accept_home_view_action']"));
        WebElement alertAccept = webDriver.findElement(By.cssSelector("button[data-role=\"accept-consent\"]"));
        alertAccept.click();

        //ebElement searchField = webDriver.findElement(By.xpath("//input[@data-role='search-input']"));
        WebElement searchField = webDriver.findElement(By.cssSelector("input[data-role=\"search-input\"]"));
        searchField.sendKeys("Mavic mini");

        //WebElement firstProduct = webDriver.findElement(By.xpath("//a[@href=\"/listing?string=dji%20mavic%20mini\"]"));
        //WebElement secondProduct = webDriver.findElement(By.xpath("//a[@href=\"/listing?string=dji%20mavic%20mini%202\"]"));
        WebElement firstProduct = webDriver.findElement(By.cssSelector("a[href=\"/listing?string=dji%20mavic%20mini\"]"));
        WebElement secondProduct = webDriver.findElement(By.cssSelector("a[href=\"/listing?string=dji%20mavic%20mini%202\"]"));

        List<WebElement> productList = new ArrayList<>();
        productList.add(firstProduct);
        productList.add(secondProduct);

        System.out.println(firstProduct.getText());
        System.out.println(secondProduct.getText());
        System.out.println(productList.get(0).getText());
        System.out.println(productList.get(1).getText());
    }
}
