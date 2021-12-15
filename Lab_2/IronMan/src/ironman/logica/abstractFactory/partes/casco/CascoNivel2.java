package ironman.logica.abstractFactory.partes.casco;


public class CascoNivel2 extends CascoNivel1 {
    public CascoNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes");
        super.obtenerCaracteristicas().add("Sistemas de microelectrónica básica");
    }

    @Override
    public String operacion() {
        return "Creando casco Nivel 2";
    }
}
