import java.util.*;

public class MyFirstProgramWithKeyboardInput {
// Taking Input from the keyboard
	public static void main(String []args) {   // <- This is a Main Method
		String name;		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Name you Entered is: "+name);		
	}
}


// javac MyFirstAdditionWithKeyboardInput.java
// java MyFirstAdditionWithKeyboardInput