import java.util.Scanner;
public class MyConditionsProg2 {
    public static void main(String []args) {
            // Calculating the Student details & Marks
            String studName,className;
            int english,hindi,maths; // For Storing Student Marks
            int total;
            float avg;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studName = sc.nextLine();

            System.out.print("Enter Student Class: ");
            className = sc.nextLine();

            System.out.print("Enter his/her marks in 3 subjects: ");
            english = sc.nextInt();
            hindi  = sc.nextInt();
            maths = sc.nextInt();

            total = english + hindi + maths;
            avg = total / 3;

            System.out.println("Total Marks are : "+total);
            System.out.println("Average Marks are : "+avg);
            // >= 35

            /*
                AND     &&
                OR      ||
                NOT     !
             */
            if( (english>=35)   &&  (hindi >= 35)  &&  (maths >= 35) ) {
                System.out.println("Result of "+studName + " : PASS");
            } else {
                System.out.println("Result of "+studName + " : FAIL");
            }

    }
}
