package Assignment;

import java.util.Scanner;

public class CodingChallenge {
	public static void main(String[] args) {
		System.out.println("Enter the value of a, b and k");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			int k=s.nextInt();
			int Count=solution(a,b,k);
			System.out.println("No of numbers divisible by k between a and b are:"+Count);
			
		}
	static int count=0;
	static int solution(int a,int b,int k) {
		for(a=a;a<=b;a++) {
			if(a%k==0) {
				count=count+1;
			}
			
		}
		return count;
		
	}

}
