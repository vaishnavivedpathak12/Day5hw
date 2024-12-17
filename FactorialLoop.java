package Day5hw;
import java.util.*;
public class FactorialLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        long factorial = 1;  // Variable to store the factorial (long to handle large numbers)
	        
	        // Loop to calculate the factorial
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;  // Multiply the current value of factorial by i
	        }
	        
	        // Print the factorial of the number
	        System.out.println("Factorial of " + num + " is: " + factorial);
	}

}
