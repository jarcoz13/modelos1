package ironman.logica.partes.casco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractCasco implements InterfaceCasco {
    private List<String> caracteristicas;
/**
 * Constructor de AbstractCasco
 */
    public AbstractCasco() {
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
