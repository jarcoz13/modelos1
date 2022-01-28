package ironman.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador implements ActionListener, MouseListener {
    private Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == modelo.getVistaPedir().getJbMostrar()) {
            modelo.generarArmaduras();
        } else if (ae.getSource().equals( modelo.getVistaNueva().getJbRegresar())){
            modelo.regresarVistaInicial();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) { }

    @Override
    public void mousePressed(MouseEvent me) { }

    @Override
    public void mouseReleased(MouseEvent me) { }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource().equals(modelo.getVistaNueva().getLblImgArmadura())){
            modelo.mostrarCaracteristicas(0);
        } else if(me.getSource().equals(modelo.getVistaNueva().getLblElemento1())){
            modelo.mostrarCaracteristicas(1);
        } else if(me.getSource().equals(modelo.getVistaNueva().getLblElemento2())){
            modelo.mostrarCaracteristicas(2);
        } else if(me.getSource().equals(modelo.getVistaNueva().getLblElemento3())){
            modelo.mostrarCaracteristicas(3);
        } else if(me.getSource().equals(modelo.getVistaNueva().getLblElemento4())){
            modelo.mostrarCaracteristicas(4);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) { }

}
