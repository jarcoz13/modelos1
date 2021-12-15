package ironman.logica.partes.yelmo;


public class YelmoNivel1 extends YelmoConvencional  {
    public YelmoNivel1(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    public String operacion() {
        return "Creando yelmo Nivel 1"; 
    }
}