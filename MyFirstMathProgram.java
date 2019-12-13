public class MyFirstMathProgram {
	public static void main(String []args) {   // <- This is a Main Method
		// ((b*b) - (4*a*c)) / (2*a)
		int a,b,c;
		float result;
		a = 10;
		b = 30;
		c = 5;		
		result  = ((b*b) - (4*a*c)) / (2*a);
		System.out.println("The Result is "+result);
	}
}


// javac MyFirstMathProgram.java
// java MyFirstMathProgram