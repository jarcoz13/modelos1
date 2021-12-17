/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman.presentacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */

class prueba2 implements ActionListener  {
    public static void main(String[] args) {
        new prueba2();
        sout
    }
    JComboBox<String> menu = new JComboBox<>();
    Graphics g;
    Image fig = new ImageIcon("D:\\Workspace\\UD\\modelos1\\Lab_2\\IronMan\\src\\ironman\\presentacion\\imagenes\\BotasWarMachine.jpg").getImage();

    prueba2(){
        String []op= {
                "Escoja una opción",
                "Pintar Cuadrado",
                "Borrar Cuadrado",
                "Pintar Icono",
                "Borrar Icono"
        };
        int i;
        for (i=0;i <op.length;i++) {
            menu.addItem(op[i]);
        }
        JFrame marco=new JFrame("");
        marco.setVisible(true);
        marco.setSize(230,170);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new FlowLayout(FlowLayout.LEFT));
        marco.add(menu);

        g = marco.getGraphics();

        menu.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        int op = menu.getSelectedIndex();
        int inicialy = 40;
        int inicialx = 157;
        switch(op){
            case 1:
                int [] x = {inicialx,inicialx,inicialx+50,inicialx+50};
                int [] y = {inicialy,inicialy+50,inicialy+50,inicialy};
                g.setColor(Color.blue);
                g.fillPolygon(x, y,4);
                break;
            case 2: g.clearRect(inicialx, inicialy, 50, 50);break;
            case 3: g.drawImage(fig,inicialx, inicialy+60, 50, 50, menu);break;
            case 4: g.clearRect(inicialx, inicialy+60, 50, 50);break;
        }
    }
}