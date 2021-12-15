package ironman.logica.abstractFactory.partes.botas;

public class BotasWarMachine extends BotasNivel3 {
    public BotasWarMachine(){
        super();
        super.obtenerCaracteristicas().add("Material reforzado");
    }

    @Override
    public String operacion() {
        return "Creando casco War Machine"; 
    }
}