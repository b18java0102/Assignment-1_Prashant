package OOPs;

import java.util.Scanner;

public class Student {
	String name;
	String mob_no; 
	int autoid;
	static int id=1000;
	Scanner s=new Scanner(System.in);
	Student(){
		autoid=id++;
		System.out.println("Your auto generated id is: "+ autoid);
		System.out.println("Enter your name");
		name=s.next();
		System.out.println("Enter your mobile number");
		mob_no=s.next();
		
	}
	
	void display() {
		System.out.println("Your id is :"+autoid);
		System.out.println("Your name is :"+name);
		System.out.println("Your Mobile number is :"+mob_no);
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.display();
		s2.display();
		s3.display();
	}
	

}
