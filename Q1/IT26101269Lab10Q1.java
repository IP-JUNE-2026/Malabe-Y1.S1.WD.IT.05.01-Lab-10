import java.util.Scanner;
 public class IT26101269Lab10Q1{
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter the Mark(0-100):" );
 int mark = input.nextInt();
 
 
 if(0<= mark && mark<=100){
  System.out.print("Mark is Validated");
  }
  
  else{
  System.out.println("Invalid Marks");
  }
  
  }
 }