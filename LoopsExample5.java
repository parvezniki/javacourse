public class LoopsExample5 {
    // Nested Loops
    public static void main(String []args) {
        int i, j;
        for(j=1;j<=5;j++) {               // <- This loops is meant to repeat the inner loops
            for (i = 1; i <= j; i++) {   // <- This loops is meant to print a line of starts may be 10
                System.out.print("* ");
            }
            System.out.println();
        }


        for(j=5;j>=1;j--) {               // <- This loops is meant to repeat the inner loops
            for (i = 1; i <= j; i++) {   // <- This loops is meant to print a line of starts may be 10
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
