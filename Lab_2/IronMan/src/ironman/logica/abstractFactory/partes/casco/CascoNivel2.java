package ironman.logica.abstractFactory.partes.casco;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class CascoNivel2 extends CascoNivel1 {
    public CascoNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica básica");
    }

    @Override
    public String operacion() {
        return "Creando casco Nivel 2";
    }
}
