package com.example.preawbnp.bookstore.ListBook;;

import com.example.preawbnp.bookstore.model.Book;
import com.example.preawbnp.bookstore.model.BookRepository;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

public class listBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_books);
    }
}