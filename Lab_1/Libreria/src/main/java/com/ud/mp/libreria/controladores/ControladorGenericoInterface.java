package com.ud.mp.libreria.controladores;

import java.util.List;

public interface ControladorGenericoInterface <T> {
    /**
     * Obtener lista con los elementos.
     * @return Lista de tipo T
     */
    List<T> getElements();
    /**
     * Imprime en consola los atributos de todos elementos.
     */
    void listarTodo();
    
    /**
     * Agrega un nuevo elemento a la lista teniendo como parametros los 
     * parametros base para un elementoBibliotecario.
     * @param title
     * @param stock
     * @param author
     * @param anio 
     */
    void agregarNuevoElemento(String title, int stock, String author, int anio);
    /**
     * Agrega un nuevo elemento T a la lista.
     * @param element objeto de tipo T que puede ser Revista, Libro o Manual.
     */
    void agregarNuevoElemento(T element);
    /**
     * Retira un elemento T a la lista.
     * @param element objeto de tipo T que puede ser Revista, Libro o Manual.
     * @return un valor de verdad teniendo en cuenta si existia el elemento o no.
     */
    boolean retirarElemento(T element);
    
    /**
     * Pide una cantidad de cierto elemento.
     * @param titulo del elemento.
     * @param autor del elemento.
     * @param cantidad a pedir.
     * @return un valor de verdad teniendo en cuenta si hay la cantidad necesaria o no.
     */
    boolean prestamoElementos(String titulo, String autor, int cantidad);
    /**
     * Aumenta la cantidad de inventario de un elemento.
     * @param titulo del elemento.
     * @param autor del elemento.
     * @param cantidad a ingresar.
     * @return un valor de verdad teniendo en cuenta si existia el elemento.
     */
    boolean devolverElementos(String titulo, String autor, int cantidad);
    /**
     * Retira un elemento de la lista.
     * Remueve un nuevo elemento de la lista teniendo como parametros el
     * título y autor del mismo.
     * @param titulo
     * @param autor
     * @return un valor de verdad teniendo en cuenta si existia el elemento o no.
     */
    boolean retirarElemento(String titulo, String autor);
    
    /**
     * Devuelve un elemento encontrandolo por el autor y titulo de su obra.
     * @param title
     * @param autor
     * @return un elemento T que puede ser Revista, Libro o Manual.
     */
    T obtenerElemento(String title, String autor);
    /**
     * @param title 
     * Imprime en consola los elemento de la lista que tengan el mismo título.
     */
    void imprimirElemento(String title);
}
