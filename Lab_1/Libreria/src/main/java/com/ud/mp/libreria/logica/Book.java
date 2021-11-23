package com.ud.mp.libreria.logica;

public class Book {
    private int id;
    private int stock;
    private String author;
    private int year;
    private String title;
    private String editorial;

    public Book(int stock, int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.stock = stock;
    }

    public Book(int id, int stock, String author, int year, String title) {
        this.id = id;
        this.stock = stock;
        this.author = author;
        this.year = year;
        this.title = title;
    }
    
    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
