package ironman.logica.partes.casco;

import ironman.logica.partes.ParteArmadura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public abstract class AbstractCasco extends ParteArmadura implements InterfaceCasco {
    private List<String> caracteristicas;

    public AbstractCasco() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
