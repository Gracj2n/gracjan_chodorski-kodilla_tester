public class Grades {
    private int[] grades;                       // co to i po co taka zmienna? i czemu ma być private
    private int size;
    private int gradeValue;

    public Grades() {                           // konstruktor
        this.grades = new int[10];              //  to jest stworzona tablica?
        this.size = 0;                          // aktualne miejsce w tablicy?
    }

    public void add(int gradeValue) {
        this.gradeValue = gradeValue;
        if (this.size == 10) {
            return;                              // przerywanie działania
        }
        this.grades[this.size] = gradeValue;
        this.size++;
    }

    public void showGrade() {
        System.out.println("Dodano ocenę " + gradeValue + ".");
        }

    public void averageOfGrades() {
        for (int a = 0; a < grades.length; a++) {
            //sumOfGrades = sumOfGrades + this.grades[a];

        }

        //double average = sumOfGrades / grades.length;
        //System.out.println(average);
    }

    //Pokwazywanie Tablicy
    public void showGrades() {
        for (int g = 0; g < grades.length; g++) {
            System.out.println("Ocena:" + grades[g]);
        }
    }
}