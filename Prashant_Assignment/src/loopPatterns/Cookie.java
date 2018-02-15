package loopPatterns;

public class Cookie {
	public static void main(String[] args) {
		
	
	int cookieSheets = 10;


	for (int i = 1; i <= cookieSheets; i++) {

	 System.out.println("Chips placed on sheet: " + i);

	 for(int j = 1; j <= 10; j++) {

	  System.out.println(" And on Cookie: " + j);
	 }
	} 
}
}