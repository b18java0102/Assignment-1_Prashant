package arrays;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		System.out.println("Enter the no. of rows or Columns");
		Scanner s=new Scanner(System.in);
		int i= s.nextInt();
	int j;
	j=i;
		int[][]arr= new int[i][j];
		System.out.println("Enter elements in the array ");
		for(i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++)
			
		{System.out.print(arr[j][i]+"\t");}
			System.out.println();
	}
}
}