package Assignment;

public class DiamondStar {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=i;j<2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=((2*i)+1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=2;l>0;l--) {
			for(int m=l-1;m<2;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=2*l-1;n++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}