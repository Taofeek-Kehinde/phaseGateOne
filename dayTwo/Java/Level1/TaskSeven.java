import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter length: ");
         double length = userInput.nextDouble();
         System.out.print("Enter width: ");
         double width = userInput.nextDouble();
         double perimeter = 2 * (length + width);
         System.out.println("Perimeter of rectangle: " + perimeter);

}

}
