package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPom {
    protected WebDriver webDriver;

    public AbstractPom(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
