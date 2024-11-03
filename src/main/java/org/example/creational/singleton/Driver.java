package org.example.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(EagerSingleton.getInstance());
        objectList.add(LazySingleton.getInstance());
        objectList.add(ThreadSafeLazySingleton.getInstance());
        objectList.add(ThreadSafeOverheadOptimizedLazySingleton.getInstance());
        objectList.add(BillPughSingleton.getInstance());
        long count = objectList.stream().filter(obj -> Objects.nonNull(obj)).count();
        System.out.println(count);
    }
}
