import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

     Scanner userInput = new Scanner(System.in);
     System.out.print("Enter first number: ");
     double firstNumber = userInput.nextDouble();
     System.out.print("Enter second number: ");
     double secondNumber = userInput.nextDouble();
     System.out.println("Product: " + (firstNumber * secondNumber));
}

}
