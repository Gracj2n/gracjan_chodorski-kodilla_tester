package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"User1231.-_","user1","USER","123","User_Us",".uS-Er"})
    public void shouldReturnTrueWhenUsernameIsCorrect(String username) {
        assertEquals(true, userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"1","a2","!a","US"})
    public void shouldReturnFalseWhenUsernameIsUnderThreeChars(String username) {
        assertEquals(false, userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"1","!!!!@","@#._-","$","(00(!", "'"})
    public void shouldReturnFalseWhenUsernameUseIncorrectChars(String username) {
        assertEquals(false, userValidator.validateUsername(username));
    }


    @ParameterizedTest
    @CsvSource(value = {"User1231.-_@gmail.com","user1@o2.pl","USER@user.ee","123@user-s.eu","User.Us@us.c","uS_Er@-.pl"})
    public void shouldReturnTrueWhenEmailIsCorrect(String email) {
        assertEquals(true, userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @CsvSource(value = {"1@o2pl","!!!!@.pl","@#._.pl-","$@gmail","oslo.@.(00(!", "'", ".uS_Er@-.pl"})
    public void shouldReturnFalseWhenEmailUseIncorrectChars(String email) {
        assertEquals(false, userValidator.validateEmail(email));
    }

}