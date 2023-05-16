package com.kodilla.homework;

import com.kodilla.stream.User;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Michał Baron", new Teacher("Prof. Elf")));
        students.add(new Student("Dawid Samolot", new Teacher("Prof. Kamień")));
        students.add(new Student("Kamil Pajonk", new Teacher(null)));
        students.add(new Student("Kasia Talerz", new Teacher("Prof. Mikron")));
        students.add(new Student("Maja Lotnisko", new Teacher(null)));

        for(Student student : students) {
            Optional<Student> a = Optional.ofNullable(student);
            a.ifPresent(u -> System.out.println("uczeń: " + u.getName() + " nauczyciel; " + u.getTeacher()));

            if (student.getTeacher().getName() == null) {
                    System.out.println("<undefined>");
            }
        }
    }
}
