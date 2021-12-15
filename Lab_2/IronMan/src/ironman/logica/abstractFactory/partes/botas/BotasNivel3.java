package ironman.logica.abstractFactory.partes.botas;


public class BotasNivel3 extends BotasNivel2 {
    public BotasNivel3(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de iluminación interna");
        super.obtenerCaracteristicas().add("Sistemas de iluminación externa");
    }

    @Override
    public String operacion() {
        return "Creando casco nivel 3"; 
    }
}