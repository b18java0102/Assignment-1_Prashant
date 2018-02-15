package Assignment;
import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		int i,rem;
		String temp="";
		System.out.println("Enter the num");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0) {
			rem=num%16;
			temp=rem+""+temp;
			num/=16;
			}
		System.out.println(temp);
	}

}


