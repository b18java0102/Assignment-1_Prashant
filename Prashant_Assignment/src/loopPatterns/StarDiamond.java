package loopPatterns;

public class StarDiamond {
	public static void main(String[] args) {
		int i,j,k,l,m,n;
		for(i=1;i<=3;i++)
		{
			for(k=3-i;k>=1;k--)
			{System.out.print(" ");
		}
			for(j=1;j<=2*i-1;j++)
			{System.out.print("*");
	}
			System.out.println();
	
		}
		for(l=2;l>=1;l--)
		{
			for(m=2;m>=l;m--)
			{System.out.print(" ");
		}
			for(n=1;n<=2*l-1;n++)
			{System.out.print("*");
	}
			System.out.println();
	
		}
}
}