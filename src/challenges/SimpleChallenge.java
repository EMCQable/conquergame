/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.Scanner;
import javax.crypto.Mac;
import players.MainPlayer;
import players.ChallengeCompleter;

/**
 *
 * @author emcq
 */
public class SimpleChallenge implements Challenge {

    private String name;
    private String description;
    private int bonusPower;
    private int requiredPower;
    private boolean completed;

    public SimpleChallenge(
            String name,
            String description,
            int bonusPower,
            int requiredPower,
            boolean completed) {

        this.name = name;
        this.description = description;
        this.bonusPower = bonusPower;
        this.requiredPower = requiredPower;
        this.completed = completed;
    }

    public SimpleChallenge(String name, String description) {
        this(name, description, 10, 0, false);
    }

    @Override
    public void addToJournal(ChallengeCompleter player) {
        player.addQuest(this);
    }

    @Override
    public void checkIfAbleToStart(ChallengeCompleter player) {
        //add a system to check if requirements are met
        //quest requirements rest in a file?
        if (true == false){
            complete(player);
        }
    }

    //placeholder for now
    @Override
    public void doChallenge(Scanner reader, ChallengeCompleter player) {
        System.out.println("Do you want power?\n"
                + "Answer 'yes' if you do.");
        String answer = reader.nextLine();
        if (answer.equals("yes")) {
            complete(player);
        }
    }
    
    @Override
    public void complete(ChallengeCompleter player) {
        completed = true;
        for (int i = 0; i < bonusPower; i++) {
            player.increasePower();
        }
        System.out.println("You completed your challenge. \n"
                + "Your power level has increased!\n"
                + "It is now " + player.getPower() + "!");

    }

}
