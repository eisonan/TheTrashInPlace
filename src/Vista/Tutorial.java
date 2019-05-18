/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author eison
 */
public class Tutorial extends JFrame implements ActionListener{
    JButton menu,jugar;
    JLabel fondo;
    JLabel pasoIm;
    JTextArea palabras;
    public void Tutorial(){
        
   Container con= getContentPane();
      con.setLayout(null);
      
      this.setVisible(true);
      this.setTitle("Trash  In  Them Place");
       this.setResizable(false);
       
      setBounds(0, 0, 1040, 600);
      this.setLocationRelativeTo(null);
      ImageIcon men= new ImageIcon("src/botones/menu1.png");
      ImageIcon fon = new ImageIcon("src/imagenes/menu21.jpg");
      ImageIcon pasoImagen = new ImageIcon("src/Tutorial_imagenes/tuto.jpg");
      ImageIcon juga= new ImageIcon("src/botones/jugar.png");
      
      fondo= new JLabel(fon);
      menu=new JButton(men);
      jugar=new JButton(juga);
      pasoIm=new JLabel(pasoImagen);
      
      pasoIm.setBounds(60, -150, 900, 800);
      con.add(pasoIm);
        setVisible(true);
      fondo.setBounds(-1000, -1200, 3000, 3000);
      con.add(fondo);
        setVisible(true);
      jugar.setBounds(10, 500, 150, 50);
      con.add(jugar);
        setVisible(true);
      menu.setBounds(900, 500, 50, 50);
      con.add(menu);
        setVisible(true);

    
      menu.addActionListener(this);
      jugar.addActionListener( this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
     public void actionPerformed(ActionEvent e) {
         
      if (e.getSource()==menu){
         AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
          InterfazMenu i=new InterfazMenu();
                 this.setVisible(false);
      }
      if (e.getSource()==jugar){
          AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
         Vista.InterfazJuego play=new Vista.InterfazJuego();
                 this.setVisible(false);

     }
}
    
    } 
    
    

