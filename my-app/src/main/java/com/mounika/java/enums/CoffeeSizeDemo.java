package com.mounika.java.enums;

/**
 * @author pavan
 */
public class CoffeeSizeDemo {

    public static void main(String[] args) {
        CoffeeSize[] values = CoffeeSize.values();
        for (int i = 0; i < values.length; i++) {
            CoffeeSize cs = values[i];
            if (cs != CoffeeSize.MEDIUM) {
                System.out.println(cs);
            }
        }

    }
}
