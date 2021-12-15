package ironman.logica.partes.yelmo;


public class YelmoNivel2 extends YelmoNivel1 {
    public YelmoNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica básica");
    }

    @Override
    public String operacion() {
        return "Creando yelmo Nivel 2";
    }
}