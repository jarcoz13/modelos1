package ironman.logica.partes.botas;

import ironman.logica.partes.ParteArmadura;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBotas extends ParteArmadura implements InterfaceBotas {
    private List<String> caracteristicas;

    public AbstractBotas() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}