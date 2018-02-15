package Strings;

import java.util.Scanner;

public class SearchWord1 {
	public static void main(String[] args) {
		String s1="City Chandigarh is Beautiful";
		System.out.println("Enter a word to search  ");
		Scanner s=new Scanner(System.in);
		String s2=s.nextLine();
	boolean flag=false;
		String s3[]=s1.split(" ");
		for(int i=0;i<s3.length;i++) {
			if(s2.equals(s3[i])) {
				flag=true;	
			System.out.println("found");
			}
			
			}
		if(flag==false) {
				System.out.println("not found");
		}
	}
}
