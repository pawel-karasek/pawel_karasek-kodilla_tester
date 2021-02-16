public class UserApplication {
    public static void main(String[] args) {

        User karasek = new User("Paweł", "Karasek");

            System.out.println("imię: " + karasek.getName() + ", nazwisko: " + karasek.getSurname());

            karasek.setName("Pawcio");
            karasek.setSurname("Karuzel");

        System.out.println("nowe imię: " + karasek.getName() + ", nowe nazwisko: " + karasek.getSurname());
    }
}
