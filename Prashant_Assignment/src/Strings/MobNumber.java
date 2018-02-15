package Strings;

public class MobNumber {
	public static void main(String[] args) {
		String num="7006593003";
		
		for(int i=0;i<num.length()-1;i++) {
			int count=0;
			for(int j=0;j<num.length();j++) {
				if(num.charAt(i)==num.charAt(j)) {
					count++;
				}
			}
			System.out.println("Number of "+ num.charAt(i)+" are "+count);
		}
	}
}
