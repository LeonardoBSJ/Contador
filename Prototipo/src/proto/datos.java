package proto;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import javax.swing.*;
public class datos extends JFrame implements Runnable {
    int tiempo;
    public datos() {
        this.setLayout(null);
        this.setTitle("importar imagen ");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    

    

    public void componentes() {
        JLabel labe = new JLabel(" valor ");
        labe.setBounds(10, 30, 100, 30);
        labe.setBackground(Color.white);
        this.add(labe);

        JLabel la = new JLabel("10");
        la.setBounds(10, 65, 100, 30);
        la.setBackground(Color.white);
        this.add(la);

        JTextField tex = new JTextField();
        tex.setText(la.getText());
        tex.setEditable(false);
        tex.setBackground(Color.white);
        tex.setBounds(210, 80, 30, 25);
        this.add(tex);

        JButton boton = new JButton("contar");
        boton.setBounds(10, 100, 100, 25);
        boton.setBackground(Color.cyan);
        this.add(boton);

        Panel pan = new Panel();
        pan.setSize(300, 300);
        pan.setBackground(Color.red);
        this.add(pan);

        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Thread da = new Thread(datos.this);
                da.start();

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });

    }

    @Override
    public void run() {
        JTextField la = new JTextField("10");
       
        la.setBounds(10, 65, 100, 30);
        la.setBackground(Color.white);
        this.add(la);

        JTextField tex = new JTextField();
        tex.setEditable(false);
        tex.setBackground(Color.white);
        tex.setBounds(210, 80, 30, 25);
        this.add(tex);
        
        tiempo = Integer.parseInt(la.getText());
        while (tiempo > 0) {
            tiempo--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(datos.class.getName()).log(Level.SEVERE, null, ex);
            }

            tex.setText(Integer.toString(  tiempo));
        }
        JOptionPane.showInternalMessageDialog(null, "Fin de conteo");
    }

}
