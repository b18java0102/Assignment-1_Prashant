package Assignment;

import java.util.Scanner;

public  class Pallindrome {
	private static final String String = null;

	public static void main(String[] args) {
		myPallindrome call=new myPallindrome();
		boolean res= call.isPallindrome(String);
		System.out.println(res);
	}
}
	 class myPallindrome{
	 boolean isPallindrome(String input)
	{
		 System.out.println("Enter the string");
		Scanner s= new Scanner(System.in);
		input = s.next();
		for(int i=0;i<(input.length())/2;++i)
		{
			
			if(input.charAt(i)!=input.charAt(input.length()-i-1))
					{
				System.out.println("String is not pallindrome");
					return false;
					}

}
		System.out.println("String is pallindrome");
	return true;
}
}
