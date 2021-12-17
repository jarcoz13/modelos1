package ironman.logica.partes.casco;

public class CascoWarMachine extends CascoNivel3 {
    public CascoWarMachine() {
        super();
        super.obtenerCaracteristicas().add("Material reforzado");
        super.obtenerCaracteristicas().add("Sistema hermetico de vuelo");
        super.obtenerCaracteristicas().add("Sistema visualizacion de la armadura");
        super.obtenerCaracteristicas().add("Sistema asistido de la aramdura  IA : jarvis");
        super.obtenerCaracteristicas().add("Pintura aeroespacial antitanque");

    }

    @Override
    public String operacion() {
        return "Creando casco War Machine";
    }
}
