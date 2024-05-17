package desktop;

import java.lang.Math;

public class roll
{
    int pinsKnocked;
    private int curve;
    private int side;
    private int power;
    
    public roll()
    {
        this.curve = 0;
        this.side = 0;
        this.power = 5;
        
    }

    public roll(int c, int s, int p){

        this.curve = c;
        this.side = s;
        this.power = p;
        this.pinsKnocked = 0;

    }

    public String nextRoll(roll a)
    {

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

        
        return "You knocked down " + a.pinsKnocked + " pins.";

    }

    public String toString(roll a)
    {
        return "Pins Knocked: " + a.pinsKnocked;
    }

 


}