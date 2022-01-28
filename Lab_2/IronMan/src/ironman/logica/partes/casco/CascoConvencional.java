package ironman.logica.partes.casco;

public class CascoConvencional extends AbstractCasco {
/**
 * Constructor de Casco Convencional
 */
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
