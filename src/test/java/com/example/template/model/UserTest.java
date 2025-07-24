package com.example.template.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void testGetLogin() {
        String login = "student";
        String password = "password";
        User utente = new User(login, password);

        String retrivedLogin = utente.getLogin();

        assertEquals(login, retrivedLogin, "getLogin() got an invalid login.");
    }
}