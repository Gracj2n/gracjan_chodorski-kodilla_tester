package com.kodilla.abstracts.homework2;

public class Person{
    private String firstName;
    private int age;
    private Job job;
    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public Job getJob() {
        return job;
    }
    public void showResponsibilities() {
        System.out.println(job.getResponsibilities());
    }
    public void showInfo(Person person) {
        System.out.println("Name: " + person.getFirstName());
        System.out.println("Age: " + person.getAge());
    }

}