package com.example.preawbnp.bookstore.model;

import java.util.List;
import java.util.Observable;

public abstract class BookRepository extends Observable {
    public abstract void fetchAllBooks();
    public abstract List<Book> getAllBooks();

}
