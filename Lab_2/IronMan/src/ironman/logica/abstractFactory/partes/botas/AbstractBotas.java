package ironman.logica.abstractFactory.partes.botas;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBotas implements InterfaceBotas {
    private List<String> caracteristicas;

    public AbstractBotas() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}