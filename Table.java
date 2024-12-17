package Day5hw;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number to print multiplication table: ");
			int number =sc.nextInt();
	        System.out.println("Multiplication table of " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        
	}

}
