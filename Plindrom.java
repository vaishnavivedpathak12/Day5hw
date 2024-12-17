package Day5hw;
import java.util.*;
public class Plindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,d,sum=0,temp;
		System.out.println("enter a no.");
		n=sc.nextInt();
		temp=sc.nextInt();
		while(n>0) {
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==0)
		{
			System.out.println("no.is palindrom");
		}
		else {
			System.out.println("no is not palindrom");
		}
	}

}
