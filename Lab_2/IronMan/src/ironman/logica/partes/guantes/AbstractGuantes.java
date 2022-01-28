package ironman.logica.partes.guantes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractGuantes implements InterfaceGuante {
    private List<String> caracteristicas;
/**
 * Constructor de AbstractGuantes
 */
    public AbstractGuantes() {
        caracteristicas = new ArrayList<>();
    }
/**
 * Obtiene las características del traje
 * @return una lista con las características en un String
 */
    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
