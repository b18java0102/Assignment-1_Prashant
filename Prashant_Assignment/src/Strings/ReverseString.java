package Strings;

public class ReverseString {
	public static void main(String[] args) {
		String a1= "My Name is Prashant ";
		String a2= "";
		for(int i=a1.length()-1;i>=0;i--) {
			 a2= a2+ a1.charAt(i);
			
		}
		System.out.println(a2);
	}
	

}
