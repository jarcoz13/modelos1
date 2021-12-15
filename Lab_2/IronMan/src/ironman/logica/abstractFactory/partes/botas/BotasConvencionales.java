package ironman.logica.abstractFactory.partes.botas;



public class BotasConvencionales extends AbstractBotas {
    public BotasConvencionales(){
        super();
        obtenerCaracteristicas().add("Mascara");
        obtenerCaracteristicas().add("Protector cerebral");    
    }

    @Override
    public String operacion() {
        return "Creando  botas convencionales";
    }
}