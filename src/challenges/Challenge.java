/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import conquergame.Player;

/**
 *
 * @author emcq
 */
public class Challenge {
    private String name;
    private String description;
    private int bonusPower;
    private int requiredPower;
    private boolean completed;

    public Challenge(String name, String description, int bonusPower, int requiredPower, boolean completed) {
        this.name = name;
        this.description = description;
        this.bonusPower = bonusPower;
        this.requiredPower = requiredPower;
        this.completed = completed;
    }

    public Challenge(String name, String description) {
        this(name, description, 10, 0, false);
    }
    
    
    
    public void complete(Player player){
        completed = true;
        for (int i = 0; i < bonusPower; i++) {
            player.increasePower();
        }
        System.out.println("You power level has increased!\n"
                + "It is now " + player.getPower() + "!");
        
    }
    
}
