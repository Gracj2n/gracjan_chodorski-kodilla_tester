package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void doesReturnUsernames() {
        //given
        UsersManager usersManager = new UsersManager();
        //when
        List<String> userNames = usersManager.filterChemistGroupUsernames();
        //then
        List<String> expectedNames = new ArrayList<>();
        expectedNames.add(new String("Walter White"));
        expectedNames.add(new String("Gale Boetticher"));
        assertEquals(expectedNames, userNames);
    }

    @Test
    public void doesFilterUsersOver35() {
        //given
        UsersManager ageMethod = new UsersManager();
        //when
        List<User> userNamesOver35 = ageMethod.filterUsersOver35(35);
        //then
        List<Integer> expectedUsersAge = new ArrayList<>();
        expectedUsersAge.add(50);
        expectedUsersAge.add(49);
        expectedUsersAge.add(44);
        expectedUsersAge.add(57);
        assertEquals(expectedUsersAge, userNamesOver35);
    }
}