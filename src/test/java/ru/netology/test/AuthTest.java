package ru.netology.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataGenerator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AuthTest {

    @BeforeAll
    static void setUpAll() {
        var user = DataGenerator.getRegistrationDto("vasya", "password", "active");
        DataGenerator.sendRequest(user);
    }

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    public void shouldLogin() {
        $("[data-test-id='login'] input").setValue("vasya");
        $("[data-test-id='password'] input").setValue("password");
        $("[data-test-id='action-login']").click();
    }
}
