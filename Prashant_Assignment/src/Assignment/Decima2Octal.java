package Assignment;

import java.util.Scanner;

public class Decima2Octal {
	public static void main(String[] args) {
		int i,rem;
		String temp="";
		System.out.println("Enter the num");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0) {
			rem=num%8;
			temp=rem+""+temp;
			num/=8;
			}
		System.out.println(temp);
	}

}
