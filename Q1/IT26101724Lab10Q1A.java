import java.util.*;
public class IT26101724Lab10Q1A{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the mark(0 - 100): ");
		int marks = sc.nextInt();
		
		assert (marks>=0 && marks<=100):"Invalid Mark";
		
	    System.out.println();
	    System.out.println("Mark is Validated");
	}
}