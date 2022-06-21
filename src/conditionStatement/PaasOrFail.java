package conditionStatement;
import java.util.Scanner;
public class PaasOrFail {
    public static void main(String[] args) {
        System.out.println("Student is pass or fail");
        Scanner Sc = new Scanner(System.in);
        System.out.println("physics");
        int physics = Sc.nextInt();
        System.out.println("chemistry");
        int chemistry = Sc.nextInt();
        System.out.println("maths");
        int maths = Sc.nextInt();
        float Avg = (physics+chemistry+maths)/3.0f;
        System.out.println("your overall percentage is  " +Avg);
        if(Avg>=40& physics>=33 & chemistry>=33 & maths>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail! try next time");
        }




    }
}
