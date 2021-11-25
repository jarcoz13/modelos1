package com.ud.mp.libreria.controladores;

import java.util.List;
import com.ud.mp.libreria.logica.Manual;
import java.util.ArrayList;

public class ControlManuales extends ControladorGenerico<Manual>{
    private List<Manual> manuales;

    public ControlManuales() {
        manuales = new ArrayList<>();
        manuales.add(new Manual("Calculadora", "USA", manuales.size(), "Calculadora", 2, "Casio", 2001));
        manuales.add(new Manual("Impresora", "Japon", manuales.size(), "Impresora HP", 3, "HP", 2002));
        manuales.add(new Manual("Poratil", "China", manuales.size(), "Portatil 14 pulgadas", 4, "Lenovo", 1999));
        
    }
    
    @Override
    public List<Manual> getElements() {
        return manuales;
    }

    @Override
    public void listarTodo() {
        manuales.forEach(manual -> {
            manual.imprimir();
        });
    }
    
    public void agregarNuevoElemento(String dispositvo, String pais, String title, int stock, String author, int anio) {
        super.agregarNuevoElemento(new Manual(dispositvo, pais, getElements().size(),title, stock, author, anio));
    }
    
    @Override
    public void agregarNuevoElemento(String title, int stock, String author, int anio) {
        super.agregarNuevoElemento(new Manual(getElements().size(),title, stock, author, anio));
    }

    @Override
    public boolean devolverElementos(String titulo, String autor, int cantidad) {
        Manual manual = obtenerElemento(titulo, autor);
        if(manual != null){
            System.out.println("Manual devuelto. \nTitúlo: " + titulo + ".");
            manual.agregarElementos(cantidad);
            return true;
        } else {
            System.out.println("Verfica que el libro sea de nuestra biblioteca.");
            return false;
        }
    }

    @Override
    public boolean retirarElemento(String titulo, String autor) {
        Manual manual = obtenerElemento(titulo, autor);
        if(manual != null){
            System.out.println("Manual retirado.\nTítulo: " + titulo + ".");
            super.retirarElemento(manual);
            return true;
        } else {
            System.out.println("NO tenemos el manual en nuestro inventario.\nTítulo: " + titulo + ".");
            return false;
        }
             
    }

    @Override
    public Manual obtenerElemento(String title, String autor) {
        for (Manual manual : manuales) {
            if(manual.getTitulo().equals(title) && manual.getAutor().equals(autor)){
                return manual;
            }
        }
        return null;
    }

    @Override
    public void imprimirElemento(String title) {
        for (Manual manual : manuales) {
            if(manual.getTitulo().equals(title)){
                manual.imprimir();
            }
        }
    }

    @Override
    public boolean prestamoElementos(String titulo, String autor, int cantidad) {
        Manual manual = obtenerElemento(titulo, autor);
        if(manual != null){
           return manual.prestamoElementos(cantidad); 
        } else {
            System.out.println("No existe el manual: "+ titulo);
            return false;
        } 
    }
}
