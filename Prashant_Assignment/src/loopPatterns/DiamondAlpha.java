package loopPatterns;

public class DiamondAlpha {
	public static void main(String[] args) {
		int i,j,k,l,m,n,x,y;
		for(i=1;i<=3;i++)
		{x=97;
			for(k=3-i;k>=1;k--)
			{System.out.print(" ");
		}
			for(j=1;j<=2*i-1;j++)
			{System.out.print((char)x);
			x++;
	}
			System.out.println();
	
		}
		for(l=2;l>=1;l--)
		{
			y=97;
			for(m=2;m>=l;m--)
			{System.out.print(" ");
		}
			for(n=1;n<=2*l-1;n++)
			{System.out.print((char)y);
			y++;
			}
			System.out.println();
	
		}
}
}
