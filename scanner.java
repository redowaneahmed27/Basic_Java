package practice;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a number");
            int number1 =  scanner.nextInt();
            System.out.println("Input another number");
            int number2 =  scanner.nextInt();

            int sum =number1 + number2;
            System.out.println("The result is " +sum);
            scanner.close();
        }

        catch (Exception ea){
            System.out.println("You have entered a wrong data ");
        }
    }
}
