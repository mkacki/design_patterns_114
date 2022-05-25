package pl.sda.java.designPatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderTest {

    private static final String firstName = "Królewna";
    private static final String lastName = "Śnieżka";
    private static final String phone = "555 453 657";
    private static final String address = "address";
    private static final int age = 4;

    @Test
    void shouldCreateUserOnlyWithAllData() {
//        tworzenie obiekktu z builderem
        User user = new User.UserBuilder(firstName, lastName)
                .phone(phone)
                .address(address)
                .age(age)
                .build();
// bez buildera
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setPhone(phone);
//        user.setAddress(address);
//        user.setAge(age);

        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(phone, user.getPhone());
        assertEquals(address, user.getAddress());
        assertEquals(age, user.getAge());
    }

    @Test
    void shouldCreateUserLombokOnlyWithAllData() {

        UserLombok userLombok = UserLombok.builder()
                .firstName(firstName)
                .lastName(lastName)
                .phone(phone)
                .address(address)
                .age(age)
                .build();

        assertEquals(firstName, userLombok.getFirstName());
        assertEquals(lastName, userLombok.getLastName());
        assertEquals(phone, userLombok.getPhone());
        assertEquals(address, userLombok.getAddress());
        assertEquals(age, userLombok.getAge());
    }
}