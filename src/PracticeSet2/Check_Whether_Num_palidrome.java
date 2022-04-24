package PracticeSet2;

import java.util.Scanner;
// what is palidrome no?
// palidrome are no check RIGHT LEFT,LEFT RIGHT(REVERSE) are look like same 121,1001
public class Check_Whether_Num_palidrome {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = n;
        int r,s=0;
        while(n>0){
            r=n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (check==s){
            System.out.println("palidrome number");
        }
        else {
            System.out.println("this is not palidrome");
        }
    }
}
