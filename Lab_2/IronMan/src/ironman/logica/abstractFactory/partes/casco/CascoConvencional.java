package ironman.logica.abstractFactory.partes.casco;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class CascoConvencional extends AbstractCasco {
    public CascoConvencional(){
        super();
        obtenerCaracteristicas().add("Mascara");
        obtenerCaracteristicas().add("Protector cerebral");    
    }

    @Override
    public String operacion() {
        return "Creando casco convencional";
    }
}
