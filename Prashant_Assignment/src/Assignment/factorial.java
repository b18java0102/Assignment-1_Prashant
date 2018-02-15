package Assignment;
import java.util.Scanner;

	public class factorial {
		private static Scanner s;

		public static void main(String[] args) {
			int i,fact=1;
			s = new Scanner(System.in);
			System.out.println("Enter the number to find its factorial");
			int number= s.nextInt();
			
			for (i=1;i<=number;i++)
			{	
				fact= fact*i;}
			{
			System.out.println(fact);
		}
		
		}
}
