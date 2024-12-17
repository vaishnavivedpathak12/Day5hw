package Day5hw;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int evenSum = 0;  
	        int oddSum = 0;  
	        
	      
	        for (int i = 1; i <= 30; i++) {
	            if (i % 2 == 0) {
	               
	                evenSum += i;
	            } else {
	               
	                oddSum += i;
	            }
	        }
	        
	       
	        System.out.println("Sum of even numbers between 1 and 30: " + evenSum);
	        System.out.println("Sum of odd numbers between 1 and 30: " + oddSum);
	    }
	}


