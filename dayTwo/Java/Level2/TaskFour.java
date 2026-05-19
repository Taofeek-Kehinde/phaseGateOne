import java.util.Scanner;

public class TaskFour {

public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

System.out.print("Enter first number ");

int firstNumber = userInput.nextInt();

System.out.print("Enter second number ");

int secondNumber = userInput.nextInt();


if(firstNumber > secondNumber) {

System.out.println(firstNumber);

} else {

System.out.println(secondNumber);
}
}

}


