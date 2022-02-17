package ru.netology.data;

public class RegistrationDto {

    public RegistrationDto(String name, String password, String status) {
    }

    private String name;
    private String password;
    private String status;
     String body = "{" +
            "\"login\":" + name +
            "\"password\":" + password +
            "\"status\":" + status +
            "}";
}
