/*
Name
Date
Program Description This program accepts user input and returns numbers based on their input or calculates an average
*/

import java.util.Random;
import java.util.Scanner;

public class AllTheLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //displays set of numbers based on user entered parameters
          //displayNumbers(scanner);
        //while loop During each loop iteration, the software should output a random number between 1 and 50.
        //Immediately after this number is displayed, the software should ask if the user wants another random number.
        // If so, another number is output (otherwise, the loop stops iterating).
        // Before the loop begins, ask the user for a seed for the random number generator.
        displayRandomNumbers(scanner);
        //calculates average of numbers entered by user
        //calculateAverage(scanner);
    }

    public static void displayNumbers(Scanner sc) {

        System.out.println("FOR LOOP");
        System.out.println("Please enter a starting point for your for loop:");
        int start = sc.nextInt();
        System.out.println("Please enter an ending point for your for loop:");
        int end = sc.nextInt();
        System.out.println("What value would you like the for loop to go up by?\n");
        int increment = sc.nextInt();

        for(int i = start; i < end; i+= increment ){
            System.out.println(i);
        }
    }

    public static void displayRandomNumbers(Scanner sc) {
        System.out.println("WHILE LOOP");
        System.out.println("Please enter a seed for the random number generator:\n");
        Random seed = new Random(sc.nextInt());
        System.out.println("Here's your random number: " + seed.nextInt(49) + 1);
    }

    public static void calculateAverage(Scanner sc) {
        double average;
        System.out.println("DO-WHILE LOOP");
        System.out.println("Enter a number (0 to stop and print average):");
        int input = sc.nextInt();
        //initialize nextInput for use in and out of do loop
        int nextInput;
        //keeps track of numbers user enters
        int dividend = 0;

        do {
            System.out.println("Enter a number (0 to stop and print average):");
            nextInput = sc.nextInt();
            //add new number to initial number and increase dividend
            input += nextInput;
            dividend++;

        }
        //test that the new number entered equals zero, calculate the average, and display to user
        while (nextInput != 0);
        average = (double) (input) / dividend;
        System.out.println("The average of your numbers is: " + average);
    }

}


/*
Where did you struggle with this coding work?
The logic of do-while loops were tricky

What was easy?
Compared to the do-while loop everything else was a walk in the park

What questions do you still have?
Creating Random numbers is still confusing
*/