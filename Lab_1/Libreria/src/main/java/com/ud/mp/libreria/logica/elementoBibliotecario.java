package com.ud.mp.libreria.logica;

import java.util.Date;

public class elementoBibliotecario {
    private int id;
    private String title;
    private int stock;
    private String author;
    private Date publicationDate;

    public elementoBibliotecario(int id, String title, int stock, String author) {
        this.id = id;
        this.title = title;
        this.stock = stock;
        this.author = author;
    }
    
    public elementoBibliotecario(int id, String title, int stock, String author, Date fechaPublicacion) {
        this.id = id;
        this.title = title;
        this.stock = stock;
        this.author = author;
        this.publicationDate = fechaPublicacion;
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

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date fechaPublicacion) {
        this.publicationDate = fechaPublicacion;
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
