package exercise;

public class Book {
    private String author;
    private String title;

    static Book of(String author, String title) {
    System.out.println(Book.of(author, title));
        return of(author, title);
    }
}