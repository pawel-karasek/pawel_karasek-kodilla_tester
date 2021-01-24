package app;

public class Person {
    String name;
    double age;
    double height;

    Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void check() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("second.FirstClass.User is older than 30 and higher than 160cm");
            } else {
                System.out.println("second.FirstClass.User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
