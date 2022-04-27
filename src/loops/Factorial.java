package loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
       int f =1;
       // for (int i=5; i>=num; i--)
          for(int i=1; i<=num;i++){

            f = f*i;

        }
      System.out.println("factorial of is :"+f);

    }
}