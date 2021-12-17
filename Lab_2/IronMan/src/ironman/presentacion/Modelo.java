package ironman.presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ironman.logica.Armadura;
import ironman.logica.CreadorArmadura;

/**
 *
 * 
 */
public class Modelo {
    private VistaInicial vistaPedir;
    private VistaCaracteristicas vistaPrincipal;
    private List<Armadura> armaduras;// lista parar gnerar una armadura
    private String tipoArmadura;

    public Modelo() {
        armaduras = new ArrayList<>();
        getVistaPedir().setVisible(true);
    }

    public VistaInicial getVistaPedir() {
        if (vistaPedir == null) {
            vistaPedir = new VistaInicial(this);
        }
        return vistaPedir;
    }

    public VistaCaracteristicas getVistaPrincipal() {
        if (vistaPrincipal == null) {
            vistaPrincipal = new VistaCaracteristicas(this);
        }
        return vistaPrincipal;
    }

    public void generarArmaduras() {
        int cantidad;
        int numArmadura = getVistaPedir().getJcArmaduras().getSelectedIndex();
        try {
            cantidad = Integer.parseInt(getVistaPedir().getJtCantidad().getText());
            if (numArmadura == 0) {
                JOptionPane.showMessageDialog(null, "Por favor seleccione una armadura.");
                return;
            } else if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null,
                        "El valor es inferior o igual a cero.\nPor favor ingrese otro valor.");
                return;
            } else {
                switch (numArmadura) {
                    case 1:
                        tipoArmadura = "Mark1";
                        break;
                    case 2:
                        tipoArmadura = "Mark2";
                        break;
                    case 3:
                        tipoArmadura = "Mark3";
                        break;
                    case 4:
                        tipoArmadura = "WarMachine";
                        break;
                }
                CreadorArmadura creadorArmadura = new CreadorArmadura();
                for (int i = 0; i < cantidad; i++) {
                    armaduras.add(creadorArmadura.retrieveArmadura(tipoArmadura));
                }

                getVistaPrincipal().agregarLinea("Nombre de la armadura " + armaduras.get(0).getNombreArmadura());
                mostrarCaracteristicas("Casco", armaduras.get(0).getCasco().obtenerCaracteristicas());
                mostrarCaracteristicas("Botas", armaduras.get(0).getBotas().obtenerCaracteristicas());
                mostrarCaracteristicas("Peto", armaduras.get(0).getPeto().obtenerCaracteristicas());
                mostrarCaracteristicas("Guantes", armaduras.get(0).getGuantes().obtenerCaracteristicas());

                getVistaPedir().setVisible(false);
                getVistaPrincipal().setNumArmadura(numArmadura);
                getVistaPrincipal().getLblCantidad().setText(cantidad + "");
                getVistaPrincipal().setVisible(true);
            }
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(vistaPedir, "Ingrese un número");
        }
    }

    public void mostrarCaracteristicas() {
        getVistaPrincipal().getJtaCaracteristicas().setText("");
        switch (getVistaPrincipal().getjComboBox1().getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione un elemento.");
                break;
            case 1:
                mostrarCaracteristicas("Casco", armaduras.get(0).getCasco().obtenerCaracteristicas());
                getVistaPrincipal().putElemento(1);
                break;
            case 2:
                mostrarCaracteristicas("Peto", armaduras.get(0).getPeto().obtenerCaracteristicas());
                getVistaPrincipal().putElemento(2);
                break;
            case 3:
                mostrarCaracteristicas("Guantes", armaduras.get(0).getGuantes().obtenerCaracteristicas());
                getVistaPrincipal().putElemento(3);
                break;
            case 4:
                mostrarCaracteristicas("Botas", armaduras.get(0).getBotas().obtenerCaracteristicas());
                getVistaPrincipal().putElemento(4);
                break;
        }
    }

    private void mostrarCaracteristicas(String tipo, List<String> caracteristicas) {
        getVistaPrincipal().agregarLinea("\nCaracteristicas de " + tipo);
        for (String caracteristica : caracteristicas) {
            getVistaPrincipal().agregarLinea("\n\t" + caracteristica);
        }
    }
}
