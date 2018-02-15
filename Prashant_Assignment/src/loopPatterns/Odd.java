package loopPatterns;

public class Odd {
	public static void main(String[] args) {
		int a;
		for(a=0;a<=100;a++)
		{if (a%2==0)
			continue;
		else
			System.out.println(a);
		}
	}

}
