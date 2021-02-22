package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avrCountPostsOlders = UsersRepository.getUsersList()
                .stream()
                .filter(i -> i.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average count of posts olders users is " + avrCountPostsOlders);

        double avrCountPostsYoungers = UsersRepository.getUsersList()
                .stream()
                .filter(i -> i.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average count of posts youngers users is " + avrCountPostsYoungers);
    }
}
