package ConditionStatement;


import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator");
        System.out.println("Enter value");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        float a = Sc.nextFloat();
        System.out.println("Enter value of b");
        float b = Sc.nextFloat();
        System.out.println("you have to choice ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
//choice.equals() is object this is used only for string
if(choice=="ADD"|| choice.equals("ADD")){
    System.out.println("ADD  "+(a+b));
}
else if(choice=="SUB"|| choice.equals("SUB")){
    System.out.println("SUB  "+(a-b));
}
else if(choice=="MUL" || choice.equals("MUL")){
    System.out.println("MUL  "+(a*b));
}
else if(choice=="DIV" || choice.equals("DIV")){
    System.out.println("DIV  "+(a/b));
}
else {
    System.out.println("default value entered");
}
        }
   }
