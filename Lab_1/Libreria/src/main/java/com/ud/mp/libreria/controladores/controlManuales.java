package com.ud.mp.libreria.controladores;

import java.util.List;
import com.ud.mp.libreria.logica.Manual;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class controlManuales {
    private List<Manual> manuales;

    public controlManuales() {
        manuales = new ArrayList<>();
        manuales.add(new Manual("Calculadora", "USA", manuales.size(), "Calculadora", 2, "Casio", 2001));
            manuales.add(new Manual("Impresora", "Japon", manuales.size(), "Impresora HP", 3, "HP", 2002));
            manuales.add(new Manual("Poratil", "China", manuales.size(), "Portatil 14 pulgadas", 4, "Lenovo", 1999));
        
    }
    
    public void mostrarTodo(){
        for (Manual manual : manuales)
            imprimirManual(manual);
    }
    /*
        agregar nuevo libro a la lista
    **/
    public void agregarNuevoManual(String dispositivo, String hechoEn, String title, int stock, String author, int year){
        for (Manual manual : manuales) {
            if (manual.getAuthor().equals(author) && manual.getTitle().equals(title)){
                System.out.println("Ya existe el libro " + title + ".\nSe agrego al inventario.");
                manual.setStock(manual.getStock() + stock);
                return;
            }
        }
        manuales.add(new Manual(dispositivo, hechoEn, manuales.size(), title, stock, author, year));
        //manuales.add(new Manual(manuales.size(),  title, stock, author));
    }
    
    public boolean devolucionManual(String title){
        for (Manual manual : manuales) {
            if (manual.getTitle().equals(title)){
                System.out.println("Libro recibido.\nTitúlo: " + title + ".");
                manual.setStock(manual.getStock() + 1);
                return true;
            }
        }
        System.out.println("Verfica que el libro sea de nuestra biblioteca.");
        return false; 
    }
    
    public boolean retirarManual(String title){
        for (Manual manual : manuales) {
            if (manual.getTitle().equals(title)){
                System.out.println("Libro retirado.\nTitúlo: " + title + ".");
                manual.setStock(manual.getStock() -1);
                return true;
            }
        }
        System.out.println("NO tenemos el libro en nuestro inventario.\nTitúlo: " + title + ".");
        return false; 
    }
    
    public void buscarManualPorTitulo(String title){
        for (Manual manual : manuales) {
            if (manual.getTitle().equals(title)){
                imprimirManual(manual);
            }
        }
    }
    
    public void buscarManualPorAutor(String author){
        for (Manual book : manuales) {
            if (book.getAuthor().equals(author)){
                imprimirManual(book);
            }
        }
    }
    private void imprimirManual(Manual manual){
        System.out.println(
                "----------------------------------"
                    + "\nId:\t" + manual.getId()
                    +"\nTitúlo:\t" + manual.getTitle() 
                    +"\nAutor:\t" + manual.getAuthor()
                    +"\nInventario:\t" + manual.getStock()
                        + "\n----------------------------------");
    }
}
