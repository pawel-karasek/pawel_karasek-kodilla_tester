package com.kodilla.rest.domain;

import java.util.Objects;

public class BookDto {

    private String author;
    private String title;

    public BookDto() {
    }

    public BookDto(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto)) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(author, bookDto.author) && Objects.equals(title, bookDto.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
