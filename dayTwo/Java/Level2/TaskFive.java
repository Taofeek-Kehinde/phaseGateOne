import java.util.Scanner;

public class TaskFive {

public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

System.out.print("Enter first number ");

int firstNumber = userInput.nextInt();

System.out.print("Enter second number ");

int secondNumber = userInput.nextInt();

System.out.print("Enter third number ");

int thirdNumber = userInput.nextInt();

if(firstNumber > secondNumber) {

System.out.println(firstNumber);
}else if (secondNumber > thirdNumber){
System.out.println(secondNumber);
}else if (thirdNumber > firstNumber){

System.out.println(thirdNumber);
}

}

}

