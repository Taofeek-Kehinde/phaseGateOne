import java.util.Scanner;

public class TaskThree {

public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

System.out.print("Enter your score ");

int score = userInput.nextInt();

if(score >= 50){

System.out.println("Pass");

} else {

System.out.println("Fail");
}

}

}

