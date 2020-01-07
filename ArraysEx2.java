import java.util.Scanner;

public class ArraysEx2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = new int[7];
        System.out.println("Enter "+a.length+" number: ");
        for(i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        // Printing from 1st to last
        System.out.println("Values Entered are : ");
        for(i=0;i<a.length;i++) {
            System.out.print(a[i] + ",");
        }
        // Printing from last to 1st
        System.out.println("\nValues Entered in revers order are : ");
        for(i=a.length-1;i>=0;i--) {
            System.out.print(a[i] + ",");
        }
    }
}
