package org.example.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").name("Oleksandr").occupation("UCU").age(31).gender(Gender.MALE).build();
        System.out.println(user);
    }
}
