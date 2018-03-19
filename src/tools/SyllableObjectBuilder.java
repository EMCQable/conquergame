/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Random;

/**
 *
 * @author qwecu @ bitbucket.com/qwecu This version had been translated from C#
 * to Java
 * Some unneeded functionality has been removed
 */
public class SyllableObjectBuilder{
    private static final Random random = new Random();
    private static String[] beginningCharacterList = {"", "b", "c", "ch", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
    private static int[] beginningWeights = {90, 10, 10, 10, 10, 10, 10, 10, 10, 10, 30, 30, 30, 30, 3, 20, 20, 20, 10, 5, 5, 5,};
    private static String[] vowelList = {"a", "ai", "e", "i", "o", "ou", "u", "y"};
    private static int[] vowelWeights = {15, 2, 12, 12, 10, 2, 8, 5};
    private static String[] endingCharacterList = {"", "b", "c", "ch", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
    private static int[] endingWeights = {300, 10, 10, 7, 10, 8, 8, 8, 2, 13, 13, 13, 13, 13, 3, 13, 13, 13, 10, 3, 3, 3,};


    public Syllable randomSyllable() throws Exception{
        return new Syllable(
                pickCharacter(beginningCharacterList, beginningWeights),
                pickCharacter(vowelList, vowelWeights),
                pickCharacter(endingCharacterList, endingWeights));
    }

    //picks a random String from the list weighed with the values from weights
    private String pickCharacter(String[] list, int[] weights) throws Exception {
        if (list.length == 0 || weights.length == 0 || list.length != weights.length) {
            throw new Exception("The lengths of the lists must be equal and greater than zero");
        }
        int sumOfWeights = 0;
        for (int i : weights) {
            //negative weights are considered zero
            if (i >= 0) {
                sumOfWeights += i;
            }
        }
        if (sumOfWeights == 0) { //if all weights are 0, a random string is returned
            return list[(list.length)];
        }

        int n = this.random.nextInt(sumOfWeights);

        for (int i = 0; i < list.length; i++) {
            if (weights[i] > n) {
                return list[i];
            }
            n -= weights[i];
        }
        throw new Exception("Non-matching weights and sum of weights"); //this should never happen
    }
}
