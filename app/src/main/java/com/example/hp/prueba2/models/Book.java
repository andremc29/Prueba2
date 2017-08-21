package com.example.hp.prueba2.models;

import com.orm.SugarRecord;

/**
 * Created by HP on 20-08-2017.
 */

public class Book extends SugarRecord {
    private String name, author, review;
    private int progress;

    public Book(String name, String author, String review, int progress) {
        this.name = name;
        this.author = author;
        this.review = review;
        this.progress = progress;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
