package ironman.logica.partes.botas;


public class BotasNivel3 extends BotasNivel2 {
    public BotasNivel3(){
        super();
        super.obtenerCaracteristicas().add("Incorporcion de Arma lateral");
        super.obtenerCaracteristicas().add("Sistema microengraneges de extraccion de arma");  
        super.obtenerCaracteristicas().add("Sistema electronico abastecimiento para arma Lateral"); 
        super.obtenerCaracteristicas().add("Sistema de bodega de municion para arma lateral");      
    }

    @Override
    public String operacion() {
        return "Creando botas nivel 3"; 
    }
}