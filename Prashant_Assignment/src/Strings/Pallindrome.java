package Strings;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+ s1.charAt(i);
			}
		if(s1.equals(rev)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
		}
		}
		
		
	}

