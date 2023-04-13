public class Grades {


    int[] grades;  /* co to i po co taka zmienna? i czemu private */
    int size ;
    int grade;

    public Grades(int grade) { /* konstruktor */
        this.grades = new int[10];  /* to jest stworzona tablica? */
        this.size = 0;              /* aktualne miejsce w tablicy? */
        this.grade = grade;

        for (int g = grades.length -1; g >= 0; g--) {
            System.out.println(grades[g]);             /* wyświetlanie aktualnej tablicy */
        }

    }

    public void add(int gradeValue) {
        if (this.size == 10) {
          return;                 /* przerywanie działania */
      }
        this.grades[this.size] = gradeValue;
        this.size++;
    }
}

