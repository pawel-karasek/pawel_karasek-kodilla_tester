package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

class BookTest {

    Book book = new Book("Sienkiewicz", "Potop");

    @Test
    void shouldGetAuthor() {
        System.out.println(book.getAuthor());
    }

    @Test
    void shouldGetTitle() {
        System.out.println(book.getTitle());
    }
}