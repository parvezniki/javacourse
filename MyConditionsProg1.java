import java.util.Scanner;
public class MyConditionsProg1 {
    public static void main(String []values) {
        // + , - , * , / , %  -> Arithematic operations
        // > , < , >= , <=, ==, !=

        // Given Person, Check the eligibility to Vote -> 18
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your Age: ");
        age = sc.nextInt();
// 15
        if( age >=  18) {
            System.out.println("You are Eligible.");
        } else {
             System.out.println("You are NOT Eligible");
        }


    }
}


//