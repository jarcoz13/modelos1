package com.ud.mp.libreria.logica;

public abstract class ElementoBibliotecario implements ElementoBibliotecarioInterfaz{
    private final int id;
    private String titulo;
    private int inventario;
    private String autor;
    private int anio;
    
    public ElementoBibliotecario(int id, String title, int stock, String author, int anio) {
        this.id = id;
        this.titulo = title;
        this.inventario = stock;
        this.autor = author;
        this.anio = anio;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getInventario() {
        return inventario;
    }

    @Override
    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int getAnio() {
        return anio;
    }

    @Override
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
