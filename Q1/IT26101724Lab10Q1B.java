import java.util.*;
public class IT26101724Lab10Q1B{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the mark(0 - 100): ");
		int marks = sc.nextInt();
		
		assert (marks>=0 && marks<=100):"Invalid Mark";
		
		System.out.println();
		System.out.println("Mark is Validated");
		
		char result = markRange(marks);
		
		 if (marks >= 75) 
		{
            assert result == 'A' : "Incorrect Grade Assigned";
        }
        else if (marks >= 60) 
		{
            assert result == 'B' : "Incorrect Grade Assigned";
        }
        else if (marks >= 50) 
		{
            assert result == 'C' : "Incorrect Grade Assigned";
        }
        else if (marks >= 40) 
		{
            assert result == 'D' : "Incorrect Grade Assigned";
        }
        else 
		{
            assert result == 'F' : "Incorrect Grade Assigned";
        }
        System.out.println("The Grade for the Entered Mark is: " + result);
    }

	public static char markRange(int mark1)
	{
			if(mark1>=75)
			{
				return 'A';
			}
			else if(mark1>=60)
			{
				return 'B';
			}
			else if(mark1>=50)
			{
				return 'C';
			}
			else if(mark1>=40)
			{
				return 'D';
			}
			else
			{
				return 'F';
			}
	
	}
}

		
