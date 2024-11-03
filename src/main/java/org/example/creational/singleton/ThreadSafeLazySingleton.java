package org.example.creational.singleton;

public class ThreadSafeLazySingleton {
    public static ThreadSafeLazySingleton instance;
    public synchronized static ThreadSafeLazySingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
