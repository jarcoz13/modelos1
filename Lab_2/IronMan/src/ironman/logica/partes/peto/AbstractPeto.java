package ironman.logica.partes.peto;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractPeto implements InterfacePeto {
    private List<String> caracteristicas;
/**
 * Constructor de AbstractPeto
 */
    public AbstractPeto() {
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
