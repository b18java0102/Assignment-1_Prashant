package Strings;

public class StarPattern {
	public static void main(String[] args) {
		String s1="*****";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			System.out.println(ch);
			ch[i]=' ';
			}
	}

}
