package ironman.logica.partes;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class CascoNivel1 extends CascoConvencional {
    public CascoNivel1(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    void operacion() {
        System.out.println("Creando casco Nivel 1"); 
    }
    
}
