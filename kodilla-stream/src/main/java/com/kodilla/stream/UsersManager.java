package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistsUsernames = filterChemistGroupUsernames();
        System.out.println("Chemists: " + chemistsUsernames);

        System.out.println();

        List<User> usersOver35yo = filterUsersOver35(35);
        System.out.println("Users over 35 years old: " + usersOver35yo);

        List<User> usersOver35yoV2 = filterUsersOver35v2(35);
        System.out.println("V2 Users over 35 years old: " + usersOver35yoV2);

    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<User> filterUsersOver35(int age) {
        List<User> age1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
                return age1;
    }

    public static List<User> filterUsersOver35v2(int age) {
        List<User> age2 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() > age)
                .toList();
                return age2;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static int getUserAge(User userAge) {
        return userAge.getAge();
    }
}
