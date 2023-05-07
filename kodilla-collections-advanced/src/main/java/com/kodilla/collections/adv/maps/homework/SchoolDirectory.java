package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> info = new HashMap<>();

        //Stworzenie dyrektorów / klasa Principal
        Principal michael = new Principal("Michael", "Lenor");
        Principal adam = new Principal("Adam", "South");
        Principal mathew = new Principal("Mathew", "Host");

        //Stworzenie szkół z liczbą uczniów w klasach / klasa School
        School michaelsSchool = new School("Academy of Michaels", Arrays.asList(35, 20, 27, 30));
        School adamsSchool = new School("Academy of Adams", Arrays.asList(26, 30, 17, 29));
        School mathewsSchool = new School("Academy of Mathews", Arrays.asList(25, 30, 19, 22));

        //Dodanie obiektów do mapy o nazwie info
        info.put(michael, michaelsSchool);
        info.put(adam, adamsSchool);
        info.put(mathew, mathewsSchool);

        //Wszyscy dyrektorzy (ich obiekty) z mapy info
        for (Map.Entry<Principal, School> principalEntry : info.entrySet()) {
            System.out.println(principalEntry.getKey().getPrincipalName() + " " + principalEntry.getKey().getGetPrincipalLastName() + " is principal school " + "'" + principalEntry.getValue().getSchoolName() + "'");
            //wejście do principal.pobranieklucza(np. michael).użycie metody zwracającej imię                                                                        wejście do principal.pobranie wartości.użycie metody z klasy school

            System.out.println("'" + principalEntry.getValue().getSchoolName() + "'" + " has: " + principalEntry.getValue().sumOfStudents()+ " students.");
            //wyświetlenie nazwy szkoły oraz użycie metody sumOfStudents() z klasy School

            //System.out.println(principalEntry.getValue().getStudentsNumber());
            //wyświetlenie szkolnych klas i liczbę uczniów każdej z nich

            System.out.println();
        }
    }
}
