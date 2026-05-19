import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
         double celsius = userInput.nextDouble();
         double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C is " + fahrenheit + "F");

}
}
