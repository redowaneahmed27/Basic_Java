package practice;

public class SumDivisibleBy5 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0) {
                sum += i;
            }
    }
                    System.out.println("Sum of numbers divisible by 5 from 1 to 100: "+ sum);
}
}


