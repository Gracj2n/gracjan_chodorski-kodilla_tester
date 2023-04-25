package com.kodilla.abstracts.homework2;

public class Application {
    public static void main(String[] args) {
        HelpDesk jobHelpDesk = new HelpDesk();
        FrontendDeveloper jobFrontendDeveloper = new FrontendDeveloper();
        QualityAssuranceTester jobQualityAssuranceTester = new QualityAssuranceTester();
        JobInfo jobInfo = new JobInfo();
        PersonInfo personInfo = new PersonInfo();


        Person adam = new Person("Adam", 23, jobHelpDesk);
        adam.showResponsibilities();
        //personInfo.showInfo(adam);
        //jobInfo.showJobInfo(jobHelpDesk);

        System.out.println("");


        Person dawid = new Person("Dawid", 33, jobFrontendDeveloper);
        //personInfo.showInfo(dawid);
        //jobInfo.showJobInfo(jobFrontendDeveloper);

        System.out.println("");


        Person kamil = new Person("Kamil", 25, jobQualityAssuranceTester);
        //personInfo.showInfo(kamil);
        //jobInfo.showJobInfo(jobQualityAssuranceTester);
        kamil.showResponsibilities();
        kamil.showInfo(kamil);

    }
}
