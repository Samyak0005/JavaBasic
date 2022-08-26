package conditionStatement;

import java.util.Scanner;

public class Odd_No {
    public static void main(String[] args) {
        System.out.println("Enter the Num ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }



    }
}
