package ironman.logica.abstractFactory.partes.botas;


public class BotasNivel1 extends BotasConvencionales  {
    public BotasNivel1(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    public String operacion() {
        return "Creando botas Nivel 1"; 
    }
}