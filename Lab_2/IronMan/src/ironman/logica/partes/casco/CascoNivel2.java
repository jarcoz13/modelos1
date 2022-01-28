package ironman.logica.partes.casco;

public class CascoNivel2 extends CascoNivel1 {
/**
 * Constructor de Casco Nivel 2 
 */
    public CascoNivel2() {
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes para el casco");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica básica de apertura y cierre");
        super.obtenerCaracteristicas().add("Sistema iluminacion externa");
    }

    @Override
    public String operacion() {
        return "Creando casco Nivel 2";
    }
}
