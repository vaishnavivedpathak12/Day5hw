package Day5hw;
import java.util.*;
public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int evenSum = 0;  
	        int oddSum = 0;  
	        int i = 1;      

	      
	        while (i <= 30) {
	            if (i % 2 == 0) {
	                evenSum += i; 
	            } else {
	                oddSum += i;  
	            }
	            i++; 
	        }
 
	        System.out.println("Sum of even numbers between 1 and 30: " + evenSum);
	        System.out.println("Sum of odd numbers between 1 and 30: " + oddSum);
	    }
	}


