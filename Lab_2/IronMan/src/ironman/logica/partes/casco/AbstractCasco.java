package ironman.logica.partes.casco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractCasco implements InterfaceCasco {
    private List<String> caracteristicas;

    public AbstractCasco() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
