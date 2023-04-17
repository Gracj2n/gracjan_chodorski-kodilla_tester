public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) { //konstruktor
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAgeAndHeight() { //metoda chechAgeAndHeight
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
