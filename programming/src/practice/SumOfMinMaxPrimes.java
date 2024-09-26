package practice;

import java.util.Scanner;

public class SumOfMinMaxPrimes {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) {  // Check divisibility up to half of the number
            if (num % i == 0) {
                return false;  // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;  // Otherwise, it's prime
    }

    // Function to find the sum of the smallest and largest prime numbers in a range
    public static int sum_Min_Max_PrimeInRange(int start, int end) {
        int minPrime = -1, maxPrime = -1;

        // Loop through the range to find primes
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                // Set the first found prime as minPrime
                if (minPrime == -1) {
                    minPrime = i; 
                }
                // Update maxPrime with every prime found
                System.out.println(i);
                maxPrime = i;              
            }
        }

        // Check if primes were found in the range
        if (minPrime == -1 || maxPrime == -1) {
            System.out.println("No prime numbers found in the given range.");
            return 0;  // No primes in the range
        }

        // Return the sum of minPrime and maxPrime
        return minPrime + maxPrime;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter lower number");
        int lower = sc.nextInt();
        System.out.println("Enter upper number");
        int upper = sc.nextInt();
        
        int sum = sum_Min_Max_PrimeInRange(lower,upper);
        if (sum != 0) {
        	
            System.out.println("The sum of the smallest and largest prime numbers between " + lower + " and " + upper + " is: " + sum);
        }
    }
}
