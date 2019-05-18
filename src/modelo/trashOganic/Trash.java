/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.trashOganic;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
//clase de las canecas de basuras

public class Trash extends JPanel{
   
   protected ImageIcon bumpster;
   protected String directionImageTra;//variable that stores the location where the image is 


   
   public Trash(String directionImageTra){

       this.directionImageTra=directionImageTra;
       
   }
    /**
     * @return the bumpster
     */
    public ImageIcon getBumpster() {
        return bumpster;
    }

    /**
     * @param bumpster the bumpster to set
     */
    public void setBumpster(ImageIcon bumpster) {
        this.bumpster = bumpster;
    }

    /**
     * @return the directionImageTra
     */
    public String getDirectionImageTra() {
        return directionImageTra;
    }

    /**
     * @param directionImageTra the directionImageTra to set
     */
    public void setDirectionImageTra(String directionImageTra) {
        this.directionImageTra = directionImageTra;
    }
  
   
    /**
     *
     * @param g
     */
    @Override
    //function where we paint we adapt the image to jpanel
    public  void  paint(Graphics g){
        bumpster = new ImageIcon(getClass().getResource(directionImageTra));
        g.drawImage(bumpster.getImage(),0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}


