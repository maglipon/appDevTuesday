
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
