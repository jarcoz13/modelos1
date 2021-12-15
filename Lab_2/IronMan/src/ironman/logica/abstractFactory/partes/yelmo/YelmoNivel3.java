package ironman.logica.abstractFactory.partes.yelmo;


public class YelmoNivel3 extends YelmoNivel2 {
    public YelmoNivel3(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de iluminación interna");
        super.obtenerCaracteristicas().add("Sistemas de iluminación externa");
    }

    @Override
    public String operacion() {
        return "Creando yelmo nivel 3"; 
    }
}