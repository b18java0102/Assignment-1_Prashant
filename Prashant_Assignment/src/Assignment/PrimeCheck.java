package Assignment;

import java.util.Scanner;

public class PrimeCheck {
public static void main(String[] args) {
	int a,n;
	System.out.println("Enter the number to check whether it is prime or not !");
	Scanner s=new Scanner(System.in);
	n = s.nextInt();
	
	
		for(a=2;a<n;a++) 
			if (n%a==0)
			break;
		if(a==n) 
		{
			System.out.println("Number entered is a prime number");
			}
			else
			{
				System.out.println("Number entered is not a prime number");
			}
		}
	}	
		

	


