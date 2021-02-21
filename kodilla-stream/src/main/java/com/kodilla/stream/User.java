package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private int numberOfPost;
    private String group;

    public User(String name, int age, int numberOfPost, String group) {
        this.name = name;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && numberOfPost == user.numberOfPost && Objects.equals(name, user.name) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, numberOfPost, group);
    }
}
