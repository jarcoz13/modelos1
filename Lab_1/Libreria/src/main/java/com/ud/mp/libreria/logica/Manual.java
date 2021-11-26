package com.ud.mp.libreria.logica;
/**
 * Hereda de la clase padre "Elemento Bibliotecario"
 *  * @param dispositivo
    * @param hechoEn
    * @param id
    * @param title
    * @param stock
    * @param author 
    * @param year
    * 
        * @param id
        * @param title
        * @param stock
        * @param author
        * @param anio
        
*/
public class Manual extends ElementoBibliotecario{
    private String dispositivo;
    private String hechoEn;

    public Manual(int id, String title, int stock, String author, int anio) {
        super(id, title, stock, author, anio);
    }

    public Manual(String dispositivo, String hechoEn, int id, String title, int stock, String author, int year) {
        super(id, title, stock, author, year);
        this.dispositivo = dispositivo;
        this.hechoEn = hechoEn;
    }
    /**
    * @return Parámetro del dispositivo al que corresponde el manual
    */
    public String getDispositivo() {
        return dispositivo;
    }
    /**
    *Asigna el dispositivo al que corresponde el manual
    */
    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
    /**
    * @return Parámetro correspondiente al origen del manual
    */
    public String getHechoEn() {
        return hechoEn;
    }
    /**
    *Asigna de dónde fue hecho 
    */
    public void setHechoEn(String hechoEn) {
        this.hechoEn = hechoEn;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(
                "Dispositivo:\t " + this.getDispositivo()
                + "\nHecho en:\t " + this.getHechoEn()
                + "\n----------------------------------"
        );
    }

    @Override
    public boolean prestamoElementos(int cantidad) {
        if(cantidad >= super.getInventario()){
            System.out.println("Se pidieron " + cantidad + " "+ this.toString() +"es del ejemplar " + super.getTitulo());
            super.setInventario(getInventario()- cantidad);
            System.out.println("Quedaron " + super.getInventario() + " ejemplares ");
            return true;
        } else{
            System.out.println("No se lograron retirar los " + cantidad + " "+ this.toString() +"es del ejemplar " + super.getTitulo());
            return false;
        }
    }

    @Override
    public void agregarElementos(int cantidad) {
        super.setInventario(super.getInventario() + cantidad);
        System.out.println("Se agregaron " + cantidad + " "+ this.toString() +"es del ejemplar " + super.getTitulo());
    }
}
