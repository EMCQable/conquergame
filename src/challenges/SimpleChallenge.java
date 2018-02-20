/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import conquergame.Player;
import java.util.Scanner;

/**
 *
 * @author emcq
 */
public class SimpleChallenge extends Challenge{

    public SimpleChallenge(String name, String desc) {
        super(name, desc);
    }
    
    public void doChallenge(Scanner reader,Player player){
        System.out.println("Do you want power?\n"
                + "Answer 'yes' if you do.");
        String answer = reader.nextLine();
        if (answer.equals("yes"))
            complete(player);
    }
    
    
    
}
