package loopPatterns;

public class Pyramid {
public static void main(String[] args) {
	int i, j, k, num=10;
	for(i=1;i<=10;i++)
	{
		for(k=1;k<=num;k++)
		{
			System.out.print(" ");
		}
		num--;
		for(j=1;j<i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
