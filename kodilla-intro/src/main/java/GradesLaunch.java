public class GradesLaunch {
    public static void main(String[] args) {

        Grades grade = new Grades();
        grade.add(5);
        grade.add(4);
        grade.add(5);
        grade.add(6);
        grade.add(6);
        grade.add(6);
        grade.add(6);
        grade.add(6);
        grade.add(6);
        grade.add(4);
        grade.add(5);

        grade.showGrade();

        System.out.println(grade.showGrade());
        System.out.println(grade.averageOfGrades());
        System.out.println(grade.showGrades());
    }
}