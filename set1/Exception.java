package exception;
import java.util.Scanner;		 
		class Exception {
		  public static void main(String[] args) {
		 
		  int a, b, result;
		  Scanner sc=new Scanner(System.in);
		 
		    System.out.println("Input two integers");
		
		  a = sc.nextInt();
		  b = sc.nextInt();
		  result = a / b;
		 
		  System.out.println("Result = " + result);
		  }
		}	
