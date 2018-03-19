/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author emcq
 */
public class ChallengeGallery{
    ArrayList<Challenge> challenges;

    public ChallengeGallery() {
        this.challenges = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            challenges.add(new SimpleChallenge("Say yes", "POWER OVERWHELMING"));
        }
    }
    
    public Challenge pick(){
        Random random = new Random();
        int challenge = random.nextInt(9);
        return challenges.get(challenge);
    }
}
