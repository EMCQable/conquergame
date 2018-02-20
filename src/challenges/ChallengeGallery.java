/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.ArrayList;

/**
 *
 * @author emcq
 */
public class ChallengeGallery{
    ArrayList<SimpleChallenge> challenges;

    public ChallengeGallery() {
        this.challenges = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            SimpleChallenge woop = new SimpleChallenge("Say yes", "POWER OVERWHELMING");
            challenges.add(woop);
        }
    }
    
    public SimpleChallenge pick(){
        return challenges.get(0);
    }
}
