public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();   //obiekt

        double area = calculator.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of PI is equal to " + p);
        //System.out.println("The value of PI is equal to " + Calculator.PI);


        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
        //System.out.println(Calculator.counter);
    }
}
