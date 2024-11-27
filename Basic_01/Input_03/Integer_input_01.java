package Basic_01.Input_03;

import java.util.Scanner;

public class Integer_input_01 {
    public static void main(String[] args){
        System.out.print("Enter any Number : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(i);

        }
        scn.close();
    }
}
