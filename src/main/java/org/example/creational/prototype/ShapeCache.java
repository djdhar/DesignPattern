package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    public static Map<Integer, Shape> cache = new HashMap();
    public static void loadCache() {
        cache.put(1, new Circle(1));
        cache.put(2, new Rectangle(2));
    }
    public static Shape getShape(Integer shapeId) {
        Shape cachedShape = cache.get(shapeId);
        return (cachedShape != null) ? cachedShape.clone() : null;
    }
}
