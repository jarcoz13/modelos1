
package com.ud.mp.libreria.logica;

public class Revista extends elementoBibliotecario{
    private String pais;
    private String categoria;

    public Revista(int id, String title, int stock, String author, int anio) {
        super(id, title, stock, author, anio);
    }

    public Revista(String pais, String categoria, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
        this.pais = pais;
        this.categoria = categoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCategoria() {
        return categoria;
    }

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
