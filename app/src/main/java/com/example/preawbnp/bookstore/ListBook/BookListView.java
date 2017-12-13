package com.example.preawbnp.bookstore.ListBook;

import android.view.View;
import android.widget.ArrayAdapter;

import com.example.preawbnp.bookstore.model.Book;

import java.util.ArrayList;

public interface BookListView {
        void setBookList(ArrayList<Book> books);
        void onRatioButtonClicked(View view);

}
