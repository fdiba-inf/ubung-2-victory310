package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        double c = 2 * Math.PI * r;
        double a = Math.PI * r * r;

        System.out.println("Circumference" + c);
        System.out.println("Area" + a);
<<<<<<< HEAD
        input.close();
=======
>>>>>>> 42f3869c9f4b527627b8e723d7b4b98131181b27
        
    }

}
