
package com.ud.mp.libreria.logica;

import java.util.Date;

public class Revista extends elementoBibliotecario{
    private String pais;
    private String categoria;

    public Revista(int id, String title, int stock, String author) {
        super(id, title, stock, author);
    }
    
    public Revista(int id, String title, int stock, String author, String pais, String categoria) {
        super(id, title, stock, author);
        this.pais = pais;
        this.categoria = categoria;
    }

    public Revista(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }  
}
