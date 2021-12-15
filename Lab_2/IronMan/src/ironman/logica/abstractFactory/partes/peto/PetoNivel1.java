package ironman.logica.abstractFactory.partes.peto;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class PetoNivel1 extends PetoConvencional {
    public PetoNivel1(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando peto Nivel 1"; 
    }
}
