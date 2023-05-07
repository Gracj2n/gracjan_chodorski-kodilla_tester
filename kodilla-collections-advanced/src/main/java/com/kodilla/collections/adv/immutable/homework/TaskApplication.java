package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {
    public static void main(String[] args) {
        Task task = new Task("Task test.", 0);

        System.out.println(task.title() + " " + task.duration());


    }
}
