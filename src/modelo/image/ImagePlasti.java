/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.image;

import com.sun.glass.ui.Window;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import modelo.trashOganic.Trash;

/**
 *
 * @author diego
 */
public class ImagePlasti extends Image implements MouseMotionListener{
    
    Trash trashPlast = new Trash("");//we create an object of the class afterh
    public  ImagePlasti(String directionTrash){ //we created it an overloaded constructor
        trashPlast.setBounds(900, 350, 50, 50); // to the created object we give an area   
        addMouseMotionListener(this);
        this.directionTrahs=directionTrash;
    }
    

    @Override
    //function to be able to drag each object
    public void mouseDragged(MouseEvent me) {
        setLocation(this.getX()+me.getX()-this.getWidth()/2,this.getY()+me.getY()-this.getHeight()/2);
             setDato(colicion(trashPlast));//we call the collision function and we send the object and a boolean returns to be able to do the condition
            
    }

    @Override
    public void mouseMoved(MouseEvent me) {
       
    }
    
    
    
    /**
     *
     * @param g
     */
    @Override
    //function where we paint we adapt the image to jpanel
    public  void  paint(Graphics g){
        trash = new ImageIcon(getClass().getResource(directionTrahs));
        g.drawImage(trash.getImage(),0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }

    /**
     * @return the dato
     */


    
}
