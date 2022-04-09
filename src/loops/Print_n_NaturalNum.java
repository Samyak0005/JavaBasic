package loops;

import java.util.Scanner;

public class Print_n_NaturalNum {
    public static void main(String[] args) {
        System.out.println("print natural num");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);

        }
    }
}
