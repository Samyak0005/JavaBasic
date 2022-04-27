package PracticeSet2;
import java.util.Scanner;
public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0,n2 = 1,n3 = 0;
        System.out.print(" "+n1);

        for (int i = 0; i<n;i++){
            n3 = n2+n1;
           n2 = n1;
            n1 = n3;
            System.out.print(" "+n3);
        }
    }
}
