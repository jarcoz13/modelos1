package ironman.logica.partes.hombreras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractHombreras implements InterfaceHombreras {
    private List<String> caracteristicas;

    public AbstractHombreras() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
