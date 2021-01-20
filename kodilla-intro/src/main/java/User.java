public class User {
    String name;
    int yearsOld;
    private User[] users;

    public User() {
        users = new User[]{new User("Paweł", 34), new User("Wojtek", 67),
                new User("Michał", 37), new User("Marta", 35)};
    }
    public User(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;

    }

    public void main() {
        int sum = 0;
        double avg;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].yearsOld;
        }
        avg = sum / users.length;
        System.out.println(avg);
        for (int i = 0; i < users.length; i++) {
            if (users[i].yearsOld < avg) {
                System.out.println(users[i].name + " " + users[i].yearsOld);
            }

        }

    }


}
