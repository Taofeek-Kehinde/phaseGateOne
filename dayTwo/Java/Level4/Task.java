public class Task {
    
   
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

  d
    public static String getEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

  
    public static int square(int number) {
        return number * number;
    }

  
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + addTwoNumbers(2, 5));
        System.out.println("Even/Odd: " + getEven(5));
        System.out.println("Square: " + square(4));
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(25));
        System.out.println("Largest: " + findLargest(10, 25, 15));
    }
}

