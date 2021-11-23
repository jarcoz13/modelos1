
package com.ud.mp.libreria.logica;

import java.util.Date;

public class Revista extends elementoBibliotecario{
    
    private int volumen;

    public Revista(int id, String title, int stock, String author) {
        super(id, title, stock, author);
    }
    
    public Revista(int id, String title, int stock, String author, int volumen) {
        super(id, title, stock, author);
        this.volumen = volumen;
    }

    public Revista(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }
    
    
    @Override
    public boolean retirarElemento() {
        System.out.println("Retirando " + super.toString() + " " + getTitle());
        return true;
    }

    @Override
    public void agregarElemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
