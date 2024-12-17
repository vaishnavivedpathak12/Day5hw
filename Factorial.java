package Day5hw;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        long factorial = 1;
		        int i = 1;
		        
		        int number = 0;
				while (i <= number) {
		            factorial *= i; // Multiply the factorial by the current number
		            i++; // Increment i
		        }
		        
		        // Print the result
		        System.out.println("The factorial of " + number + " is: " + factorial);
		        
		    }
		

	}


