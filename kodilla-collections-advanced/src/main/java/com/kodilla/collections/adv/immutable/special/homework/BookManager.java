package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        for (Book currentBook : books) {
                if (currentBook.equals(book)) {
                    return currentBook;
                }
        }
        books.add(book);
        return book;
    }

    public static List<Book> getBooks() {
        return books;
    }
}
