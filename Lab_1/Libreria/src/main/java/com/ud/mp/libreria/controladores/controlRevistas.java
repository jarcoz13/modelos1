/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ud.mp.libreria.controladores;

import com.ud.mp.libreria.logica.Manual;
import com.ud.mp.libreria.logica.Revista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class controlRevistas {
    private List<Revista> revistas;
    public controlRevistas() {
        this.revistas = new ArrayList<Revista>();
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        
        try {
            revistas.add(new Revista("USA", "Salud", revistas.size(), "Rio Grande Review", 10, "Universidad de Texas", objSDF.parse("01-01-1981")));
            revistas.add(new Revista("España", "Esoterico", revistas.size(), "Enigma", 20, "ANONIMO", objSDF.parse("01-01-1995")));
            revistas.add(new Revista("Colombia", "Salud", revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", objSDF.parse("01-01-1974")));
        } catch (ParseException ex) {
            System.out.println("No se lograron agregar las revistas");
        }
       
    }
    public void mostrarTodo(){
        for (Revista revista : revistas)
            imprimirRevista(revista);
    }
    /*
        agregar nuevo libro a la lista
    **/
    public void agregarNuevoRevista(String pais, String categoria, int id, String title, int stock, String author, Date fechaPublicacion){
        for (Revista revista : revistas) {
            if (revista.getAuthor().equals(author) && revista.getTitle().equals(title)){
                System.out.println("Ya existe el libro " + title + ".\nSe agrego al inventario.");
                revista.setStock(revista.getStock() + stock);
                return;
            }
        }
        revistas.add(new Revista(pais, categoria, id, title, stock, author, fechaPublicacion));
        //manuales.add(new Manual(manuales.size(),  title, stock, author));
    }
    
    public boolean devolucionRevista(String title){
        for (Revista revista : revistas) {
            if (revista.getTitle().equals(title)){
                System.out.println("Libro recibido.\nTitúlo: " + title + ".");
                revista.setStock(revista.getStock() + 1);
                return true;
            }
        }
        System.out.println("Verfica que el libro sea de nuestra biblioteca.");
        return false; 
    }
    
    public boolean retirarRevista(String title){
        for (Revista revista : revistas) {
            if (revista.getTitle().equals(title)){
                System.out.println("Libro retirado.\nTitúlo: " + title + ".");
                revista.setStock(revista.getStock() -1);
                return true;
            }
        }
        System.out.println("NO tenemos el libro en nuestro inventario.\nTitúlo: " + title + ".");
        return false; 
    }
    
    public void buscarRevistaPorTitulo(String title){
        for (Revista revista : revistas) {
            if (revista.getTitle().equals(title)){
                imprimirRevista(revista);
            }
        }
    }
    
    public void buscarRevistaPorAutor(String author){
        for (Revista revista : revistas) {
            if (revista.getAuthor().equals(author)){
                imprimirRevista(revista);
            }
        }
    }
    private void imprimirRevista(Revista revista){
        System.out.println(
                "----------------------------------"
                    + "\nId:\t" + revista.getId()
                    +"\nTitúlo:\t" + revista.getTitle() 
                    +"\nAutor:\t" + revista.getAuthor()
                    +"\nInventario:\t" + revista.getStock()
                    +""
                        + "\n----------------------------------");
    }
    
}
