/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin254a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sbenavidesvazquez
 */
public class Spam implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        marco=new JFrame("Ventana 2");
        panel=new JPanel();
        
        marco.add(panel);
        marco.setSize(150, 150);
        
        marco.setVisible(true);
    }
}
