package com.example.guessmynumber;

import java.util.Random;

public class Random_number {

    public int random_int;
    public int tries;
    Random rand;

    public Random_number(){
            rand = new Random();
            this.random_int = rand.nextInt(101);
            this.tries = 5;
    }

    public String setNewRandom(){
        this.random_int = rand.nextInt(101);
        this.tries = 5;
        return "Tries: " + this.tries;
    }

    public String makeGuess(int guess){
        if(guess == this.random_int){
            return "Congratulations, the number was " + this.random_int;
        }else{
            this.tries-=1;
            if(this.tries <= 0){
                return "You loose, the number was "+this.random_int+ ".Press restart to generate another number";
            }else{
                if(guess>this.random_int){
                    return "The number is smaller than "+ guess + ". Tries: " + this.tries;
                }else{
                    return "The number is bigger than "+ guess + ". Tries: " + this.tries;
                }
            }
        }
    }
}
