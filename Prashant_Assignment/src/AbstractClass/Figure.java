package AbstractClass;

import java.util.Scanner;

public class Figure {
		public static void main(String[] args) {
			Rectangle r= new Rectangle();
			r.findArea();
			r.findPerimeter();
			
			Circle c=new Circle();
			c.findArea();
			c.findPerimeter();

		
		}
}

	abstract class Figure1{
		abstract void findArea();
		abstract void findPerimeter();
	
		double dim1;
		
	}
	
	class Rectangle extends Figure1{
		Rectangle(){
			System.out.println("Enter dimension");
			Scanner s= new Scanner(System.in);
			dim1=s.nextDouble();
		}
		
		void findArea()
		{
			System.out.println("Area is:"+dim1*dim1);
		}
		void findPerimeter()
		{
			System.out.println("Perimeter is:"+4*dim1);
		}
		
	}
	class Circle extends Figure1{
		Circle(){
			System.out.println("Enter radius of the circle");
			Scanner s= new Scanner(System.in);
			dim1=s.nextDouble();
		}
		
		void findArea()
		{
			System.out.println("Area is:"+(22/7)*dim1*dim1);
		}
		void findPerimeter()
		{
			System.out.println("Perimeter is:"+2*(22/7)*dim1);
		}
		
	}
