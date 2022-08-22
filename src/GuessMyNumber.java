import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 0;
        int max = 10;
        int ranNum = random.nextInt((max - min) + 1) + min;
        System.out.println(ranNum);


        int guess = 0;
        System.out.println("Enter a Number \n");
        boolean done = false;
        while(!done)
        {
            int playerGuess = sc.nextInt();
            guess++;

            if(playerGuess < ranNum)
            {
                System.out.println("Higher");
            }
            else if(playerGuess > ranNum)
            {
                System.out.println("Lower");
            }
            else
            {
                System.out.println("Correct Guess");
                done = true;
            }
        }


    }

}