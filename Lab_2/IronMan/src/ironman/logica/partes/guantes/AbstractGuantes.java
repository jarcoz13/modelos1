package ironman.logica.partes.guantes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractGuantes implements InterfaceGuante {
    private List<String> caracteristicas;

    public AbstractGuantes() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
