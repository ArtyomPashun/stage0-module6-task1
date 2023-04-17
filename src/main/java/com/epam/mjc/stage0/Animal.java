package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String colour, int numberOfPaws, boolean hasFur) {
        this.color = colour;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append("This animal is mostly ").append(color);
        if (numberOfPaws == 1) {
            str.append(". It has ").append(numberOfPaws).append(" paw and");
        } else {
            str.append(". It has ").append(numberOfPaws).append(" paws and");
        }
        if (hasFur) {
            str.append(" a fur.");
        } else {
            str.append(" no fur.");
        }
        return str.toString();
    }

}
