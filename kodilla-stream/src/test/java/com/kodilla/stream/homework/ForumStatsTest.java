package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void doesReturnAverageOfPostsOver() {
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Dawid", 39, 115, "A"));
        testUsers.add(new User("Dawid", 40, 55, "A"));
        testUsers.add(new User("Dawid", 41, 992, "A"));
        testUsers.add(new User("Dawid", -50, 120, "A"));
        //when
        double avgOver40 = ForumStats.averageOfPostsOver(40, testUsers);
        //then
        double expectedAvgOver40 = 523.5;
        assertEquals(expectedAvgOver40, avgOver40);
    }

    @Test
    void doesReturnAverageOfPostsUnder() {
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Dawid", 47, 135, "A"));
        testUsers.add(new User("Dawid", 26, 315, "A"));
        testUsers.add(new User("Dawid", 31, 592, "A"));
        testUsers.add(new User("Dawid", 65, 20, "A"));
        //when
        double avgUnder40 = ForumStats.averageOfPostsUnder(40, testUsers);
        //then
        double expectedAvgUnder40 = 453.5;
        assertEquals(expectedAvgUnder40, avgUnder40);
    }
    @Test
    void doesReturnAverageOfPostsMinusAge() {
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Dawid", 47, 135, "A"));
        testUsers.add(new User("Dawid", -26, 315, "A"));
        testUsers.add(new User("Dawid", -31, 592, "A"));
        testUsers.add(new User("Dawid", 65, 20, "A"));
        //when
        double avgUnder40 = ForumStats.averageOfPostsUnder(40, testUsers);
        //then
        double expectedAvgUnder40 = 453.5;
        assertEquals(expectedAvgUnder40, avgUnder40);
    }
}