package org.example.creational.singleton;

public class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
