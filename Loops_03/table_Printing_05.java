package Loops_03;

import java.util.Scanner;

public class table_Printing_05 {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter The Number : ");
        int num = Integer.parseInt(scn.nextLine());
        System.out.print("Enter Your Name : ");
        String name = scn.nextLine();
        System.out.println("Dear "+name+" Your table is Here");
        int i = 1;
        while (i <= 10){
            System.out.print(i*num+ "\t");
             i++;
        }
        scn.close();

    }
}
