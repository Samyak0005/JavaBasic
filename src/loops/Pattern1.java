package loops;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    int m = Sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println(  );
    }
}
}
