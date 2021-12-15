package ironman.logica.partes.yelmo;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractYelmo implements InterfaceYelmo {
    private List<String> caracteristicas;

    public AbstractYelmo() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}