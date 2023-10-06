package org.example;

public enum Size {
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private final String size;
    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }
}
