package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = findFactorial(number);

        System.out.println("practice.Factorial of " + number + " is: " + factorial);
    }

    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        } else {
            return n * findFactorial(n - 1); // Recursive call to find factorial
        }
    }
}

