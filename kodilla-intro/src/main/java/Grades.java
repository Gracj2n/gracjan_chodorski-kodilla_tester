public class Grades {
    private int[] grades;                       // czemu ma być private
    private int size;

    public Grades() {                           // konstruktor
        this.grades = new int[10];              //  to jest stworzona tablica?
        this.size = 0;                          // aktualne miejsce w tablicy? czemu 0
    }

    public void add(int gradeValue) {
        if (this.size == 10) {
            this.size= 0;
            return;                              // przerywanie działania

        }
        this.grades[this.size] = gradeValue;
        this.size++;
    }

    public int showGrade() {
        return this.grades[this.size - 1];
    }

    public double averageOfGrades() {
        double sumOfGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            sumOfGrades = sumOfGrades + this.grades[i];
        }
        return sumOfGrades / this.size;
    }

    //Pokwazywanie Tablicy
    public int[] showGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Ocena: " + grades[i]);
        }
        return this.grades;
    }
}