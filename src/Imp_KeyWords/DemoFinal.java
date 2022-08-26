package Imp_KeyWords;

public final class  DemoFinal {


   final public void CreateM1(){
        System.out.println("this is method m1 class");
    }
    public static void main(String[] args) {

        System.out.println("Before print");


       final String str1 = "Samyak";

        System.out.println("After printed");
    //     str1 = "ritik";// we can not change final variable

        System.out.println(str1);
    }
}
