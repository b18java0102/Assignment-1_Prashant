package Assignment;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a number to check whether it is Armstrongnumber or not!");
		Scanner s= new Scanner(System.in);
		int orig=s.nextInt();
		int num, rem, res=0;
		num=orig;
		while(orig!=0)
		{
			rem=orig%10;
			res+=Math.pow(rem,3);
			orig/=10;
			}
		if(res==num)
		{System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
}
}