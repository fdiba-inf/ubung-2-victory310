package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day of week: ");
        int number = input.nextInt();

        if (number == 1) {
         System.out.println("Day of week: Monday");
        } else if (number == 2){
          System.out.println("Day of week: Tuesday");
        }else if (number == 3){
          System.out.println("Day of week: Wednesday");
        }else if (number == 4){
          System.out.println("Day of week: Thursday");
        }else if (number == 5){
          System.out.println("Day of week: Friday");
        }else if (number == 6){
          System.out.println("Day of week: Saturday");
        }else if (number == 7){
          System.out.println("Day of week: Sunday");
<<<<<<< HEAD
        }else {
          System.out.println("Invalid day");
        }
      input.close();
    }}
=======
        }else (number <= 0 || number >= 8)
          System.out.println("Day of week: Invalid day"); 
        }

    }
>>>>>>> 42f3869c9f4b527627b8e723d7b4b98131181b27
