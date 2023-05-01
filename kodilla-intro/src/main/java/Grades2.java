public class Grades2 {
    private int[] Grades;
    private int size;
    public Grades2() {
        this.Grades = new int[10];
        this.size = 0;
    }
    public void add(int gradeValue) {
        if(size == 10) {
            return;
        }
        Grades[size] = gradeValue;
        size++;
    }
    public void showGrades2() {
        for(int i = 0; i < Grades.length; i++) {
            System.out.println("Dodano ocenę: " + Grades[i]);
        }
    }
    public void averageOfGrades2() {
        double suma = 0;
        for(int i = 0; i < Grades.length; i++) {
            suma = suma +Grades[i];
        }
        double average = suma / size;
        System.out.println("Średnia ocen w tablicy to: " + average);
    }
    public void lastGrade() {
        System.out.println("Ostatnio dodana ocena to: " + Grades[size -1]);
    }
}
