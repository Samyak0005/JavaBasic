package method_static;

import java.util.Scanner;
// void return type are used
public class Add_2Num_Input_Para {
    public static  void calculatedSum(int a, int b){
      System.out.println("sum "+(a+b));
     //   return ;
   }
/*public  static int calculatedsum(int a, int b){
   int sum = a+b;//(return a+b);
    return sum ;
}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
      //  this is used calculatedsum(a,b); because there is uppar method sout("sum" +(a+b));
     calculatedSum(a,b);
    // System.out.println(calculatedSum(a,b));
    }
}
