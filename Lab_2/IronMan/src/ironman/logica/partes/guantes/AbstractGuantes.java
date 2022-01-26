package ironman.logica.partes.guantes;

import ironman.logica.partes.ParteArmadura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractGuantes extends ParteArmadura implements InterfaceGuante {
    private List<String> caracteristicas;

    public AbstractGuantes() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
