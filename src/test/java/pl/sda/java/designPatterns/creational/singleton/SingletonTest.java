package pl.sda.java.designPatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void shouldCreateOnlyOneInstanceLazy() {

        SingletonLazy singleton1 = SingletonLazy.getInstance();
        SingletonLazy singleton2 = SingletonLazy.getInstance();

        assertTrue(singleton1 == singleton2);
    }

    @Test
    void shouldCreateOnlyOneInstanceEager() {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        assertTrue(singletonEager1 == singletonEager2);
    }
}