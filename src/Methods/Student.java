package Methods;
import java.util.Scanner;


//void method used
public class Student {
    public void readMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
    public void playMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
    public void eatMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
    public void sleepMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("please enter student activity");
        Student obj = new  Student();
        obj.readMethod();
        obj.playMethod();
        obj.eatMethod();
        obj.sleepMethod();
    }


}
