package ironman.logica.partes.casco;

public class CascoWarMachine extends CascoNivel3 {
    public CascoWarMachine(){
        super();
        super.obtenerCaracteristicas().add("Material reforzado");
    }

    @Override
    public String operacion() {
        return "Creando casco War Machine"; 
    }
}
