package Day5hw;
import java.util.*;
public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int number = 2; 
	        int sum = 0;    
	       
	        do {
	            sum += number; 
	            number += 2;   
	        } while (number <= 10); 

	       
	        System.out.println("The sum of even numbers from 1 to 10 is: " + sum);
	    }
	}


