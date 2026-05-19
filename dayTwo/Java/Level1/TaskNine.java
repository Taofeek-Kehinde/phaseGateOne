import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

         System.out.print("Enter item price: ");
         double price = userInput.nextDouble();
         double newPrice = price * 1.10;
         System.out.print(newPrice);

} 

    }
