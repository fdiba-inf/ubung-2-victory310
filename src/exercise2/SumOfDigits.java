package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;
        int thirdDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("Sum of digits: " + sum);
    }

}
