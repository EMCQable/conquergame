/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import challenges.Challenge;
import java.util.HashMap;

/**
 *
 * @author emcq
 */
public class PlayerStats {
    private int kills;
    private HashMap<Challenge, Boolean> quests;
    private int power;
    private HashMap<Diplomat, Integer> relations;

    public PlayerStats(int kills, HashMap quests, int power, HashMap<Diplomat, Integer> relations) {
        this.kills = kills;
        this.quests = quests;
        this.power = power;
        this.relations = relations;
    }

    public PlayerStats() {
        this(0, new HashMap(), 0, new HashMap());
    }
    
    public void increasePower(){
        this.power++;
    }

    public int getPower() {
        return power;
    }

    public int getKills() {
        return kills;
    }
    
    public void kill(){
        kills++;
    }
    
    public void addQuest(Challenge quest){
        this.quests.put(quest, false);
    }
    
    public boolean checkIfQuestCompleted(Challenge quest){
        return this.quests.get(quest);
    }
    
    public void completeQuest(Challenge quest){
        this.quests.put(quest, true);
    }
    
    public void deepenRelationship(Diplomat player){
        this.relations.put(player, this.relations.getOrDefault(player, 0) +1);
    }
    
    
    
    
}
