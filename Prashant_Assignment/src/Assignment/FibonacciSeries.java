package Assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		int i,j,t1,t2,nextTerm;
		t1=0;
		t2=1;
		
		j=10;
		
		for(i=1;i<=j;i++)
		{
			System.out.println(t1);
			nextTerm=t1+t2;
			t1=t2;
			t2=nextTerm;
		}
	}
}
