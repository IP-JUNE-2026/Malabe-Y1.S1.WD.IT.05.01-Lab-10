import java.util.Scanner;

	public class IT26101343Lab10Q1A {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in) ;

			System.out.println("Enter the marks (0-100) : ");
			int mark = sc.nextInt();

			assert (mark >= 0 && mark <= 100) : "Invalid marks" ;

		System.out.println("Mark is validated.");

		}
	}