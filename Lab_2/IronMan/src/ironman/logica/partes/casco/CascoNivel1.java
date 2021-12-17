package ironman.logica.partes.casco;


public class CascoNivel1 extends CascoConvencional {
    public CascoNivel1(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    public String operacion() {
        return "Creando casco Nivel 1"; 
    }
}
