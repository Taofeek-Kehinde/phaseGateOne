import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args) {

        System.out.print("Enter a number ");
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        for(int index = 1; index <= 12; index++)

    System.out.println(number + " x " +  index + " = " + (number * index));

}

}
