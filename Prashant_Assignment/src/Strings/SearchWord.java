package Strings;

import java.util.Scanner;

public class SearchWord {
	public static void main(String[] args) {
		String s1="City Chandigarh is Beautiful";
		System.out.println("Enter a word to search  ");
		Scanner s=new Scanner(System.in);
		String s2=s.nextLine();
			if(s1.contains(s2)) {
				System.out.println("found");
		}
			else
				System.out.println("not found");
	}

}
