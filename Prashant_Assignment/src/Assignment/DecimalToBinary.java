package Assignment;

import java.util.Scanner;

public class DecimalToBinary{
	public static void main(String[] args) {
		String x="";
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int num= s.nextInt();
		int rem=0;
		while(num!=0) {
			rem=num%2;
			x=rem+x;
			num/=2;
		}
		System.out.println(x);
	}
}
