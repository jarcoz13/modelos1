package ironman.logica.partes.peto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * 
 * 
 */
public abstract class AbstractPeto implements InterfacePeto {
    private List<String> caracteristicas;

    public AbstractPeto() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
