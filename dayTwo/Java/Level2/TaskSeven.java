import java.util.Scanner;

public class TaskOne {

public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

System.out.print("Enter a password ");

String password = userInput.nextLine();

if(password == "admin123"){

System.out.println("match");

}else {
System.out.println("not match");

}

}

}
