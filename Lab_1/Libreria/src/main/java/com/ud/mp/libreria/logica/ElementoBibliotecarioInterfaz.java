package com.ud.mp.libreria.logica;

public interface ElementoBibliotecarioInterfaz {
    void imprimir();
    boolean prestamoElementos(int cantidad);
    void agregarElementos(int cantidad);
    
    int getId();    
    String getTitulo();
    void setTitulo(String titulo);
    int getInventario();
    void setInventario(int inventario);
    String getAutor();
    void setAutor(String autor);
    int getAnio();
    void setAnio(int anio);
}
