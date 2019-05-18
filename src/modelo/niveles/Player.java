/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class Player extends JPanel{
    
    private JLabel mame;
    private int score = 0;
    
    public Player(){
    
    }

    
    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}
