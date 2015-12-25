package com.mounika.java.enums;

/**
 * @author pavan
 */
public enum CoffeeSize {
    BIG(10, "Red"), MEDIUM(8, "Blue"), SMALL(5, "Pink");

    private int size;
    private String color;

    CoffeeSize(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CoffeeSize{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}


