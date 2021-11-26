package com.ud.mp.libreria.logica;

    /** 
    * La clase hereda de la clase padre 
     *@param id
     *@param title
     *@param stock
     *@param author
     *@param anio
    */
public class Libro extends ElementoBibliotecario {
    private String editorial;
    
    public Libro(int id, String title, int stock, String author, int anio) {
        super(id, title, stock, author, anio);
    }
  
     /**
        *@param editorial
        *@param id
        *@param title
        *@param stock
        *@param author
        *@param year
    */
    public Libro(String editorial, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
   
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
        super.imprimir();
        System.out.println(
                "Editorial:\t " + this.getEditorial()
                + "\n----------------------------------"
        );
    }

    @Override
    public boolean prestamoElementos(int cantidad) {
        if(cantidad >= super.getInventario()){
            System.out.println("Se pidieron " + cantidad + " de "+ this.toString() +"s del ejemplar " + super.getTitulo());
            super.setInventario(super.getInventario()- cantidad);
            System.out.println("Quedaron " + super.getInventario() + " ejemplares ");
            return true;
        } else {
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
