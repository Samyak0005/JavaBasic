package practiceset2;
// input number 153----->(1*1*1 + 5*5*5 + 3*3*3 = 153)
import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        System.out.println("Enter the value ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = n,s=0,num;
        while (n>0){
            num=n%10;
            s= (num*num*num)+s;
            n = n/10;
        }
        if(check==s){
            System.out.println("this is Armstrong number");
        } else{
            System.out.println(" this is not Armstrong number");
        }
    }
}
