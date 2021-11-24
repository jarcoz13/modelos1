package com.ud.mp.libreria.logica;

public abstract class elementoBibliotecario implements elementoBibliotecarioInterfaz{
    private final int id;
    private String titulo;
    private int inventario;
    private String autor;
    private int anio;
    
    public elementoBibliotecario(int id, String title, int stock, String author, int anio) {
        this.id = id;
        this.titulo = title;
        this.inventario = stock;
        this.autor = author;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public void imprimir(){
        System.out.println(
                "----------------------------------"
                + "\nId:\t" + id
                + "\nTitúlo:\t" + titulo
                + "\nAutor:\t" + autor
                + "\nInventario:\t" + inventario
                + "\nAño publicación:\t" + anio
        );
        
    }
}
