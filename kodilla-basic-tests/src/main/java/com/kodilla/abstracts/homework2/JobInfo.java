package com.kodilla.abstracts.homework2;

public class JobInfo {
    public void showJobInfo(Job job) {
        System.out.println("Salary: " + job.getSalary());
        System.out.println("Responsibilities: " + job.getResponsibilities());
    }
}
