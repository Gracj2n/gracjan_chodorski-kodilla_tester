package Programowanie_Obiektowe_M_2.Grades;

public class Grades {
    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void addGrade(int value) {
        if(this.size == 10) {
            return;
        }
        grades[size] = value;
        size++;
    }
    public int lastAddedGrade() {
        int lastGrade = grades[size - 1];
        return lastGrade;
   }
   public double averageOfGrades() {
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum / size;
   }
   public void showGrades() {
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Grade: " + grades[i]);
        }
   }
}
