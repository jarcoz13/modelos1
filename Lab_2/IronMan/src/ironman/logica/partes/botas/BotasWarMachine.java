package ironman.logica.partes.botas;

public class BotasWarMachine extends BotasNivel3 {
/**
 * Constructor de Botas War Machine 
 */
    public BotasWarMachine() {
        super();
        super.obtenerCaracteristicas().add("Sistema hermetico de armado");
        super.obtenerCaracteristicas().add("Sistema Aislamiento termico en propulcion a chorro");
        super.obtenerCaracteristicas().add("Sistema Asistido de armadura IA : Jarvis");
        super.obtenerCaracteristicas().add("Pintura aero Espacial antitanque ");
    }

    @Override
    public String operacion() {
        return "Creando botas War Machine";
    }
}