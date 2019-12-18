public class WhileLoopProg1 {
    public static void main(String []args) {
        int n;

        System.out.println("We are going to enter the While loop..");
        n = 1; // <- Initialization
        while(n < 10) {  // <- Condition
            System.out.println(n);
            n = n + 1; // <- ReInitialization
        }
        System.out.println("We are out of While loop..");
    }
}
