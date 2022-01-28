package ironman.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == modelo.getVistaPedir().getJbMostrar()) {
            modelo.generarArmaduras();
        } else if (ae.getSource() == modelo.getVistaPrincipal().getjComboBox1()) {
            modelo.mostrarCaracteristicas();
        }
    }
    
}
