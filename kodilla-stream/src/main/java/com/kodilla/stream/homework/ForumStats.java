package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsOver40 = averageOfPostsOver(40, UsersRepository.getUsersList());
        System.out.println("Average posts users over 40 years old: " + avgPostsOver40);

        System.out.println();

        double avgPostsUnder40 = averageOfPostsUnder(40, UsersRepository.getUsersList());
        System.out.println("Average posts users udner 40 years old: " + avgPostsUnder40);
    }

    public static double averageOfPostsOver(int age, List<User> listUsers) {
        double avgOver = listUsers
                .stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgOver;
    }

    public static double averageOfPostsUnder(int age, List<User> listUsers) {
        double avgUnder = listUsers
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgUnder;
    }
}
