package Day5hw;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the base: ");
	        int base = sc.nextInt();
	        
	       
	        System.out.print("Enter the exponent: ");
	        int exponent = sc.nextInt();
	        
	       
	        long result = 1;  
	        for (int i = 1; i <= exponent; i++) {
	            result *= base;  
	        }
	        
	      
	        System.out.println(base + "^" + exponent + " = " + result);
	        
	}

}
