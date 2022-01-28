package ironman.presentacion;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * 
 * 
 * 
 */
public class VistaNueva extends javax.swing.JFrame {
    private final String carpetaImagenes = "src\\ironman\\presentacion\\imagenes\\";
    private final String formato = ".png";
    private int numArmadura, cantidadArmaduras;

    private Modelo modelo;

    /**
     * Creates new form vistaPrincipal
     */
    public VistaNueva(Modelo modelo) {
        this.modelo = modelo;
        
        miniaturas = new JLabel[3][8];
        initComponents();

        agregarEventos();
    }

    private void agregarEventos() {
        jbRegresar.addActionListener(modelo.getVistaPedir().getControl());
        lblImgArmadura.addMouseListener(modelo.getVistaPedir().getControl());
        lblElemento1.addMouseListener(modelo.getVistaPedir().getControl());
        lblElemento2.addMouseListener(modelo.getVistaPedir().getControl());
        lblElemento3.addMouseListener(modelo.getVistaPedir().getControl());
        lblElemento4.addMouseListener(modelo.getVistaPedir().getControl());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbRegresar = new javax.swing.JButton();
        jpDescripcion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCaracteristicas = new javax.swing.JTextArea();
        jpTraje = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombreTraje = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jpElemento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpMiniaturas = new javax.swing.JPanel();
        lblImgArmadura = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblElemento1 = new javax.swing.JLabel();
        lblElemento2 = new javax.swing.JLabel();
        lblElemento3 = new javax.swing.JLabel();
        lblElemento4 = new javax.swing.JLabel();

        jbRegresar.setText("Regresar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Características");

        jtaCaracteristicas.setColumns(20);
        jtaCaracteristicas.setLineWrap(true);
        jtaCaracteristicas.setRows(5);
        jtaCaracteristicas.setTabSize(4);
        jtaCaracteristicas.setEnabled(false);
        jScrollPane1.setViewportView(jtaCaracteristicas);

        javax.swing.GroupLayout jpDescripcionLayout = new javax.swing.GroupLayout(jpDescripcion);
        jpDescripcion.setLayout(jpDescripcionLayout);
        jpDescripcionLayout.setHorizontalGroup(
            jpDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpDescripcionLayout.setVerticalGroup(
            jpDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTraje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Traje");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad");

        lblNombreTraje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreTraje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpTrajeLayout = new javax.swing.GroupLayout(jpTraje);
        jpTraje.setLayout(jpTrajeLayout);
        jpTrajeLayout.setHorizontalGroup(
            jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTrajeLayout.setVerticalGroup(
            jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jpTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreTraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpElemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Replicas");

        javax.swing.GroupLayout jpMiniaturasLayout = new javax.swing.GroupLayout(jpMiniaturas);
        jpMiniaturas.setLayout(jpMiniaturasLayout);
        jpMiniaturasLayout.setHorizontalGroup(
            jpMiniaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpMiniaturasLayout.setVerticalGroup(
            jpMiniaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpElementoLayout = new javax.swing.GroupLayout(jpElemento);
        jpElemento.setLayout(jpElementoLayout);
        jpElementoLayout.setHorizontalGroup(
            jpElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpElementoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpMiniaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpElementoLayout.setVerticalGroup(
            jpElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpElementoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMiniaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblImgArmadura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgArmadura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblElemento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblElemento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblElemento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblElemento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblElemento2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblElemento3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblElemento4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblElemento4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElemento3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElemento2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jpTraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jpElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpTraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgArmadura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ponerMiniaturas(int cantidad){
        this.cantidadArmaduras = cantidad;
        String rutaMiniaturaTraje = carpetaImagenes + "Mini" + obtenerNombreArmadura() + formato; 
        ImageIcon fig = new ImageIcon(rutaMiniaturaTraje);
        int numeroReplicas = 0;
        jpMiniaturas.getGraphics().clearRect(0, 0, 4000, 4000);
        for (int j = 0; j < 8; j++)
            for (int i = 0; i < 3; i++) {
                if(miniaturas[i][j] != null)
                    miniaturas[i][j].setText("");
                miniaturas[i][j] = new JLabel();
                jpMiniaturas.add(miniaturas[i][j]);
                miniaturas[i][j].setBounds(i*75, j*75, 60, 60);
                
                miniaturas[i][j].setIcon(fig);
                
                numeroReplicas++;
                
                if(numeroReplicas == cantidad)
                    return;
            }
        
    }
    
    public void ponerTraje() {
        String rutaImgTraje = carpetaImagenes + obtenerNombreArmadura() + formato;
        
        ImageIcon fig = new ImageIcon(rutaImgTraje);
        lblImgArmadura.setIcon(fig);
    }

    private String obtenerNombreArmadura() {
        switch (numArmadura) {
            case 1:
                return "Mark1";
            case 2:
                return "Mark2";
            case 3:
                return "Mark3";
            case 4:
                return "WarMachine";
            default:
                return "";
        }
    }
    public void ponerElementos(){
        ImageIcon fig;
                
        fig = new ImageIcon(obtenerRutaElemento(1));
        lblElemento1.setIcon(fig);
        
        fig = new ImageIcon(obtenerRutaElemento(2));
        lblElemento2.setIcon(fig);
     
        fig = new ImageIcon(obtenerRutaElemento(3));
        lblElemento3.setIcon(fig);
        
        fig = new ImageIcon(obtenerRutaElemento(4));
        lblElemento4.setIcon(fig);
    }
    
    private String obtenerRutaElemento(int numElemento){
        String rutaElemento = carpetaImagenes ;
        
        switch (numElemento) {
            case 1:
                rutaElemento += "Casco";
                break;
            case 2:
                rutaElemento += "Peto";
                break;
            case 3:
                rutaElemento += "Guantes";
                break;
            case 4:
                rutaElemento += "Botas";
                break;
        }
        rutaElemento += obtenerNombreArmadura() + formato;
        return rutaElemento;
    }
    

    public void escribirLinea(boolean agregar, String texto) {
        jtaCaracteristicas.append(texto);
    }

    public JTextArea getJtaCaracteristicas() {
        return jtaCaracteristicas;
    }

    public void setNumArmadura(int numArmadura) {
        this.numArmadura = numArmadura;
        switch (numArmadura) {
            case 1:
                lblNombreTraje.setText("Mark 1");
                break;
            case 2:
                lblNombreTraje.setText("Mark 2");
                break;
            case 3:
                lblNombreTraje.setText("Mark 3");
                break;
            case 4:
                lblNombreTraje.setText("War Machine");
                break;
        }
        ponerTraje();
        ponerElementos();
        
    }

    public JLabel getLblImgArmadura() {
        return lblImgArmadura;
    }

    public JLabel getLblElemento1() {
        return lblElemento1;
    }

    public JLabel getLblElemento2() {
        return lblElemento2;
    }

    public JLabel getLblElemento3() {
        return lblElemento3;
    }

    public JLabel getLblElemento4() {
        return lblElemento4;
    }
    
    public JLabel getLblCantidad() {
        return lblCantidad;
    }

    public JButton getJbRegresar() {
        return jbRegresar;
    }
    
    private javax.swing.JLabel [][] miniaturas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpElemento;
    private javax.swing.JPanel jpMiniaturas;
    private javax.swing.JPanel jpTraje;
    private javax.swing.JTextArea jtaCaracteristicas;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblElemento1;
    private javax.swing.JLabel lblElemento2;
    private javax.swing.JLabel lblElemento3;
    private javax.swing.JLabel lblElemento4;
    private javax.swing.JLabel lblImgArmadura;
    private javax.swing.JLabel lblNombreTraje;
    // End of variables declaration//GEN-END:variables
}
