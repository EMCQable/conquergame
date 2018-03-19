/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import java.util.HashMap;
import tools.NameGenerator;

/**
 *
 * @author emcq
 */
public class NPC implements Diplomat{
    private HashMap<Diplomat, Integer> relations;
    private String name;

    public NPC() {
        relations = new HashMap<>();
        name = new NameGenerator().toString();
    }
    
    public void tellName(){
        System.out.println("Hi, my name is " + name + ".");
    }
    
    
    @Override
    public void befriend(Diplomat player) {
        this.relations.put(player, this.relations.getOrDefault(player, 0) +1);
    }
    
    public String relationStatus(Diplomat player){
        int status = this.relations.getOrDefault(player, 0);
        if (status > 0 && status < 5){
            return "You're barely aqcuainted.";
        } else if (status >= 5){
            return "You get along well.";
        }
        return "You do not know this person.";
    }
    
    
    
}
