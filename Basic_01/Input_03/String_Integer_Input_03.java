package Basic_01.Input_03;

import java.util.Scanner;

public class String_Integer_Input_03 {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter any Number : ");
        int num = Integer.parseInt(scn.nextLine());
        System.out.print("Enter Your Name : ");
        String name = scn.nextLine();
        System.out.println("Dear "+name+" Your Counting is Heare ");
        scn.close();
        for (int i=1; i<= num; i++){
            System.out.print(i+"\t");
        }

    }
}
