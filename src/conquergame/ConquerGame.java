/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

import challenges.*;
import java.util.Scanner;
import players.MainPlayer;
import players.Diplomat;

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
        MainPlayer mainChar = new MainPlayer();
        ChallengeGallery challenges = new ChallengeGallery();

        System.out.println("Welcome to Conquer!\n"
                + "In this game your objective is to increase your power level.\n"
                + "When your power reaches 100, you win!");

        while (mainChar.getPower() < 100) {
            Challenge challenge = challenges.pick();
            challenge.doChallenge(reader, mainChar);
        }

        System.out.println("You win!");

    }

}
