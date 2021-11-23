/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ud.mp.libreria.logica;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Manual extends elementoBibliotecario{

    public Manual(int id, String title, int stock, String author) {
        super(id, title, stock, author);
    }

    public Manual(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }

    @Override
    public void agregarElemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
