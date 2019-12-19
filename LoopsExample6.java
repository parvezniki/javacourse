import java.util.Scanner;

public class LoopsExample6 {
    // Nested Loops
    public static void main(String []args) {
        int i, j,s;
        int limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        limit = sc.nextInt();
        for(j=1,s=limit-1 ; j<=limit ; j++,s--) {               // <- This loops is meant to repeat the inner loops
            for(i = 1; i <= s; i++) {
                System.out.print("  ");
            }

            for (i = 1; i <= j; i++) {   // <- This loops is meant to print a line of starts may be 10
                System.out.print(j+"   ");
            }
            System.out.println();
        }

        for(j=limit,s=0 ; j>=1 ; j--,s++) {
            for(i = 1; i <= s; i++) {
                System.out.print("  ");
            }

            for (i = 1; i <= j; i++) {   // <- This loops is meant to print a line of starts may be 10
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }
}
