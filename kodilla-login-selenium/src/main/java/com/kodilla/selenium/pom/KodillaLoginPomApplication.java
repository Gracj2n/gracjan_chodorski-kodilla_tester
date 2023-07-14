package com.kodilla.selenium.pom;

public class KodillaLoginPomApplication {
    public static void main(String[] args) {
        KodillaLoginPom kodillaLoginPom = new KodillaLoginPom();
        kodillaLoginPom.login("test@kodilla.com", "kodilla123");
        //kodillaLoginPom.close();
    }
}
