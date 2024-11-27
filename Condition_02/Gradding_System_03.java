package Condition_02;

public class Gradding_System_03 {
    public static void main(String[] args){
    int marks = 100;

    if (marks >= 90 && marks <= 100){
        System.out.println("Excellent");
    }
    else if (marks >= 80 && marks <=89){
        System.out.println("Good");
    }
    else if (marks >= 70 && marks <= 79){
        System.out.println("Fair");
    }
    else if (marks >= 60 && marks <= 69){
        System.out.println("Meet Exception");
    }
    else {
        System.out.println("Below Par");
    }
}
}