package Day5hw;
import java.util.*;
public class TableLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		 int number = 5;  // Number for which we need the multiplication table
	        
	        // Loop through numbers from 1 to 10
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	}

}
