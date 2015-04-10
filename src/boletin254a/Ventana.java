/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin254a;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sbenavidesvazquez
 */
public class Ventana {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    
    public void Vent(){
        
        marco=new JFrame("Principal");
        panel=new JPanel();
        boton=new JButton("boton");
        
        panel.setLayout(new FlowLayout());
        
        panel.add(boton);
        marco.add(panel);
        marco.setSize(250, 250);
        
        boton.addActionListener(new Spam());
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
