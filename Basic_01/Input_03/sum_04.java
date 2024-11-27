package Basic_01.Input_03;

import java.util.Scanner;

public class sum_04 {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter your first Number : ");
        int num1 = scn.nextInt();
        System.out.print("Enter Your Second Number : ");
        int num2 = scn.nextInt();
        int sum = num1 + num2;

        System.out.println(("Sum of "+num1+ " and "+num2+ " = "+sum));
        scn.close();

    }
}
