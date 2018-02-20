/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

import challenges.*;
import java.util.Scanner;

/**
 *
 * @author emcq
 */
public class ConquerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Player mainChar = new Player();
        ChallengeGallery challenges = new ChallengeGallery();
        
        while (mainChar.getPower() < 100){
            SimpleChallenge challenge = challenges.pick();
            challenge.doChallenge(reader, mainChar);
        }
        
        System.out.println("You win!");
        
    }
    
}
