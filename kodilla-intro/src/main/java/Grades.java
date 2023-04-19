public class Grades {
    private int[] grades;                       // czemu ma być private
    private int size;

    public Grades() {                           // konstruktor
        this.grades = new int[10];              //  to jest stworzona tablica?
        this.size = 0;                          // aktualne miejsce w tablicy?
    }

    public void add(int gradeValue) {
        if (this.size == 10) {
            return;                              // przerywanie działania
        }
        this.grades[this.size] = gradeValue;
        this.size++;
    }

    public int showGrade() {
        return this.grades[this.size - 1];
    }

    public double averageOfGrades() {
        double sumOfGrades = 0; //czemu zero
        for (int i = 0; i < grades.length; i++) {
            sumOfGrades = sumOfGrades + this.grades[i];
        }
        return sumOfGrades / this.size;
    }

    //Pokwazywanie Tablicy
    public int[] showGrades() {
        for (int g = 0; g < grades.length; g++) {
            System.out.println("Ocena:" + grades[g]);
        }
        return this.grades;
    }
}