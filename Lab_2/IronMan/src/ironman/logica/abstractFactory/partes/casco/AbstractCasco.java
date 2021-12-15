package ironman.logica.abstractFactory.partes.casco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
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
