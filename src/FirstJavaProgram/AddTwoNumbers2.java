package FirstJavaProgram;

import java.util.Scanner;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        int num1 , num2 , sum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1 = scan.nextInt();

        System.out.println("Enter Second Number");
        num2 = scan.nextInt();

        scan.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers:"+sum);

    }
}
