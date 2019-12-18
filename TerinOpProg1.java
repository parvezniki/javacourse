import java.util.Scanner;

public class TerinOpProg1 {
    public static void main(String []args) {
       // (CONDITION) ? <True Action> : <False Action>
        /*
        28 / 2 = Reminder is 0 -> Even Number
        28 / 2 = Reminder is 1 -> Odd Number
         */
        Scanner sc = new Scanner(System.in);
        int val;
        String result = "";
        System.out.print("Enter a number: ");
        val = sc.nextInt();
        // +, -, *, 13/2=6, 13%2=1
        System.out.println("Below Out put is from IF Condition:");
        if ((val % 2) == 0) {
            System.out.println(val+ " is Even Number");
        } else {
            System.out.println(val+ " is Odd Number");
        }
        System.out.println("Below Out put is from Ternary Condition:");
        result = ((val % 2) == 0)?" is Even Number":" is Odd Number";
        System.out.println(val + result);
    }
}
