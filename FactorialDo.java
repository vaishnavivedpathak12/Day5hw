package Day5hw;
import java.util.*;
public class FactorialDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a number to calculate its factorial: ");
	        int num = sc.nextInt();

	        
	        int factorial = 1;
	        int i = 1;

	       
	        do {
	            factorial *= i; 
	            i++;             
	        } while (i <= num);  
	      
	        System.out.println("The factorial of " + num + " is " + factorial);
	       
	}

}
