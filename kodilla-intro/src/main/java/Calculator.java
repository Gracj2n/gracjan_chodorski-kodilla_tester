public class Calculator {
    static final double PI = 3.1415927;          // [1]
    static int counter = 0;                 // zmienna statyczna counter
    public Calculator() {                   // konstruktor
        counter++;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        //String name = UserDialogs.getUsername();
        //System.out.println(name);
        System.out.println(UserDialogs.getUsername());
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI *r;
    }
}
