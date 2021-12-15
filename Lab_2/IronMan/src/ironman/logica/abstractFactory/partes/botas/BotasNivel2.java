package ironman.logica.abstractFactory.partes.botas;


public class BotasNivel2 extends BotasNivel1 {
    public BotasNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica básica");
    }

    @Override
    public String operacion() {
        return "Creando botas Nivel 2";
    }
}