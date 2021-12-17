package ironman.logica.partes.botas;


public class BotasNivel2 extends BotasNivel1 {
    public BotasNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes para armado de las botas");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica armado asistido nivel 1");
        super.obtenerCaracteristicas().add("Sistema de propulcion asitido de vuelo");

    }

    @Override
    public String operacion() {
        return "Creando botas Nivel 2";
    }
}