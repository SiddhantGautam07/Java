package Condition_02;

public class Nested_if_else_02 {
    public static void main(String[] args){
        int num1 = 40;
        int num2 = 79;

        if (num1 == num2){
            System.out.println(num1 + " is Equal to "+ num2);
        }
        else if (num1 > num2){
            System.out.println(num1+" is Greater than "+ num2);
        }
        else {
                System.out.println(num1+ " is Smaller than "+num2);
        }
    }
}
