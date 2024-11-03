package org.example.creational.singleton;

public class LazySingleton {
    public static LazySingleton instance;
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
