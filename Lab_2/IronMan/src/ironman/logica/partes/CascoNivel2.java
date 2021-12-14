package ironman.logica.partes;

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
    }

    @Override
    void operacion() {
        System.out.println("Creando casco Nivel 2"); 
    }
    
}
