package com.example.hp.prueba2.data;

import com.example.hp.prueba2.models.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 20-08-2017.
 */

public class Queries {
    public List<Book> books() {
        List<Book> books = new ArrayList<>();
        List<Book> bookList = Book.listAll(Book.class);
        if (bookList != null && bookList.size() > 0) {
            books.addAll(bookList);
        }
        return books;
    }


}
