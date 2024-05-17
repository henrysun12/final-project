package desktop;
import java.util.ArrayList;

import java.util.Scanner;

public class runner
{
    public static void main(String[] args)
    {
        //begins the game
        System.out.println("Would you like to bowl a frame? (1 = yes, 2 = no)");
        try (Scanner scan = new Scanner(System.in)) {
            int ans = scan.nextInt();


            
            //asks for ball info and rolls the ball, returning the result
            while(ans == 1)
            {
                
                System.out.println("To bowl a frame, enter the prompts asking for info about your roll");
                System.out.println("What side did you roll this ball (-1 = left, 0 = middle, 1 = right)");
                int side = scan.nextInt();
                System.out.println("What curve did you put on this ball (-1 = left, 0 = none, 1 = right)");
                int curve = scan.nextInt();
                System.out.println("What power did you put behind this ball (scale of 1 to 10 inclusive)");
                int power = scan.nextInt();

                roll a = new roll(side, curve, power);


                System.out.println(a.nextRoll(a));
                System.out.println("Would you like to bowl a frame? (1 = yes, 2 = no)");
                ans = scan.nextInt();
                
            }
            //thanks user if they decide to stop playing
            if(ans == 2)
                {
                    System.out.println("Thanks for playing, your final game score was: ");
                }
        }

        
    }
}