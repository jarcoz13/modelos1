package com.ud.mp.libreria.logica;

import java.util.Date;

public class Libro extends elementoBibliotecario {
    private String editorial;
    
    public Libro(int id, int stock, String author, String title) {
        super(id, title, stock, author);
    }

    public Libro(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }

    public Libro(int id, String title, int stock, String author, Date fechaPublicacion, String editorial) {
        super(id, title, stock, author, fechaPublicacion);
        this.editorial = editorial;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
