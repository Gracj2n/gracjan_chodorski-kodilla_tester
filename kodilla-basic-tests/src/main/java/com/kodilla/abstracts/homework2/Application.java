package com.kodilla.abstracts.homework2;

public class Application {
    public static void main(String[] args) {
        HelpDesk jobHelpDesk = new HelpDesk();
        FrontendDeveloper jobFrontendDeveloper = new FrontendDeveloper();
        QualityAssuranceTester jobQualityAssuranceTester = new QualityAssuranceTester();

        Person adam = new Person("Adam", 23, jobHelpDesk);
        adam.showResponsibilities();
        adam.showInfo();

        System.out.println("");

        Person dawid = new Person("Dawid", 33, jobFrontendDeveloper);
        dawid.showResponsibilities();
        dawid.showInfo();

        System.out.println("");

        Person kamil = new Person("Kamil", 25, jobQualityAssuranceTester);
        kamil.showResponsibilities();
        kamil.showInfo();

    }
}
