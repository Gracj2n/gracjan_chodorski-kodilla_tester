public class User {
    String name;
    int age;
    int height;
    public User(String name, int age, int height) { //konstruktor
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        User maciek = new User("Maciek", 23, 185);
        User dawid = new User("Dawid", 24,159);
        User krzysiek = new User("Krzysiek", 30, 157);
        User igor = new User("Igor", 35, 191);
        User kamil = new User("Kamil", 45, 165);

        User[] users = {maciek, dawid, krzysiek, igor, kamil};

        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name);
            users[i].validate();
        }
    }
    public void validate(){
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println(" is older than 30 and taller than 160cm");
            } else {
                System.out.println(" is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}

