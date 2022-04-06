package ConditionStatement;

import java.util.Scanner;
public class CheckVowels {
    public static void main(String[] args) {
        System.out.println("check vowels or not");
        Scanner Sc = new Scanner (System.in);
        char ch = Sc.nextLine().charAt(0);
        // this is used Or logical operator because this is giving true and false value
// this is not  used AND operator because this always giving all true value
// this condition are not used NOT because only type a condition true other than false

        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='O'||ch=='u') {
            System.out.println(ch + "  vowel");
        }

        else {
            System.out.println(ch +"  consonant");
        }
    }
}
