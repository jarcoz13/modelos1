package ironman.logica.partes.guantes;

public class GuantesNivel1 extends GuantesConvencionales {
/**
 * Constructor de Guantes Nivel 1 
 */
    public GuantesNivel1() {
        super();
        super.obtenerCaracteristicas().add("Sistema hermetico de armado");
//        super.obtenerCaracteristicas().add("Sistema hermetico de armado");
//        super.obtenerCaracteristicas().add("Sistema hermetico de armado");
    }

    @Override
    public String operacion() {
        return "Creando guantes Nivel 1";
    }
}
