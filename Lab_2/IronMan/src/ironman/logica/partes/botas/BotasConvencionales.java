package ironman.logica.partes.botas;

public class BotasConvencionales extends AbstractBotas {
/**
 * Constructor de Botas Convencionales 
 */
    public BotasConvencionales(){
        super();
        obtenerCaracteristicas().add("Mascara");
        obtenerCaracteristicas().add("Protector cerebral");    
    }

    @Override
    public String operacion() {
        return "Creando botas convencionales";
    }
}