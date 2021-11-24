package com.ud.mp.libreria.logica;

import java.util.Date;

public class elementoBibliotecario {
    private int id;
    private String title;
    private int stock;
    private String author;
    private int year;
    
    public elementoBibliotecario(int id, String title, int stock, String author, int fechaPublicacion) {
        this.id = id;
        this.title = title;
        this.stock = stock;
        this.author = author;
        this.year = fechaPublicacion;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int fechaPublicacion) {
        this.year = fechaPublicacion;
    }
    
    public boolean retirarElemento(){
        if( stock > 0 ){
            stock--;
            System.out.println("Retirando " + this.toString() + " " + getTitle());
            return true;
        } else {
            System.out.println("No hay " + this.toString() + " " + getTitle());
            return false;
        }
    }
    
    public void agregarElemento(){
        stock++;
        System.out.println("Agregando " + this.toString() + " " + getTitle()); 
    }
}
