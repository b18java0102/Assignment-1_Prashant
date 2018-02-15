package Assignment;

import java.util.Scanner;

public class PrimeSeries {
public static void main(String[] args) {
	int i,j;
	System.out.println("Enter the no.upto which Prime nos.are required");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(i=1;i<=n;i++)
	{
		boolean flag=true;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
		{
		flag= false;
		break;
		}
		}
		if(flag==true)
		{
		System.out.print("\t"+i);
		}
		}
	}
	}


