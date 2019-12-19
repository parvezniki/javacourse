import java.util.Scanner;

public class LoopsExample3 {
    public static void main(String []args) {
        int i,n,limit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        limit = sc.nextInt();
        n = 1;
        for (i = 1; i <= limit; i++) {
            n = n * i;
        }
        System.out.println(limit + "! = "+n);
    }
}
