public class User {
    String name;
    int age;
    String[] users;  //zmienna tablicy z imionami?

    public User(String name, int age) { //konstruktor
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User maciek = new User("Maciek", 23);
        User dawid = new User("Dawid", 24);
        User krzysiek = new User("Krzysiek", 30);
        User igor = new User("Igor", 21);
        User kamil = new User("Kamil", 45);

        User[] users = {maciek, dawid, krzysiek, igor, kamil};
       // maciek.checkAge();
    }
  // private void checkAge() {
       // for (int i = 0; i < users.length; i++) {
        //    System.out.println(this.name);
       // }
    //}
}

