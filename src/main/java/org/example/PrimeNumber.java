package org.example;

public class PrimeNumber {

    // This method is used to display whether the result is prime or not
    public static void prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

}

