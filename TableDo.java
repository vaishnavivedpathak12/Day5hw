package Day5hw;
import java.util.*;
public class TableDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num multipication tble:");
		int num = sc.nextInt();
		System.out.println("enter a multiplication "+num+":");
		for (int i = 1; i<=10; i++){
			  System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
