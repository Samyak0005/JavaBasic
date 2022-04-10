package loops;
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        for ( int i=1; i<=11; i++){
            System.out.println("printed two table "+(i*n));
        }

    }
}