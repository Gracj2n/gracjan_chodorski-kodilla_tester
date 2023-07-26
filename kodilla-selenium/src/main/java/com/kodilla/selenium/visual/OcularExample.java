package com.kodilla.selenium.visual;

//import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/chromedriver_mac64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

//        Ocular.config()
//                .resultPath(Paths.get("/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/Ocular/results"))
//                .snapshotPath(Paths.get("/Users/gracjanchodorski/Desktop/gracjan_chodorski-kodilla_tester/Ocular/snapshots"))
//                .globalSimilarity(95)
//                .saveSnapshot(true);
//
//        WorldTimePage page = new WorldTimePage(webDriver);
//        page.open();
//        page.compare();
//        page.close();
    }
}
