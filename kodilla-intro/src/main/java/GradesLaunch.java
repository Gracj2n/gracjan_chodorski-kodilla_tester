public class GradesLaunch {
    public static void main(String[] args) {

        Grades grade1 = new Grades();
        grade1.add(3);
        grade1.showGrade();

        Grades grade2 = new Grades();
        grade2.add(2);
        grade2.showGrade();

        Grades grade3 = new Grades();
        grade3.add(4);
        grade3.showGrade();

        Grades grade4 = new Grades();
        grade4.add(1);
        grade4.showGrade();

        System.out.println("");

        Grades averageOfGrades = new Grades();
        averageOfGrades.averageOfGrades();
    }

}