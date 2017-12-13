package com.example.preawbnp.bookstore.ListBook;

import com.example.preawbnp.bookstore.model.Book;
import com.example.preawbnp.bookstore.model.BookRepository;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

class BookListPresenter implements Observer{
    private BookListView view;
    private BookRepository repository;

    ArrayList<Book> books;

    public BookListPresenter(BookRepository repository,BookListView view){
        this.repository = repository;
        this.view = view;
    }

    public void initialize() {
        repository.addObserver(this);
        repository.fetchAllBooks();
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o == repository) {
            books = new ArrayList<>(repository.getAllBooks());
            view.setBookList(books);
        }
    }

    public BookRepository sortByTitle() {
        return repository;
    }

    public BookRepository sortByYear() {
        return repository;
    }
}
