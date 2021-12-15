package ironman.logica.partes.yelmo;

public class YelmoWarMachine extends YelmoNivel3 {
    public YelmoWarMachine(){
        super();
        super.obtenerCaracteristicas().add("Material reforzado");
    }

    @Override
    public String operacion() {
        return "Creando yelmo War Machine"; 
    }
}