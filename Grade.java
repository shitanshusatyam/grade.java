package logic.java;

public class Grade {
	public static void main(String[]args) {
		
		int maths=90;
		int english=44;
		int science=36;
		String grade;
		
		double average=(maths+science+english)/3;
		
		if(average>=90 && average<=100) {
			grade="A+";
			System.out.println("EXCELLENT PERFORMANCE");
		}
		else if(average>=75 && average<=89) {
			grade="A";
			System.out.println("EXCELLENT PERFORMANCE");
		}
		else if(average>=60 && average<=74) {
			grade="B";
			System.out.println("KEEP IMPROVING");
			
		}
		else if(average>=40 && average<=59) {
			grade="C";
			System.out.println("KEEP IMPROVING");
		}
		else {
			grade="fail";
			System.out.println("PLEASE WORK HARDER NEXT TIME ");
		}
		
		System.out.println("AVERAGE MARKS :"+average);
		System.out.println("GRADE :"+ grade);
		
		if(maths<35 || english<35 || science<35) {
			System.out.println("FAILED DUE TO LOW SCORE IN AT LEAST ONE SUBJECT");
		}
		
		
	}

}
