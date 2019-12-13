import java.util.*;
public class MyFirstMathProgram3 {
	public static void main(String []args) {   // <- This is a Main Method
		// ((b*b) - (4*a*c)) / (2*a)
		int a,b,c;
		float result;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 3 integer number :");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		result  = ((b*b) - (4*a*c)) / (2*a);
		System.out.println("The Result is "+result);
	}
}


// javac MyFirstMathProgram3.java
// java MyFirstMathProgram3