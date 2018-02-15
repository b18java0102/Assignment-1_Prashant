package Strings;

public class NumberTriangle {
	public static void main(String[] args) {
		String s1="12345";
		
		for(int i=0;i<s1.length();i++) 
		{
			System.out.println(s1);
			
			s1=s1.replace(s1.charAt(i),' ');
		}
	}
}



