/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.niveles;

import Vista.Hilos;
import Vista.InterfazJuego;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.image.ImageGlass;
import modelo.image.ImageOrganic;
import modelo.image.ImagePaper;
import modelo.image.ImagePlasti;
import modelo.trashOganic.Trash;

/**
 *
 * @author Eison
 */
public final class Level1 extends JPanel {
    
    
    private ImageIcon imagen;
    private String nombre; 
    Hilos h = new Hilos();
    Trash trahsOrg = new Trash("/imagenes/basura_organicos.png" );
    Trash trashPlast = new Trash("/imagenes/basura_Plast.png");
    Trash trashPap = new Trash("/imagenes/basura_papel.png");
    Trash trashGlass = new Trash("/imagenes/basura_vidrio.png");
    
    ImageGlass bottleGlass = new ImageGlass("/imagenes/botella-01.png");
    ImageGlass lata = new ImageGlass("/imagenes/Lata-01.png");
    ImageGlass cell = new ImageGlass("/imagenes/celular.png");
    
    ImagePaper papel1 = new ImagePaper("/imagenes/Papel-01.png");
    ImagePaper papel2 = new ImagePaper("/imagenes/papel-03.png");
    ImagePaper paperboard = new ImagePaper("/imagenes/cart.png");
    
    ImageOrganic fish = new ImageOrganic("/imagenes/comida-05.png");
    ImageOrganic apple1 = new ImageOrganic("/imagenes/manzana.png");
    ImageOrganic apple2 = new ImageOrganic("/imagenes/Manzana-01.png");
    
    ImagePlasti bg = new ImagePlasti("/imagenes/bolsa.png");
    ImagePlasti bottlePlast = new ImagePlasti("/imagenes/botella.png");

    // we create the objects for the implementation of the garbage images that are dragged on the screen
    public  Level1 (String nombre){ // the constructor is placed overloaded to receive the address where the image is stored 

        setLayout(null);
      
        
        //location of each of the elements that can be 
        h.setBounds(0, 0, 1040, 600);
        fish.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        apple1.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        apple2.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        
        cell.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        bottleGlass.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        lata.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        
        papel1.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250),50 ,50);
        papel2.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        paperboard.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        
        bg.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 80, 80);
        bottlePlast.setBounds((int)(Math.random()*1000),(int)(Math.random()*300+250), 50, 50);
        
        //ubicasion de las imagenes de las canecas
        trahsOrg.setBounds(50, 350, 180, 150);
        trashPap.setBounds(150, 350, 170, 150);
        trashGlass.setBounds(700, 350, 180, 160);
        trashPlast.setBounds(830, 350, 180, 150);
        
        
        
        add (h); 
        add(fish); add(apple2); add(apple1);
        add(cell); add(bottleGlass); add(lata);
        add(papel2); add(papel1);add(paperboard);
        add(bg); add(bottlePlast);
        
        add(trashPap); add(trahsOrg); add(trashGlass); add(trashPlast);
        
        this.nombre = nombre;
     
        
    }
    
    
    
    public  void paint( Graphics g ){
        //function where we paint we adapt the image to jpanel 
        imagen = new ImageIcon (getClass().getResource(nombre));
        g.drawImage(imagen.getImage(), 0, 0,getWidth(),getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
    // function that checks that all images are deleted
    public void condiciones(){
        boolean p1,p2;
        boolean g1,g2,g3;
        boolean pa1,pa2,pa3;
        boolean o1,o2,o3;
        int u;
        
        p1=bottlePlast.isDato(); p2=bg.isDato();
        g1=bottleGlass.isDato(); g2=cell.isDato(); g3=lata.isDato();
        pa1=papel1.isDato(); pa2=papel2.isDato(); pa3=paperboard.isDato();
        o1=apple1.isDato(); o2=apple2.isDato(); o3=fish.isDato();
        
        
        if ( p1==false && p2==false && g1==false && g2==false && g3==false && 
             pa1==false && pa2==false && pa3==false && o1==false && o2==false && o3==false ){
            u=0;    
           }else{
            u=1;
            }
        //function that checks if all the images have already disappeared
        if (u==0){
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/vaquero.WAV"));
        Sound.play();
            InterfazJuego p = new InterfazJuego();
            this.setVisible(false);
        }
        if(u==1){
            AudioClip Sound;

            // parte que tiene el sonido
      Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/sonidoTriste.WAV"));
        Sound.play();
            JOptionPane.showMessageDialog(null, "Todavia tienes basura que recoger");
        }
         
    }
}
    
    

