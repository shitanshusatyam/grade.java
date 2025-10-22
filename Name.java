package logic.java;
import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.println(i+ " ");
		}
	}

}
