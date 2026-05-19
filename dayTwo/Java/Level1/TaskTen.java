import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first_Number = userInput.nextDouble();
         System.out.print("Enter second number: ");
         double second_Number = userInput.nextDouble();
         System.out.print("Enter third number: ");
         double third_Number = userInput.nextDouble();
        double average = (first_Number + second_Number + third_Number) / 3;
         System.out.println("Average: " + average);
        
    }
}

