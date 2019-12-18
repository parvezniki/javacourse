import java.util.Scanner;
// switch - case
public class SwitchCaseProg1 {
    public static void main(String []args) {
        int dayVal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 :");
        dayVal = sc.nextInt();
            switch(dayVal)
            {
                case 1: System.out.println("SUN"); break;
                case 2: System.out.println("MON"); break;
                case 3: System.out.println("TUE"); break;
                case 4: System.out.println("WED"); break;
                case 5: System.out.println("THU"); break;
                case 6: System.out.println("FRI"); break;
                case 7: System.out.println("SAT"); break;
                default: System.out.println("Invalid Input!!");
            }


    }
}
