package desktop;

import java.lang.Math;

public class roll
{
    //local variables for each roll
    int pinsKnocked;
    private int curve;
    private int side;
    private int power;
    private int[] game = new int[10];
    int c = 0;
    
    //default constructor for a roll
    public roll()
    {
        this.curve = 0;
        this.side = 0;
        this.power = 5;
        
    }

    //paramters constructor for a roll

    public roll(int c, int s, int p){

        this.curve = c;
        this.side = s;
        this.power = p;
        this.pinsKnocked = 0;

    }

    //method that rolls a ball

    public String nextRoll(roll a)
    {
        //different amt of pins knocked down for each scenario

        if(a.curve == 0 && a.side == 0 && a.power == 5)
        {
            a.pinsKnocked = 6;
        }

        if(a.curve == -1 && a.power > 5)   
        {
            if(a.side == -1)
                a.pinsKnocked = 0;
            if(a.side == 0)
                a.pinsKnocked = 5;
            if(a.side == 1 && a.power > 8)
                a.pinsKnocked = 10;
            if(a.side == 1 && a.power <= 8)
                a.pinsKnocked = 9;
            
            
        }

        if(a.curve == 0)   
        {
            if(a.side == -1)
                a.pinsKnocked = 4;
            if(a.side == 0)
                a.pinsKnocked = 8;
            if(a.side == 0 && a.power > 8)
                a.pinsKnocked = 10;
            if(a.side == 1)
                a.pinsKnocked = 5;
            
        }

        if(a.curve == 1)   
        {
            if(a.side == -1 && a.power > 8)
                a.pinsKnocked = 10;
            if(a.side == -1 && a.power <= 8)
                a.pinsKnocked = 8;
            if(a.side == 0)
                a.pinsKnocked = 6;
            if(a.side == 0 && a.power > 8)
                a.pinsKnocked = 8;
            if(a.side == 1 && a.power > 5)
                a.pinsKnocked = 3;
            if(a.side == 1 && a.power < 5)
                a.pinsKnocked = 0;
            
        }
        game[c] += a.pinsKnocked;
        c++;
        

        //returns number of pins knocked
        return "You knocked down " + a.pinsKnocked + " pins.\n" + "Total score so far: " + game;

    }

    //prints the outcome of a roll
    public String toString(roll a)
    {
        return "Pins Knocked: " + a.pinsKnocked;
    }

 


}