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
public interface ChallengeCompleter {
    public void increasePower();
    public int getPower();
    public void addQuest(Challenge challenge);
    public void completeQuest(Challenge challenge);
    public boolean checkIfQuestCompleted(Challenge challenge);
}
