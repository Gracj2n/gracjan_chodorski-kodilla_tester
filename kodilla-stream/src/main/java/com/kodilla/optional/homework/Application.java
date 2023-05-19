package com.kodilla.optional.homework;

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
            Optional<String> a = Optional.ofNullable(student.getTeacher().getName());
            String string = a.orElse("<undefined>");

            System.out.println("Uczeń: " + student.getName() + " Nauczyciel: " + string);
            }
        }
    }

