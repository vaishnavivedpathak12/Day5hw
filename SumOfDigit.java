package Day5hw;
import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        int sum = 0;  
	        
	       
	        while (num != 0) {
	            int digit = num % 10;  
	            sum += digit;          
	            num /= 10;           
	        }
	        
	       
	        System.out.println("Sum of digits: " + sum);
	        
	}

}
