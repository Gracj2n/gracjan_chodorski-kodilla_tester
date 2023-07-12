package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Data/chromedriver_mac64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://allegro.pl");

        WebElement alertAccept = webDriver.findElement(By.xpath("//button[@data-testid=\"accept_home_view_action\"]"));
        alertAccept.click();

        WebElement searchField = webDriver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        //WebElement searchField = webDriver.findElement(By.cssSelector("//form[@data-role=\"search-form\"]"));
        //WebElement searchField = webDriver.findElement(By.tagName("._535b5_Y5CDc"));
        //WebElement searchField = webDriver.findElement(By.className("msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc"));
        //searchField.click();
        searchField.sendKeys("Mavic mini");
        //searchField.submit();

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/form[@data-role=\"search-form")));



        //List<WebElement> mavicList = webDriver.findElements(By.className("mp0t_0a mgmw_3z mgn2_14 mqu1_21"));;
        //mavicList.get(1);

        //List<WebElement> mavicList = webDriver.findElements(By.xpath("//div[@class=\"mqu1_1\"]"));
        //mavicList.get(0).findElement(By.className("mqu1_1")).click();


    }
}
