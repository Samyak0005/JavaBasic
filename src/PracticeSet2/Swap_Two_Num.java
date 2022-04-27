package PracticeSet2;

public class Swap_Two_Num {
    public static void main(String[] args) {
       // System.out.println("swapping two number using three variables");
        System.out.println("swapping two number using two variables");
        /*   int a = 8;
        int b = 19;
        int c;
        c=b;
        b=a;
        a=c; */
        int a = 2;
        int b = 6;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
