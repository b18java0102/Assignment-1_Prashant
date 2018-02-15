package OOPs;
import java.util.Scanner;
public class EmployeeByConstructer {
	
	     int emp_id;
	     String emp_name;
	     String mob_no;
	     String emp_desg;
	     String emp_addr;
	     final static String Company="bebo";
	     Scanner s=new Scanner(System.in);
	     
	     EmployeeByConstructer()
	     {   
	     System.out.println("Enter id");
	     emp_id=s.nextInt();
	     System.out.println("Enter name");
	     emp_name=s.next();
	     System.out.println("Enter Mobile Number");
	     mob_no=s.next();
	     System.out.println("Enter Designation");
	     emp_desg=s.next();
	     System.out.println("Enter Address");
	     emp_addr=s.next();

	     }
	     
	     void display()
	     {
	        System.out.println(emp_id);
	        System.out.println(emp_name);
	        System.out.println(mob_no);
	        System.out.println(emp_desg);
	        System.out.println(emp_addr);
	        System.out.println(Company);
	     }
	     
	     
	     
	     public static void main(String[] args) {
	     
	    	 EmployeeByConstructer e1=new EmployeeByConstructer();
	    	 EmployeeByConstructer e2=new EmployeeByConstructer();
	    	 EmployeeByConstructer e3=new EmployeeByConstructer();
	    	 
	    e1.display();
	    e2.display();
	    e3.display();
	   
	    e1.employeeUpdate(e1);
	    e2.employeeUpdate(e2);
	    e3.employeeUpdate(e3);
	   
	   
	   
	     }
	     
	    void employeeUpdate( EmployeeByConstructer e)
	     {
	    	System.out.println("Enter the corresponding value of the required parameter for updation "
	    			+ "\n"
	    			+"Enter 1 for changing id"+"\n"
	    			+"Enter 2 for changing name"+"\n"
	    			+"Enter 3 for changing Mobile number"+"\n"
	    			+"Enter 4 for changing Designation"+"\n"
	    			+"Enter 5 for changing Address"+"\n");
	    	int i=s.nextInt();
	    	
	    	switch(i)
	    	{
	    		case 1:
	    			System.out.println("Enter new id");
	    		     emp_id=s.nextInt();
	    		     break;
	    		case 2:
	    		     System.out.println("Enter new name");
	    		     emp_name=s.next();
	    		     break;
	    		case 3:
	    		     System.out.println("Enter Mobile Number");
	    		     mob_no=s.next();
	    		     break;
	    		case 4:
	    		     System.out.println("Enter Designation");
	    		     emp_desg=s.next();
	    		     break;
	    		case 5:
	    		     System.out.println("Enter Address");
	    		     emp_addr=s.next();
	    		     break;
			default :i=0;
	    	}

}
}

