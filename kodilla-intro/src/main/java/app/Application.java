package app;

public class Application {
    public static void main(String[] args) {

        Person person = new Person("Adam", 35, 178);
        person.check();

        person = new Person(null, 35, 178);
        person.check();
        /*
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

         */
    }
}
