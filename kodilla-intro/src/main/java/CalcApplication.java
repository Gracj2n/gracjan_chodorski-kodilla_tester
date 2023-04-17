public class CalcApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double area = calc.circlePerimeter(2);
        System.out.println(area);

        double pi = Calculator.PI;
        System.out.println(pi);

        Calculator calc2 = new Calculator();
        System.out.println(calc2.circleArea(1));
    }
}
