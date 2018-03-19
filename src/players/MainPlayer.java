/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import challenges.Challenge;

/**
 *
 * @author emcq
 */
public class MainPlayer implements Diplomat, ChallengeCompleter{
    private PlayerStats stats;

    public MainPlayer() {
        stats = new PlayerStats();
    }
    
    @Override
    public void befriend(Diplomat player) {
        this.stats.deepenRelationship(player);
    }

    @Override
    public void increasePower() {
        stats.increasePower();
    }
    
    @Override
    public void addQuest(Challenge quest){
        stats.addQuest(quest);
    }
    
    @Override
    public void completeQuest(Challenge quest){
        stats.completeQuest(quest);
    }
    
    @Override
    public boolean checkIfQuestCompleted(Challenge quest){
        return stats.checkIfQuestCompleted(quest);
    }
    
    @Override
    public int getPower() {
        return stats.getPower();
    }
}
