package Arrays;
import java.util.Scanner;

public class Output_Scanner {
    
	
	 
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student name :");
		String str=sc.nextLine();
		
		System.out.println("enter student marks of english :");
		int a =sc.nextInt();
		
		System.out.println("enter student marks of maths");
		float b=sc.nextFloat();
		
		System.out.println("enter students marks of java :");
		float c= sc.nextFloat();
		
		System.out.println("the sum of marks is :");
		 double d=0;
		 
		 d=b+c+a;
		 System.out.println(d);
		 
		 
		
		
		
		
		
		
	}
}
