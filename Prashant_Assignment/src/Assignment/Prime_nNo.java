package Assignment;

import java.util.Scanner;

public class Prime_nNo {
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);

	    int N = scan.nextInt();
	    int x = 2;
	    System.out.print("1 ");

	    for(int i = 1; i <= N; i++)
	    {
	        int count = 0;

	        for(int j = 1; j <= x; j++)
	            if(x%j == 0)
	                count++;

	        if(count == 2)
	            System.out.print(x + " ");

	        x++;
	    }
	}
}
