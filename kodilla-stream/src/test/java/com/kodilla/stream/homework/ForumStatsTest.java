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
        List<User> users = new ArrayList<>();
        users.add(new User("Dawid", 39, 115, "A"));
        users.add(new User("Dawid", 40, 55, "A"));
        users.add(new User("Dawid", 41, 992, "A"));
        users.add(new User("Dawid", -50, 120, "A"));
        //when
        double avgOver40 = ForumStats.averageOfPostsOver(40, users);
        //then
        double expectedAvgOver40 = 523.5;
        assertEquals(expectedAvgOver40, avgOver40);

    }

    @Test
    void doesReturnAverageOfPostsUnder() {

    }
}