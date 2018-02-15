package Assignment;

import java.util.Scanner;

public class CodingChallenge2 {
	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows or columns in D matrix");
		i = j= s.nextInt();
		int[][] arr= new int[i][j];
		System.out.println("Enter binary elements");
		
		for( i=0;i<arr.length;i++) {
		for( j=0;j<arr.length;j++) {
			arr[i][j]=s.nextInt();
			}}
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();}
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr.length;j++) {
				if(arr[0][j]==1) {
					count1=count1+1;
				};
				}}
		
			
			
		}
		
	}


