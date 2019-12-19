import java.util.Scanner;

public class LoopsExample1 {
    public static void main(String []args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i=1;i<=10;i++) { // ++ increment operator -> i = i + 1 -> [i++] , ++i => += =>  [i+=2]
                               // "i = i + 1" ===> "i++" ===> "++i" ===> "i+=1"
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
