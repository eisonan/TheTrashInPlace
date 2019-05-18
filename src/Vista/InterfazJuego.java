/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.applet.AudioClip;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.niveles.Level1;
import modelo.image.Image;

/**
 *
 * @author eison
 */
public class InterfazJuego  extends JFrame implements ActionListener{
    
    ArrayList<Level1> leves = new ArrayList();
    
     JButton menu,niveles;
     
     private int numLevel= (int) (Math.random()*3);
    Level1 leve1 = new Level1("/imagenes/2.jpg");
    Level1 leve2 = new Level1("/imagenes/menu2.jpg");
    Level1 leve3 = new Level1("/imagenes/panel3.jpg");
    
    
    public InterfazJuego(){
        
        
        leves.add(leve1);
        leves.add(leve2);
        leves.add(leve3);
        
        this.setBounds(0, 0, 1040, 600);
        this.setTitle("Trash  In  The Place");
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        ImageIcon men= new ImageIcon("src/botones/menu1.png");
        ImageIcon compo= new ImageIcon("src/botones/bcomprobar.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentpane = getContentPane();
        
        menu = new JButton(men);
        niveles = new JButton(compo);
        niveles.setContentAreaFilled(false);
        niveles.setBounds(400, 0, 200, 100);
        menu.setBounds(900, 500, 50, 50);
        niveles.setBorderPainted(false);
        contentpane.add(niveles);
        contentpane.add(menu); 
        contentpane.add(leves.get(numLevel));
        
        
      setVisible(true);
      niveles.addActionListener(this);
      menu.addActionListener( this);
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
     public void actionPerformed(ActionEvent e) {
         
      if (e.getSource()== menu){
         AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
       InterfazRegistro p=new InterfazRegistro();
                 this.setVisible(false);
                 
     } if (e.getSource() == niveles) {
                if(numLevel == 0){
                    leve1.condiciones();
                }else if(numLevel == 1){
                    leve2.condiciones();
                }else if(numLevel == 2){
                    leve3.condiciones();
                   
                }
            
            
     }
                 
         
}

    
}
