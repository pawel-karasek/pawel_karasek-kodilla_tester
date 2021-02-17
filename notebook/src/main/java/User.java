public class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
/*

    static List<Book> books = new ArrayList<>();

    boolean bookExists = false;
        for (Book bookx : books) {
                if (book.equals(bookx)) {
                System.out.println(bookx + " already exist");
                bookExists = true;
                }
                }
                if (!bookExists) {
                books.add(book);
                }

                */