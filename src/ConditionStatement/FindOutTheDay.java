package ConditionStatement;
import java.util.Scanner;
public class FindOutTheDay {
    public static void main(String[] args) {
        System.out.println("find out the days");
        Scanner Sc = new Scanner(System.in);
        int days = Sc.nextInt();
        switch(days){
            case 1: System.out.println("monday");
                break;
            case 2: System.out.println("tuesday");
                break;
            case 3: System.out.println("wednesday");
                break;
            case 4: System.out.println("thursday");
                break;
            case 5: System.out.println("friday");
                break;
            case 6: System.out.println("saturday");
                break;
            case 7: System.out.println("sunday");
                break;
            default:
                System.out.println("nothing");

        }


    }
}
