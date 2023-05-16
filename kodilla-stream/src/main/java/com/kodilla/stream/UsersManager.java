package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistsUsernames = filterChemistGroupUsernames();
        System.out.println("Chemists: " + chemistsUsernames);

        System.out.println();

        //List<Integer> usersOver35yo = filterUsersOver35(35);
        //System.out.println("Users over 35 years old: " + usersOver35yo);


    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    /*public static List<Integer> filterUsersOver35(int age) {
        List<User> age1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
                return age1;
    }*/
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static int getUserAge(User userAge) {
        return userAge.getAge();
    }
}
