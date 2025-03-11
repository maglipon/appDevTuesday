
import java.util.Scanner;
public class Groupwork { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
       
        // Calling methods from Calculator.java

        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method
	System.out.println("The square of " + num1 + " is: " + Calculator.square(num1)); // Group 6's method
 
       System.out.println("Are numbers equal? " + Calculator.isEqual(num1, num2));  // Group 10's method

        System.out.println("Product  " + (num1 * num2));  // Group 3's method
        
        
        System.out.println("Quotient: " + Calculator.divide(num1, num2));  // Group 4 Method



// Calculator.java
public class Calculator {
   
    //Group 4: Division (Members: Balais, Tabon, Amar, Pajanustan, Garcia, Banaag, Ringor, Berte)
	public static int divide(int a, int b) {
		return a / b;
	}    
    public static boolean isEqual(int a, int b) {
        return a == b;

    }

    // Other groups will add their methods here
}
