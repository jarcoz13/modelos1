package com.ud.mp.libreria.logica;
/**
 *  Interface con las funciones de los elementos bibliotecarios. 
 * Define las funciones basicas de un elemento.
 * @author Jose Cortazar
 * @author Mabel Rojas
 * @author Andres Martin
 */
public interface ElementoBibliotecarioInterfaz {
    /**
     * Muestra todas las propiedades del elemento.
     */
    void imprimir();
    /**
     * De ser posible, retira la cantidad de elementos especificada.
     * @param cantidad
     * @return si la transacción fue exitosa.
     */
    boolean prestamoElementos(int cantidad);
    /**
     * Agrega una cantidad de elementos.
     * @param cantidad 
     */
    void agregarElementos(int cantidad);
    
    /**
     * Obtiene el id del elemento.
     * @return id
     */
    int getId(); 
    /**
     * Obtiene el título del elemento.
     * @return String
     */
    String getTitulo();
    /**
     * Cambia el título del elemento.
     * @param titulo 
     */
    void setTitulo(String titulo);
    /**
     * Obtiene el inventario del elemento.
     * @return 
     */
    int getInventario();
    /**
     * Cambia el inventario del elemento. 
     * @param inventario
     */
    void setInventario(int inventario);
    /**
     * Cambia el Autor del elemento.
     * @return String 
     */
    String getAutor();
    /**
     * 
     * @param autor 
     */
    void setAutor(String autor);
    int getAnio();
    void setAnio(int anio);
}
