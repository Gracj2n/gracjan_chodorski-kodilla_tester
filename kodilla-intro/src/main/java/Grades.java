public class Grades {
    private int[] grades;  // co to i po co taka zmienna? i czemu ma być private
    private int size;
    private int gradeValue;
    private int sumOfGrades;

    public Grades() {              // konstruktor
        this.grades = new int[10];              //  to jest stworzona tablica?
        this.size = 3; /* aktualne miejsce w tablicy? */
    }

    public void add(int gradeValue) {
        this.gradeValue = gradeValue;
        if (this.size == 10) {
            return;                 // przerywanie działania
        }
        this.grades[this.size] = gradeValue;
        this.size++;
    }

    public void showGrade() {
        System.out.println("Dodano ocenę " + this.gradeValue + ".");
    }

    public void averageOfGrades() {
        int[] oceny = new int[]{1, 3, 4, 5, 6, 3};
        double sumOfGrades = 0;
        for (int a = 0; a < oceny.length; a++) {
            sumOfGrades += oceny[a];
        }
        double average = sumOfGrades / oceny.length;
        System.out.println(average);
    }

    //Pokwazywanie Tablicy
    public void showGrades() {
        for (int g = 0; g < grades.length; g++) {
            System.out.println("Ocena:" + grades[g]);
        }
    }
}