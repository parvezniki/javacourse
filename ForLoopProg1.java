public class ForLoopProg1 {
    public static void main(String []args) {
        int n;

        System.out.println("We are going to enter the While loop..");
        n = 1; // <- Initialization
        while(n < 10) {  // <- Condition
            System.out.println(n);
            n = n + 1; // <- ReInitialization
        }
        System.out.println("We are out of While loop..");

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println("We are going to enter the For loop..");
        // for(<init> ; <cond> ; <re-init>)

        for(n = 1 ; n < 10; n = n + 1) {  // <- for(Initialization , Condition , ReInitialization)
            System.out.println(n);
        }
        System.out.println("We are out of For loop..");
    }
}
