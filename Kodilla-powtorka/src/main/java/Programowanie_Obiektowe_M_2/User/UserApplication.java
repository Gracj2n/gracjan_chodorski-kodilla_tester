package Programowanie_Obiektowe_M_2.User;

public class UserApplication {
    public static void main(String[] args) {
        User user1 = new User("Dawid", 25);
        User user2 = new User("Michał", 45);
        User user3 = new User("Kamil", 30);

        User[] users = {user1, user2, user3};
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName());
        }
    }
}

