//import java.sql.SQLOutput;
import java.util.Random;

import java.util.Scanner;



class numbergame{

    public static void main(String[] args) {
        method1();
    }
    public static void method1()
    {
        int ans, guess,chance=0;
        final int MAX = 100;
        int n=0;
        Scanner in = new Scanner(System.in);
        Random Naresh = new Random();
        boolean correct = false;
        ans = Naresh.nextInt(MAX) + 1;
        while (n<=5) {
            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt();
            n++;
            if (guess > ans) {
                System.out.println("your guess is high");
                chance++;
            }
            else if (guess < ans) {

                System.out.println("your guess is low");
                chance++;

            }
            else {
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }

        }
        if(chance==0)
            System.out.println("score:"+"100");
        if(chance==1)
            System.out.println("score:"+"75");
        if(chance==2)
            System.out.println("score:"+"55");
        if(chance==3)
            System.out.println("score:"+"35");
        if(chance==4)
            System.out.println("score:"+"25");
        if(chance==5)
            System.out.println("score:"+"5");
        else
            System.out.println("sorry your chance is over");
        System.out.println("would you like to continue:"+"yes or no");
        char k=in.next().charAt(0);
        if(k=='y')
        {
            method1();}
        else
            System.out.println("thanks for playing");
    }
}
