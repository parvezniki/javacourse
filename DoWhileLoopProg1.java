public class DoWhileLoopProg1 {
    public static void main(String []args) {
        int n;

        System.out.println("We are going to enter the While loop..");
        n = 100; // <- Initialization
        while(n < 10) {  // <- Condition
            System.out.println(n);
            n = n + 1; // <- ReInitialization
        }
        System.out.println("We are out of While loop..");

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println("We are going to enter the DoWhile loop..");
        n = 100; // <- Initialization
        do {
            System.out.println(n);
            n = n + 1; // <- ReInitialization
        } while(n < 10); // <- Condition
        System.out.println("We are out of DoWhile loop..");
    }
}
