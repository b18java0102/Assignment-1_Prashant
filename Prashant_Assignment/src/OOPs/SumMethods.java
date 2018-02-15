package OOPs;

import java.util.Scanner;

public class SumMethods {
public static void main(String[] args) {
System.out.println("Enter the values of a and b");
Scanner s=new Scanner(System.in);
float a=s.nextFloat();
float b=s.nextFloat();
		sum(a,b);
		sum(a,b);
}
	 static void sum(int i,int j) {
	
		int c=i+j;
		System.out.println("The sum is :"+c);
	}
	  static void sum(float k,float l) {
		double c=k+l;
		System.out.println("The sum is :"+c);
	}
}
