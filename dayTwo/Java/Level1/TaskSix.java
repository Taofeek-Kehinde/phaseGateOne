import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = userInput.nextDouble();
         System.out.print("Enter width: ");
         double width = userInput.nextDouble();
         double area = length * width;
        System.out.println("Area of rectangle: " + area);

}

}
