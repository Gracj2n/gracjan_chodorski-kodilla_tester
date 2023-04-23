package com.kodilla.abstracts.homework2;

public class Application {
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        FrontendDeveloper jobFrontendDeveloper = new FrontendDeveloper();
        QualityAssuranceTester jobQualityAssuranceTester = new QualityAssuranceTester();
        JobInfo jobInfo = new JobInfo();
        PersonInfo personInfo = new PersonInfo();

        Person adam = new Person("Adam", 23, "Help Desk");
        personInfo.showInfo(adam);
        jobInfo.showJobInfo(helpDesk);
        System.out.println("");

        Person dawid = new Person("Dawid", 33, "Frontend Developer");
        personInfo.showInfo(dawid);
        jobInfo.showJobInfo(jobFrontendDeveloper);
        System.out.println("");

        Person kamil = new Person("Kamil", 25, "Quality Assurance Tester");
        personInfo.showInfo(kamil);
        jobInfo.showJobInfo(jobQualityAssuranceTester);

    }
}
