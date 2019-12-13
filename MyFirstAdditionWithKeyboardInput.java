import java.util.*;

public class MyFirstAdditionWithKeyboardInput {
// Taking Input from the keyboard
	public static void main(String []args) {   // <- This is a Main Method
		int val1,val2,total;		
		Scanner scan = new Scanner(System.in);		
		
		System.out.print("Enter a Number: ");
		val1  = scan.nextInt();  // <- Assignment Operator
		System.out.print("Enter another Number: ");
		val2  = scan.nextInt();
		total = val1 + val2;
		
		System.out.println("The Sum is: "+total);
		
	}
}

// javac MyFirstAdditionWithKeyboardInput.java
// java MyFirstAdditionWithKeyboardInput