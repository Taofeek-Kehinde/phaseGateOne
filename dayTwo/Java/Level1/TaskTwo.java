import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    
 System.out.print("Enter your age: ");
 int age = userInput.nextInt();
 System.out.println("In five years, you will be " + (age + 5) + " years old.");
}

}
