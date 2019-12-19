import java.util.Scanner;

public class LoopsExample4 {
    public static void main(String args[]) {
        // Program to print Odd numbers ranging from 1 to give number
        // 1,3,5,7,.......n
        int i,val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        val = sc.nextInt();
        for(i=1;i<=val;i+=2) {
            System.out.print(i+",");
        }
    }
}
