package loops;
import java.util.Scanner;
public class Sum_n_NaturalNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        int Sum =0;
        int i = 1;
        while (i<=n){
            Sum = Sum+i;
            i++;
        }
        System.out.println(Sum);
    }
}
