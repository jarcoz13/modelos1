
package com.ud.mp.libreria.logica;

import java.util.Date;

public class Revista extends elementoBibliotecario{
    private String pais;
    private String categoria;

    public Revista(String pais, String categoria, int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
        this.pais = pais;
        this.categoria = categoria;
    }

    public Revista(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }  

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
