package ironman.logica.partes.casco;

/**
 *
 * 
 * 
 * 
 */
public class CascoNivel3 extends CascoNivel2 {
    public CascoNivel3(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de iluminación interna");
        super.obtenerCaracteristicas().add("Sistemas de iluminación externa");
    }

    @Override
    public String operacion() {
        return "Creando casco nivel 3"; 
    }
}
