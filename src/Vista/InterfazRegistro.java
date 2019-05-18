/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author eison
 */
 

/**
 *
 * 
 */
public class InterfazRegistro extends JFrame implements ActionListener {
    JButton jugar,menu,registrarse;
    JLabel fondo,titulo;
    JLabel nombreJlab;
    JTextField nombreJtex;
    String nombre= "";
    String edad=" ";
    
    public InterfazRegistro(){
        this.setTitle("Trash  In  The Place");
      Container con= getContentPane();
      con.setLayout(null);
      this.setVisible(true);
       this.setResizable(false);
      setBounds(0, 0, 1040, 600);
      this.setLocationRelativeTo(null);
      ImageIcon  titu= new ImageIcon("src/botones/tituloRegistro.png");
      ImageIcon men= new ImageIcon("src/botones/menu1.png");
      ImageIcon nU= new ImageIcon("src/botones/jugar.png");
      ImageIcon nomb= new ImageIcon("src/botones/nombre.png");
    
      ImageIcon fon = new ImageIcon("src/imagenes/menu21.jpg");
      nombreJlab= new JLabel(nomb);
      nombreJtex= new JTextField();
      menu = new JButton(men);
      fondo= new JLabel(fon);
      titulo=new JLabel(titu);
      jugar = new JButton(nU);
     
      titulo.setBounds(300,10,500,200);
      nombreJlab.setBounds(100,200,500,100);
      nombreJtex.setBounds(600,200, 200,100);
      menu.setBounds(900, 500, 50, 50);
      con.add(menu);
      jugar.setBounds(390,300,200,100);
      jugar.setBorderPainted(false);
      jugar.setContentAreaFilled(false);
      jugar.setBackground(new Color(255,255,255,100));
      con.add(nombreJlab);
      con.add(nombreJtex);
      con.add(jugar);
      con.add(titulo);
      
      fondo.setBounds(-1000, -1200, 3000, 3000);
      con.add(fondo);
      
      setVisible(true);
      menu.addActionListener(this);
      jugar.addActionListener( this);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        
    }

 public void guardar(){
   
    FileWriter archivo= null;
    PrintWriter linea=null;
    String cadena="";
        try {
            archivo=new FileWriter("datos.txt",true);
           PrintWriter pw=new PrintWriter(archivo);
           
               
           pw.println("Player: "+nombreJtex.getText());
           pw.close();
           
        } catch (Exception e) {
            System.out.println("archivo malo"+e.getMessage());
        }   
    }
    
    public void actionPerformed(ActionEvent e) {
         
        if (e.getSource()==jugar){
            if (nombreJtex.getText().equalsIgnoreCase("")  ){
                JOptionPane.showMessageDialog(null, "ingrese un nombre");
            }else{
            guardar();
           InterfazJuego o=new InterfazJuego();
           AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
           this.setVisible(false);
            }
            
          
        }
        
        if (e.getSource() == menu){
          vista.InterfazMenu i=new vista.InterfazMenu();  
          AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton.WAV"));
        Sound.play();
        this.setVisible(false);
    }
}
    
    
    
    }




