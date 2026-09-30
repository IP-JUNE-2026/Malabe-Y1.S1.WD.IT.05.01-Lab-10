import java.util.Scanner;

public class IT26102178Lab10Q1 {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the mark (0-100): ");
		int mark = sc.nextInt();
		
		boolean validMark = mark >= 0 && mark <= 100 ;
		
		assert validMark : "Invalid Mark" ;
		
		System.out.println("\nMark is Validated");
		
		char grade;
		
		if (mark >= 75 ) {
		    grade = 'A' ;
			assert grade == 'A' : "Incorrect Grade Assigned" ;
			
	    }else if (mark >= 60 ) {
		    grade = 'B' ;
			assert grade == 'B' : "Incorrect Grade Assigned" ;
		
		}else if (mark >= 50 ) {
		    grade = 'C' ;
			assert grade == 'C' : "Incorrect Grade Assigned" ;
			
		}else if (mark >= 40 ) {
		    grade = 'D' ;
			assert grade == 'D' : "Incorrect Grade Assigned" ;
			
		}else {
		    grade = 'F' ;
			assert grade == 'F' : "Incorrect Grade Assigned" ;
		}
		
		boolean validGrade =
		    (mark >= 75 && grade == 'A' ) ||
			(mark >= 60 && mark < 75 && grade == 'B') ||
			(mark >= 50 && mark < 60 && grade == 'C') ||
			(mark >= 40 && mark < 50 && grade == 'D') ||
			(mark < 40 && grade == 'F'); 
			
		
		assert validGrade : "Incorrect Grade Assigned";

		System.out.println("The Grade for the Entered Mark is: " + grade);
		
		sc.close();
	}
}	