package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double high;
    private double width;
    private boolean marked;

    public Stamp(String name, double high, double width, boolean marked) {
        this.name = name;
        this.high = high;
        this.width = width;
        this.marked = marked;
    }

    public String getName() {
        return name;
    }

    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }

    private String isStamped() {
        if (marked){
            return "is marked";
        } else {
            return "is not marked";
        }
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", high=" + high +
                ", width=" + width +
                ", marked=" + isStamped() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.high, high) == 0 && Double.compare(stamp.width, width) == 0 && marked == stamp.marked && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, high, width, marked);
    }
}
