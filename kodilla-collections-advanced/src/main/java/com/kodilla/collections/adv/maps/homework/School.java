package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
        public String name;

    public ArrayList<Klasa> classes = new ArrayList<>();

    public School(String name, Klasa ... classes) {
        this.name = name;

        for (Klasa clas : classes)
            this.classes.add(clas);
    }
    public void addClass(Klasa clas) {
        classes.add(clas);
    }

    public int getSumStudents() {
        int sum = 0;
        for (Klasa clas : classes) {
        sum += clas.studentCount;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students count:" + getSumStudents() + "}";
    }
}
