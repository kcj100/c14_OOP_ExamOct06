package org.example;

public class Engine {
    private Size size;

    public Engine(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                '}';
    }
}
