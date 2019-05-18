/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.image;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Player;

/**
 *
 * @author diego
 */
public class Image extends Player implements IColiciones{
   
    private boolean fact = true; //this variable is for sending a verification that the garbage has disappeared
    protected ImageIcon trash; 
    protected String directionTrahs;//to receive the address where the image is
    //to each variable we put your set and get

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
     * @param imagen the imagen to set
     */
    public void setImagen(ImageIcon imagen) {
        this.setTrash(imagen);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return getDirectionTrahs();
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.setDirectionTrahs(nombre);
    }

    /**
     * @return the imagen
     */
    public ImageIcon getImagen() {
        return trash;
    }

    /**
     * @param trash the trash to set
     */
    public void setTrash(ImageIcon trash) {
        this.trash = trash;
    }

    /**
     * @return the directionTrahs
     */
    public String getDirectionTrahs() {
        return directionTrahs;
    }

    /**
     * @param directionTrahs the directionTrahs to set
     */
    public void setDirectionTrahs(String directionTrahs) {
        this.directionTrahs = directionTrahs;
    }

    
    @Override
    //function that receives an image and return a boolean for condiociones 
    public boolean colicion(JPanel trash1) {
        boolean resultado = false;
        if ((this.getX() > trash1.getX()-50 && this.getX() < trash1.getX()+50) && (this.getY() > trash1.getY()-50 && this.getY() < trash1.getY()+50 )){
            this.setVisible(false);
            resultado = false;
        }
       return resultado;
    }

    /**
     * @return the dato
     */
    public boolean isDato() {
        return fact;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(boolean dato) {
        this.fact = dato;
    }
}
