package com.ud.mp.libreria.logica;

import java.util.Date;

public class Book extends elementoBibliotecario {
    private String editorial;
    private int year;

    public Book(int id, int stock, String author, int year, String title) {
        super(id, title, stock, author);
    }

    public Book(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }

    public Book(String editorial, int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
        this.editorial = editorial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



    @Override
    public void agregarElemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
