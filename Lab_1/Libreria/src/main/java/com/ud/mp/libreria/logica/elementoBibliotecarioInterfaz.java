package com.ud.mp.libreria.logica;

public interface elementoBibliotecarioInterfaz {
    void imprimir();
    boolean prestamoElementos(int cantidad);
    void agregarElementos(int cantidad);
}
