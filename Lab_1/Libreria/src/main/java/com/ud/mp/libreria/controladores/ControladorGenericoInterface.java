package com.ud.mp.libreria.controladores;

import java.util.List;

public interface ControladorGenericoInterface <T> {
    /**
     * Obtener lista con los elementos.
     * @return Lista de tipo T
     */
    List<T> getElements();
    void listarTodo();
    
    void agregarNuevoElemento(String title, int stock, String author, int anio);
    void agregarNuevoElemento(T element);
    boolean retirarElemento(T element);
    
    boolean prestamoElementos(String titulo, String autor, int cantidad);
    boolean devolverElementos(String titulo, String autor, int cantidad);
    boolean retirarElemento(String titulo, String autor);
    
    T obtenerElemento(String title, String autor);
    void imprimirElemento(String title);
}
