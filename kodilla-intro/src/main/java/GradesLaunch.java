public class GradesLaunch {
    public static void main(String[] args) {

        Grades grade = new Grades();
        grade.add(3);
        grade.add(4);
        grade.add(5);
        grade.add(6);
        grade.showGrade();

        System.out.println("");

        Grades averageOfGrades = new Grades();
        averageOfGrades.averageOfGrades();

    }
}