import java.util.Scanner;
public class Groupwork { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Product  " + (num1 * num2));  // Group 3's method
        

    }
}