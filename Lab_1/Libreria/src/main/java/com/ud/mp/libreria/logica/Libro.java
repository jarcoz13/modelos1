package com.ud.mp.libreria.logica;

import java.util.Date;

public class Libro extends elementoBibliotecario {
    private String editorial;

    public Libro(String editorial, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
        this.editorial = editorial;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
