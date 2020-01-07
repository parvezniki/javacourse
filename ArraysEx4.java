import java.util.Scanner;

/**
 * Two Dimentional Array
 */
public class ArraysEx4 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        int a[][] = new int[n][n];
        int r,c;
        System.out.println("Enter "+(n*n)+" number: ");
        for(r=0;r<n;r++) {
            for(c=0;c<n;c++) {
                a[r][c] = sc.nextInt();
            }
        }

        for(r=0;r<n;r++) {
            for(c=0;c<n;c++) {
               System.out.print(a[r][c]+", ");
            }
            System.out.println();
        }

        /*
        int x[] = {1,2,3,4,5};

        int y[] = x.clone();

        int z[] = x;
        */
    }
}
