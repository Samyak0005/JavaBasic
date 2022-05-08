package ConditionStatement;

import java.util.Scanner;

public class Year_Months {
    public static void main(String[] args) {
        System.out.println("select num 1 to 12");
        Scanner sc = new Scanner(System.in);
        int select_num = sc.nextInt();
        if(select_num==1){
            System.out.println("january");
        }
        else if(select_num==2){
            System.out.println("february");
        }
        else if(select_num==3){
            System.out.println("march");
        }
        else if(select_num==4){
            System.out.println("April");
        }
        else if(select_num==5){
            System.out.println("may");
        }
        else if(select_num==6){
            System.out.println("june");
        }
        else if(select_num==7){
            System.out.println("july");
        }
        else if(select_num==8){
            System.out.println("August");
        }
        else if(select_num==9){
            System.out.println("september");
        }
        else if(select_num==10){
            System.out.println("october");
        }
        else if(select_num==11){
            System.out.println("november");
        }
        else if(select_num==12){
            System.out.println("December");
        }
        else{
            System.out.println("default");
        }




    }
}
