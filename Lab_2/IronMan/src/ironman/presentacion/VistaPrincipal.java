package ironman.presentacion;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * 
 * 
 * 
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private Modelo modelo;
    private Graphics gTraje;
    private Graphics gElemento;
    
    /**
     * Creates new form vistaPrincipal
     */
    public VistaPrincipal(Modelo modelo) {
        this.modelo = modelo;
        initComponents();
        gTraje = jpTraje.getGraphics();
        gElemento = jpElemento.getGraphics();
        
        putElemento("imagenes\\BotasWarMachine.jpg");
        putTraje("D:\\Workspace\\UD\\modelos1\\Lab_2\\IronMan\\src\\ironman\\presentacion\\imagenes\\Mark1.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCaracteristicas = new javax.swing.JTextArea();
        jpTraje = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpElemento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Caracteristicas");

        textCaracteristicas.setColumns(20);
        textCaracteristicas.setLineWrap(true);
        textCaracteristicas.setRows(5);
        textCaracteristicas.setTabSize(4);
        textCaracteristicas.setEnabled(false);
        jScrollPane1.setViewportView(textCaracteristicas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTraje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Traje");

        javax.swing.GroupLayout jpTrajeLayout = new javax.swing.GroupLayout(jpTraje);
        jpTraje.setLayout(jpTrajeLayout);
        jpTrajeLayout.setHorizontalGroup(
            jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrajeLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jpTrajeLayout.setVerticalGroup(
            jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jpElemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Objeto");

        javax.swing.GroupLayout jpElementoLayout = new javax.swing.GroupLayout(jpElemento);
        jpElemento.setLayout(jpElementoLayout);
        jpElementoLayout.setHorizontalGroup(
            jpElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpElementoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpElementoLayout.setVerticalGroup(
            jpElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpElementoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpTraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void putTraje(String ruta){
        ImageIcon fig = new ImageIcon(ruta);
        JLabel etiqueta = new JLabel(fig);
        jpTraje.add(etiqueta);
        //gTraje.drawImage(fig, 30, 100, 100, 100, jpTraje);
    }

    public void putElemento(String rutaElemento){
        Image fig = new ImageIcon(rutaElemento).getImage();
        //fig = fig.getScaledInstance(100, 100, 1);
        gElemento.drawImage(fig, 30, 30, 100, 100, jpElemento);
    }

    public void agregarLinea(String texto){
        textCaracteristicas.append(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpElemento;
    private javax.swing.JPanel jpTraje;
    private javax.swing.JTextArea textCaracteristicas;
    // End of variables declaration//GEN-END:variables
}