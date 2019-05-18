/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Eison
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

//this class is for created the image the bird that 
public class Hilos extends JPanel implements Runnable{
   
    private Image birds;
    private Thread hilo;
    private int x,y;
    private final int slow=5;
  
    
    public Hilos(){
      birds = new ImageIcon(this.getClass().getResource("/Gif/pajaro2.gif")).getImage();
      x=1200;
      y=100;  
        setFocusable(true);
    }

    @Override
    public void addNotify(){
        super.addNotify();
        hilo = new Thread(this);
        hilo.start();
    }
    
 
    public void ciclo(){
        x += 1;
        if ( x > (1500+70) ){
            x = -70;
        }
    }
    
    @Override
    public void run() {
        while(true){
            ciclo();
            repaint();
            try{
                Thread.sleep(slow);
            }catch(InterruptedException err){
                System.out.println(err);
            }
        }
    }
       @Override
    public  void  paint(Graphics g){
        setOpaque(false);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(birds,x,y, null);
        super.paint(g);
    }
}

