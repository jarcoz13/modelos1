package ironman.logica.partes.botas;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBotas implements InterfaceBotas {
    private List<String> caracteristicas;
/**
 * Constructor de AbstractBotas
 */
    public AbstractBotas() {
        caracteristicas = new ArrayList<>();
    }
/**
 * Obtiene las características del traje
 * @return una lista con las características en un String
 */
    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}