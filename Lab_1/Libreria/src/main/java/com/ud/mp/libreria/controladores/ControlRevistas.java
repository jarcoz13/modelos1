/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ud.mp.libreria.controladores;

import com.ud.mp.libreria.logica.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControlRevistas extends ControladorGenerico<Revista> {
    private List<Revista> revistas;
    public ControlRevistas() {
        this.revistas = new ArrayList<>();
        revistas.add(new Revista("USA", "Salud", revistas.size(), "Rio Grande Review", 10, "Universidad de Texas", 1981));
        revistas.add(new Revista("España", "Esoterico", revistas.size(), "Enigma", 20, "ANONIMO", 1995));
        revistas.add(new Revista("Colombia", "Salud", revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", 1974));   
    }
    @Override
    public List<Revista> getElements() {
        return revistas;
    }

    @Override
    public void listarTodo() {
        revistas.forEach(revista -> {
            revista.imprimir();
        });
    }
    
    public void agregarNuevoElemento( String pais, String categoria, String title, String author, int stock, int anio) {
        super.agregarNuevoElemento(new Revista(pais, categoria, getElements().size(), title, stock, author, anio));
    }
    
    @Override
    public void agregarNuevoElemento(String title, int stock, String author, int anio) {
        super.agregarNuevoElemento(new Revista(getElements().size(),title, stock, author, anio));
    }

    @Override
    public boolean devolverElementos(String titulo, String autor, int cantidad) {
        Revista revista = obtenerElemento(titulo, autor);
        if(revista != null){
            System.out.println("Revista devuelta. \nTítulo: " + titulo + ".");
            revista.agregarElementos(cantidad);
            return true;
        } else {
            System.out.println("Verfica que la revista sea de nuestra biblioteca.");
            return false;
        }
    }

    @Override
    public boolean retirarElemento(String titulo, String autor) {
        Revista revista = obtenerElemento(titulo, autor);
        if(revista != null){
            System.out.println("Revista retirado.\nTítulo: " + titulo + ".");
            super.retirarElemento(revista);
            return true;
        } else {
            System.out.println("NO tenemos la revista en nuestro inventario.\nTítulo: " + titulo + ".");
            return false;
        }
             
    }

    @Override
    public Revista obtenerElemento(String title, String autor) {
        for (Revista revista : revistas) {
            if(revista.getTitulo().equals(title) && revista.getAutor().equals(autor)){
                return revista;
            }
        }
        return null;
    }

    @Override
    public void imprimirElemento(String title) {
        for (Revista revista : revistas) {
            if(revista.getTitulo().equals(title)){
                revista.imprimir();
            }
        }
    }

    @Override
    public boolean prestamoElementos(String titulo, String autor, int cantidad) {
     Revista revista = obtenerElemento(titulo, autor);
        if(revista != null){
           return revista.prestamoElementos(cantidad); 
       } else {
            System.out.println("No existe la revista: "+ titulo);
            return false;
        } 
    }
}
