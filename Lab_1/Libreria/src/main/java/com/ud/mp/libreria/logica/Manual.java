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
    private String dispositivo;
    private String hechoEn;
    

    public Manual(int id, String title, int stock, String author) {
        super(id, title, stock, author);
    }

    public Manual(int id, String title, int stock, String author, Date fechaPublicacion) {
        super(id, title, stock, author, fechaPublicacion);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getHechoEn() {
        return hechoEn;
    }

    public void setHechoEn(String hechoEn) {
        this.hechoEn = hechoEn;
    }

    
    
}
