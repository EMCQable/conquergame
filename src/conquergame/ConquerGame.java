/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

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
        
        while (true){
            System.out.println("Press 1 to become more powerful!"
                    + "You win when your power is at 100.");
            
            String command = reader.nextLine();
            if (command.equals("1")){
                System.out.println("POWER OVERWHELMING!");
                mainChar.increasePower();
            } else {
                System.out.println("No power for me, thanks.");
            }
            System.out.println("My power level is at "+ mainChar.getPower());
            if (mainChar.getPower() == 100){
                break;
            }
        }
        
        System.out.println("You win!");
        
    }
    
}
