/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 * @author qwecu @ bitbucket.com/qwecu This version had been translated from C#
 * to Java
 * Some unneeded functionality has been removed
 */
public class NameGenerator {
    /// <summary>
    /// Creates a random name with three syllables.
    /// </summary>

    private String name;
    private static SyllableObjectBuilder sob;

    public NameGenerator() {
        sob = new SyllableObjectBuilder();
        try {
            randomNameString();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    //returns a random name in plain string format
    public void randomNameString() throws Exception {
        String a = ("" + randomSyllable() + randomSyllable() + randomSyllable());
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        name = a;
    }

    private static Syllable randomSyllable() throws Exception {
        return sob.randomSyllable();
    }

    @Override
    public String toString() {
        return name;
    }
}
