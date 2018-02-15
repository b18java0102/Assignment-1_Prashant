package Assignment;

import java.util.Scanner;

public class Table {
	
	private static Scanner s;

	public static void main(String[] args) {
		
	int table;
		s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			table= n*i;
		System.out.println(table);
	}
}
	}
