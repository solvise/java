package com.mycompany.javatest;

import java.util.Scanner;
import java.util.Random;

public class Javatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int target = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        
        while (guess != target) {
            System.out.println("Guess number beetween 1 and 100:");
            guess = scanner.nextInt();
            attempts = attempts +1;
            
            if (guess < target){
                System.out.println("Too low!");
                } else if (guess > target) {
                    System.out.println("Too high!");
                }
        }
       System.out.println("Correct. The number was " + target);
       System.out.println("It took " + attempts + "attempts to guess the number.");
    }
}