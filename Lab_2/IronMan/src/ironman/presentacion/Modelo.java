/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman.presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Modelo {
    private VistaInicial vistaPedir;
    private VistaCaracteristicas vistaPrincipal;
    
    public Modelo(){
        getVistaPedir().setVisible(true);
    }

    public VistaInicial getVistaPedir() {
        if(vistaPedir == null){
            vistaPedir = new VistaInicial(this);
        }
        return vistaPedir;
    }

    public VistaCaracteristicas getVistaPrincipal() {
        if(vistaPrincipal == null){
            vistaPrincipal = new VistaCaracteristicas(this);
        }
        return vistaPrincipal;
    }
    
    public void mostrarArmaduras(){
        int cantidad;
        int caso = getVistaPedir().getJcArmaduras().getSelectedIndex();
        try{
            cantidad = Integer.parseInt(getVistaPedir().getJtCantidad().getText());
            if(cantidad<=0)
            {
                JOptionPane
            }
            
            else{
                getVistaPedir().setVisible(false);
                getVistaPrincipal().setVisible(true);
            }

            
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(vistaPedir, "Ingrese un número");
        }
        
        
    }
    
}
