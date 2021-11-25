package com.ud.mp.libreria.logica;

public interface ElementoBibliotecarioInterfaz {
    void imprimir();
    boolean prestamoElementos(int cantidad);
    void agregarElementos(int cantidad);
}
