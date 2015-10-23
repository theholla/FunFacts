package treehouse.funfacts.models;

import java.util.Random;

/**
 * Created by admin on 10/18/15.
 */
public class FactBook {
    //member variables
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses.",
            "Biketour is fun!",
            "Lots of people have cats as pets, but none are as cool as Elijah.",
            "Tea is tastier than coffee",
            "Halloween is soon",
            "Cocoa nibs can be roasted and brewed like coffee"
    };

    //abilities
    public String getFact() {

        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
