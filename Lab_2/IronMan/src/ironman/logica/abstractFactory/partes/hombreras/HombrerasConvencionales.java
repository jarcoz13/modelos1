package ironman.logica.abstractFactory.partes.hombreras;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class HombrerasConvencionales extends AbstractHombreras {
    public HombrerasConvencionales(){
        super(); 
    }

    @Override
    public String operacion() {
        return "Creando hombreras convencionales";
    }
}
