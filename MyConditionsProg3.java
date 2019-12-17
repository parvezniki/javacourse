import java.util.Scanner;

public class MyConditionsProg3 {
    public static void main(String []args) {
        // Calculating the Student details & Marks
        String studName,className,result;
        int english,hindi,maths; // For Storing Student Marks
        int total;
        float avg;

        result = "";

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

        System.out.println("Name  : "+studName);
        System.out.println("Class : "+className);
        System.out.println("Total Marks are : "+total);
        System.out.println("Average Marks are : " + avg + "%");
        // >= 35

            /*
                AND     &&
                OR      ||
                NOT     !

                avg
                > 60
                    1st Class
                > 50 && < 60
                    2dn Class
                > 35 && <50
                    3rd Class
             */
        if( (english>=35)   &&  (hindi >= 35)  &&  (maths >= 35) ) {
            System.out.println("Result of "+studName + " : PASS");

                    if( avg >= 60) {
                        result = "1st Class";
                    } else if(avg >= 50 && avg < 60) {
                                result = "2nd Class";
                            }
                            else if(avg>=35 && avg < 50) {
                                    result = "3rd Class";
                                 }
                 System.out.println("Result is : "+result);
        } else {
            System.out.println("Result of "+studName + " : FAIL");
        }

    }
}
