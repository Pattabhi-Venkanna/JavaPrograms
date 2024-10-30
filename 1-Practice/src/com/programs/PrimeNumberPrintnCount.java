package com.programs;

import java.util.Scanner;

public class PrimeNumberPrintnCount {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print prime numbers: ");
        n = sc.nextInt();
        System.out.println("Your number is " + n);
        
        int count = 0;
        
        // Print and count prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println(count + " prime numbers available");
    }

    // Optimized prime-checking function
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        
        return true;
    }
}
