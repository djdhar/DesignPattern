package org.example.creational.prototype;

public abstract class Shape implements Cloneable {
    private int id;
    public Integer getId() {return id;}
    public void setId(int id) {this.id = id;}
    abstract public void draw();
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
