/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Vista.InterfazJuego;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Vista.InterfazCreadores;
import javax.swing.JOptionPane;

/**
 *
 * @author eison
 */
public class InterfazMenu extends JFrame implements ActionListener {
    JButton jugar, creadores, soporte;
    JLabel fondo,letrero;
    
    Tutorial tu=new Tutorial();
    
    
    
    public InterfazMenu(){
      Container con= getContentPane();
      this.setTitle("Trash  In  The Place");
      con.setLayout(null);
      setBounds(0, 0, 1040, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
      ImageIcon letre= new ImageIcon("src/botones/letrero.png");
      ImageIcon bJ= new ImageIcon("src/botones/jugar.png");
      ImageIcon bC= new ImageIcon("src/botones/bCreadores.png");
      ImageIcon bS= new ImageIcon("src/botones/bSoporte.png");
      ImageIcon fon = new ImageIcon("src/imagenes/menu21.jpg");
      
      letrero= new JLabel(letre);
      fondo= new JLabel(fon);
      jugar = new JButton(bJ);
      creadores = new JButton(bC);
      soporte = new JButton(bS);
      
      letrero.setBounds(250,-40,500,300);
   
      con.add(letrero);
      
      jugar.setBounds(390,170,200,100);
      jugar.setBorderPainted(false);
      jugar.setContentAreaFilled(false);
      jugar.setBackground(new Color(255,255,255,100));
      con.add(jugar);
      creadores.setBounds(390, 290, 200, 100);
      creadores.setBorderPainted(false);
      creadores.setContentAreaFilled(false);
      creadores.setBackground(new Color(255,255,255,100));
      con.add(creadores);
      soporte.setBounds(390, 410, 200, 100);
      soporte.setBorderPainted(false);
      soporte.setContentAreaFilled(false);
      soporte.setBackground(new Color(255,255,255,100));
      con.add(soporte);
      fondo.setBounds(-1000, -1200, 3000, 3000);
      con.add(fondo);
      
      setVisible(true);
      jugar.addActionListener( this);
      creadores.addActionListener( this);
      soporte.addActionListener( this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    }

 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jugar){
            Vista.InterfazRegistro i=new Vista.InterfazRegistro();
            AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
            this.setVisible(false);
        // aca se coloca el objeto del juego o nivel
        }if (e.getSource()==creadores){
      InterfazCreadores t=new InterfazCreadores();
      this.setVisible(false);
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
        
        }if (e.getSource()==soporte){
         tu.Tutorial();//
         Tutorial i=new Tutorial();
         AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
         this.setVisible(false);
        
        }
    }

   
    
    
    
    
    
}
