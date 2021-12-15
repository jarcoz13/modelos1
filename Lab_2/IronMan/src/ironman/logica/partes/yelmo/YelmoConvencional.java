package ironman.logica.partes.yelmo;



public class YelmoConvencional extends AbstractYelmo {
    public YelmoConvencional(){
        super();
        obtenerCaracteristicas().add("Mascara");
        obtenerCaracteristicas().add("Protector cerebral");    
    }

    @Override
    public String operacion() {
        return "Creando yelmo convencional";
    }
}