package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(a != 0) {
          double d = b * b - 4 * a * c;
          if (d >= 0) {
            double x1 = (-b + Math.sqrt(d)) / 2 * a; 
            double x2 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println(x1 + ", " + x2);
          } else {
            System.out.println("Imaginary values");
          }
        } else if (b != 0){
          double x = -c / b;
          System.out.println(x);
        } else if (c != 0){
          System.out.println("No values");
        } else {
          System.out.println("Many values");
        }
    }

}
