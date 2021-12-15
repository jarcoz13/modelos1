package ironman.logica.abstractFactory.partes.casco;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class CascoNivel3 extends CascoNivel2 {
    public CascoNivel3(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de iluminación interna");
        super.obtenerCaracteristicas().add("Sistemas de iluminación externa");
    }

    @Override
    public String operacion() {
        return "Creando casco nivel 3"; 
    }
}
