package Basic_01.Input_03;

import java.util.Scanner;

public class String_input_02 {
    public static void main(String[] args){
        System.out.print("Enter Your Name : ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        scn.close();
        System.out.println("Hello "+name);
    }
}
