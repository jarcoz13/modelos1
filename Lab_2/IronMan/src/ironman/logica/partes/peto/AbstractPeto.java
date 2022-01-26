package ironman.logica.partes.peto;

import ironman.logica.partes.ParteArmadura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * 
 * 
 */
public abstract class AbstractPeto extends ParteArmadura implements InterfacePeto {
    private List<String> caracteristicas;

    public AbstractPeto() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
