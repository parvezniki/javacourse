import java.util.Scanner;

/**
 * An Arrays Program to find and print the odd numbers
 */
public class ArraysEx3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = new int[10];
        System.out.println("Enter "+a.length+" number: ");
        for(i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Odd Numbers found in the Array are : ");
        for(i=0;i<a.length;i++) {
            if(a[i]%2 == 1) {
                System.out.println(a[i]);
            }
        }


    }
}
