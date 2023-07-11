package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Data/chromedriver_mac64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://allegro.pl");

        WebElement alertAccept = webDriver.findElement(By.xpath("//button[@data-testid=\"accept_home_view_action\"]"));
        alertAccept.click();

        //WebElement searchField = webDriver.findElement(By.cssSelector("div > .mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 mp7g_oh\""));
        //WebElement searchField = webDriver.findElement(By.className("mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 mp7g_oh"));
        //WebElement searchField = webDriver.findElement(By.cssSelector("div[class*'\"mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 mp7g_oh\"']"));

        //searchField.click();
        //searchField.sendKeys("Mavic mini");
    }
}
