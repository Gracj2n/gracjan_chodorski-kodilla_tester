package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsNumber = new ArrayList<>();

    public School(String schoolName, List<Integer> studentsNumber) {
        this.schoolName = schoolName;
        this.studentsNumber = studentsNumber;
    }

    public int sumOfStudents() {
        int sum = 0;
        for (int students : studentsNumber) {
            sum = sum + students;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsNumber=" + studentsNumber +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsNumber() {
        return studentsNumber;
    }
}
