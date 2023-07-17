package com.kodilla.selenium.kodilla_shop;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaSearchPom extends AbstractPom {

    @FindBy(css = "input[id='searchField']")
    WebElement searchField;
    @FindBy(xpath = "//span[@class=\"close-icon\"]")
    WebElement closeAlert;

    public KodillaSearchPom(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void closeAlert() {
        closeAlert.click();
    }
    public boolean search(String searchFor) {
        searchField.sendKeys(searchFor);
        searchField.submit();
        return true;
    }

    public void close() {
        webDriver.close();
    }
}
