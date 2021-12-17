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
    private VistaPedir vistaPedir;
    private VistaPrincipal vistaPrincipal;
    
    public Modelo(){
        getVistaPedir().setVisible(true);
    }

    public VistaPedir getVistaPedir() {
        if(vistaPedir == null){
            vistaPedir = new VistaPedir(this);
        }
        return vistaPedir;
    }

    public VistaPrincipal getVistaPrincipal() {
        if(vistaPrincipal == null){
            vistaPrincipal = new VistaPrincipal(this);
        }
        return vistaPrincipal;
    }
    
    public void mostrarArmaduras(){
        int cantidad;
        int caso = getVistaPedir().getJcArmaduras().getSelectedIndex();
        try{
            cantidad = Integer.parseInt(getVistaPedir().getJtCantidad().getText());
            if(cantidad<=0)
                getVistaPedir().setVisible(false);
                getVistaPrincipal().setVisible(true);

            
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(vistaPedir, "Ingrese un número");
        }
        
        
    }
    
}
