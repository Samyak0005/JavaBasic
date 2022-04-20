package Methods;
import java.util.Scanner;
public class Calculator {

    public void additional() {
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("additional " + (a + b));
    }
        public void Substraction(){

            System.out.println("Enter the value of a");
            Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            System.out.println("Enter the value of b");
            int b = SC.nextInt();
            System.out.println("Substraction "+(a-b));
        }

        public void multiply(){

            System.out.println("Enter the value of a");
            Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            System.out.println("Enter the value of b");
            int b = SC.nextInt();
            System.out.println("multiply "+(a*b));
        }
        public void divide(){

            System.out.println("Enter the value of a");
            Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            System.out.println("Enter the value of b");
            int b = SC.nextInt();
            System.out.println("divide "+(a/b));
        }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        String select ="yes";
        while (select.equals("yes")){
            System.out.println("you have to choice tab 1 for add tab 2 for sub 3 for mul tab 4 for div");
            int choice = sc.nextInt();
            if(choice==1){
                obj.additional();
            }
             else if (choice==2){
                obj.Substraction();
            }
             else if (choice==3){
                 obj.multiply();
            }
             else if (choice == 4){
                 obj.divide();
            }
             Scanner loopscanner = new Scanner(System.in);
            System.out.println("you have to select printed or not");
            select = loopscanner.nextLine();
        }


    }
}
