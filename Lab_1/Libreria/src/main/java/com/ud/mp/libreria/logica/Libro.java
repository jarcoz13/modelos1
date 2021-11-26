package com.ud.mp.libreria.logica;

    /** 
    * La clase hereda de la clase padre 
    */
public class Libro extends ElementoBibliotecario {
    private String editorial;
    
    public Libro(int id, String title, int stock, String author, int anio) {
        super(id, title, stock, author, anio);
    }
    /**
     *@param id
     *@param title
     *@param stock
     *@param author
     *@param anio
    */
    public Libro(String editorial, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
    /**
        *@param editorial
        *@param id
        *@param title
        *@param stock
        *@param author
        *@param year
    */
        this.editorial = editorial;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void imprimir() {
        /**
        * Imprime en consola la editorial del libro
        */
        super.imprimir();
        System.out.println(
                "Editorial:\t " + this.getEditorial()
                + "\n----------------------------------"
        );
    }

    @Override
    public boolean prestamoElementos(int cantidad) {
        /**
        *Verifica si existe la cantidad del elemento solicitado por el usuario
        */
        if(cantidad >= super.getInventario()){
            System.out.println("Se pidieron " + cantidad + " de "+ this.toString() +"s del ejemplar " + super.getTitulo());
            super.setInventario(super.getInventario()- cantidad);
            System.out.println("Quedaron " + super.getInventario() + " ejemplares ");
            return true;
            /**  
             * @return Los ejemplares o elementos que quedaron en el inventario
            */
        } else {
            System.out.println("No se lograron retirar los " + cantidad + " "+ this.toString() +"s del ejemplar " + super.getTitulo());
            return false;
            /** 
             * @return No se pueden retirar los ejemplares 
            */
        }
    }

    @Override
    public void agregarElementos(int cantidad) {
        /**
        *Agrega nuevos elementos al inventario de la librería
       */
        super.setInventario(super.getInventario() + cantidad);
        System.out.println("Se agregaron " + cantidad + " "+ this.toString() +"s del ejemplar " + super.getTitulo());
    }
}
