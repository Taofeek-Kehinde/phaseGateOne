import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        
        
        System.out.println("Enter a number between 1 and 100");
        
        while (numberOfAttempts < 5) {
            System.out.print("Guess Number: ");
            int guessNumber = userInput.nextInt();
            
            if (guessNumber < 1 || guessNumber > 100) {
                System.out.println("Between 1 and 100 only!");
                continue;
            }
            
            numberOfAttempts++;
            
            if (guessNumber == number) {
                System.out.println("YOU WIN!");
                break;
            } else if (guessNumber < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        
        System.out.println("Number was: " + number);
        System.out.println("Attempts: " + numberOfAttempts);
    }
}
