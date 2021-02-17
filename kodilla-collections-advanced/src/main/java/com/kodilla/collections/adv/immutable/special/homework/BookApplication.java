package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("Ogniem i mieczem", "Henryk Sienkiewicz");
        Book book2 = BookManager.createBook("Wesele", "Stanisław Wyspiański");
        Book book3 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book4 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");

        System.out.println(book2 == book3);
        System.out.println(book1 == book3);
        System.out.println(book1 == book2);
        System.out.println(book3 == book4);

        System.out.println(BookManager.getBooks().size());
    }
}
