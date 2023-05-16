package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User(null, 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(userr -> System.out.println(userr.getUsername()));

        String username =
                optionalUser.orElse(new User("Dawid", 30, 100, "Test")).getUsername();
        System.out.println(username);

    }
}
