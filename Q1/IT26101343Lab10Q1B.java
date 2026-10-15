import java.util.Scanner;

	public class IT26101343Lab10Q1B {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in) ;
			char grade;
			
			System.out.println("Enter the marks (0-100) : ");
			int mark = sc.nextInt();

			assert (mark >= 0 && mark <= 100) : "Invalid marks" ;

			System.out.println("Mark is validated.");
		
			if(mark >= 75) {
				
				grade = 'A';
				assert (mark >= 75) : "Incorrect Grade Assigned" ;
				System.out.println("The Grade for the Entered Mark is: " + grade );
				
			}
			
			else if ( mark >= 60 && mark <= 74 ) {
			
				grade = 'B';
				assert ( mark >= 60 && mark <= 74 ) : "Incorrect Grade Assigned" ;
				System.out.println("The Grade for the Entered Mark is: " + grade );
			}
				
			else if ( mark >= 50 && mark <= 59 ) {
				
				grade = 'C';
				assert ( mark >= 50 && mark <= 59 ) : "Incorrect Grade Assigned" ;
				System.out.println("The Grade for the Entered Mark is: " + grade );
			}
			
			else if ( mark >= 40 && mark <= 49 ) {
				
				grade = 'D';
				assert ( mark >= 40 && mark <= 49 ) : "Incorrect Grade Assigned" ;
				System.out.println("The Grade for the Entered Mark is: " + grade );
			}
			
			else {
				
				grade = 'F';
				assert (mark < 40) : "Incorrect Grade Assigned" ;
				System.out.println("The Grade for the Entered Mark is: " + grade );
			}	

		}
	}