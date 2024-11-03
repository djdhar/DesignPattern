package org.example.creational.singleton;

public class ThreadSafeOverheadOptimizedLazySingleton {
    public static ThreadSafeOverheadOptimizedLazySingleton instance;
    public static ThreadSafeOverheadOptimizedLazySingleton getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeOverheadOptimizedLazySingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeOverheadOptimizedLazySingleton();
                }
            }

        }
        return instance;
    }
}
