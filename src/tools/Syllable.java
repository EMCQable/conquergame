/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author qwecu @ bitbucket.com/qwecu This version had been translated from C#
 * to Java
 * Some unneeded functionality has been removed
 */
public class Syllable {

    private final String beginningConsonant;
    private final String vowel;
    private final String endingConsonant;

    public Syllable(String cons1, String vowel, String cons2) {
        beginningConsonant = cons1;
        this.vowel = vowel;
        endingConsonant = cons2;
    }

    @Override
    public String toString() {
        return (beginningConsonant + vowel + endingConsonant);
    }
}
