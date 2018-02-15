package Assignment;

public class Order {
	public static void main(String[] args) {
		int arr[]=new int[4];
		int i=0;
		int temp=0;
		int input= 5672;
		while(input>0 ) {
		int n=input%10;
		arr[i]=n;
		i++;
		input=input/10;
		}
		for(i=0;i<3;i++) {
			for(int j=i+1;j<4;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		for(i=0;i<4;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	}
