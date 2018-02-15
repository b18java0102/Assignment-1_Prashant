package loopPatterns;

public class BinaryTriangle2 {
	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{ 
				
			int k=(j%2);
				System.out.print(!(k));
			}
			
			System.out.println();
		}
	}

}
