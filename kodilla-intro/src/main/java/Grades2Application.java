public class Grades2Application {
    public static void main(String[] args) {
        Grades2 grade = new Grades2();
        //grade.add(1);
        grade.add(4);
        grade.add(2);
        grade.add(3);
        grade.add(4);
        grade.add(1);
        grade.add(5);
        grade.add(4);
        grade.add(4);
        grade.add(3);

        grade.showGrades2();
        grade.averageOfGrades2();
        grade.lastGrade();
    }
}
