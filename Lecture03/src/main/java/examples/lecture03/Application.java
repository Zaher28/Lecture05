package examples.lecture03;

/*
Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2.
Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 */

import java.util.Scanner;


public class Application {
    /*
    We're taking input from a user
        Prompt user to enter number
        Store number
    Determine if number is odd or even
        Use remainder operator
            if number%2 is 0 then number is even
            else it is odd
    Print out the result
        Print even message if number is even
        Print odd message if number is odd
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number=0;
        System.out.println("Please enter an integer");
        number = input.nextInt(); //Taking input from user


        if (number % 2 == 0) {
            //print that the number is even
            System.out.printf("%d is even!", number);
        }else {
            //print that the number is odd
            System.out.printf("%d is odd!", number);
        }


    }
}
