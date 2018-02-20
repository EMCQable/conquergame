/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

/**
 *
 * @author emcq
 */
public class Player {
    private int power;

    public Player() {
        this.power = 0;
    }

    public int getPower() {
        return power;
    }
    
    public void increasePower(){
        power++;
    }
    
    
}
