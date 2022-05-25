package pl.sda.java.designPatterns.creational.singleton;

public class SingletonEager {

    private static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
