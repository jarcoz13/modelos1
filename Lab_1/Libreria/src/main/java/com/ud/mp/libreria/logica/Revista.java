
package com.ud.mp.libreria.logica;
/**
 * Clase Revista.
 * Hereda de la clase padre "Elemento Bibliotecario".
*/
public class Revista extends ElementoBibliotecario{
    /**
     * País de la revista.
     */
    private String pais;
    /**
     * Categoria de la revista.
     */
    private String categoria;
/**
 * Constructor basico de una revista.
 * @param id
 * @param title
 * @param stock
 * @param author
 * @param anio 
 */
    public Revista(int id, String title, int stock, String author, int anio) {
        super(id, title, stock, author, anio);
    }
/**
 * Constructor completo de una revista.
 * @param pais
 * @param categoria
 * @param id
 * @param title
 * @param stock
 * @param author
 * @param year 
 */
    public Revista(String pais, String categoria, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
        this.pais = pais;
        this.categoria = categoria;
    }
    /**
    * @return Parámetro del país al que corresponde la revista
    */
    public String getPais() {
        return pais;
    }
    /**
    *Asigna el país al que corresponde la revista
     * @param pais
    */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
    * @return Parámetro correspondiente a la categoría de la revista
    */
    public String getCategoria() {
        return categoria;
    }
    /**
    *Asigna la categoría de la revista
     * @param categoria
    */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(
                "Categoria:\t " + this.getCategoria()
                + "\nPaís:\t " + this.getPais()
                + "\n----------------------------------"
        );
    }

    @Override
    public boolean prestamoElementos(int cantidad) {
        if(cantidad >= super.getInventario()){
            System.out.println("Se pidieron " + cantidad + " "+ this.toString() +"s del ejemplar " + super.getTitulo());
            super.setInventario(getInventario()- cantidad);
            System.out.println("Quedaron " + super.getInventario() + " ejemplares ");
            return true;
        } else{
            System.out.println("No se lograron retirar los " + cantidad + " "+ this.toString() +"s del ejemplar " + super.getTitulo());
            return false;
        }
    }

    @Override
    public void agregarElementos(int cantidad) {
        super.setInventario(super.getInventario() + cantidad);
        System.out.println("Se agregaron " + cantidad + " "+ this.toString() +"s del ejemplar " + super.getTitulo());
    }
    
}
