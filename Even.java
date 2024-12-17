package Day5hw;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 int sum=0;
	 int i=1;
	 while(i<=10) {
		 if (i % 2 == 0) {
             sum += i;
         }
         i++; 
     }
	 System.out.println("enter a sum of 1 to 10 is:"+sum);
	 }
}
