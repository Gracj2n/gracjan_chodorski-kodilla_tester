package Programowanie_Obiektowe_M_2.Grades;

public class GradesApplication {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.addGrade(5);
        grades.addGrade(1);
        grades.addGrade(4);
        grades.addGrade(2);
        grades.addGrade(3);
        grades.addGrade(4);
        grades.addGrade(2);
        grades.addGrade(5);
        grades.addGrade(4);
        grades.addGrade(6);

        System.out.println("Osatatnio dodana ocena to: " + grades.lastAddedGrade());
        System.out.println("Średna ocen: " + grades.averageOfGrades());
        grades.showGrades();


    }
}
