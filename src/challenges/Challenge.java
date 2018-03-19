/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.Scanner;
import players.ChallengeCompleter;

/**
 *
 * @author emcq
 */
public interface Challenge {
    
    public void doChallenge(Scanner reader, ChallengeCompleter player);
    public void complete(ChallengeCompleter player);
    public void addToJournal(ChallengeCompleter player);
    public void checkIfAbleToStart(ChallengeCompleter player);
    
}
