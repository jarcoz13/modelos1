package ironman.logica.partes.botas;


public class BotasNivel1 extends BotasConvencionales  {
    /**
 * Constructor de Botas Nivel 1
 */
    public BotasNivel1(){
        super();
        obtenerCaracteristicas().add("Energía nuclear");
        obtenerCaracteristicas().add("Dispositivo de vuelo no asitido");
    }

    @Override
    public String operacion() {
        return "Creando botas Nivel 1"; 
    }
}