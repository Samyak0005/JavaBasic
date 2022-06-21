package methods;

import java.util.Scanner;

public class Cals_Return_Input_Para {
    public int ADD(int a , int b){
        System.out.println("Sum ");
        return a+b;
    }
    public int SUB(int a , int b){
        System.out.println("Sub ");
        return a-b;
    }
    public int MUL(int a , int b) {
        System.out.println("mul ");
        return a * b;
    }
    public int DIV(int a , int b) {
        System.out.println("div ");
        return a / b;
    }
    public static void main(String[] args) {
        do {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value a ");
            int a = sc.nextInt();
            System.out.println("Enter the value b ");
            int b = sc.nextInt();
            Cals_Return_Input_Para obj = new Cals_Return_Input_Para();
            System.out.println("you have to choice print or not\n press yes if print else no");
            Scanner SC = new Scanner(System.in);
            String choice = SC.nextLine();
            if (choice == "yes" || choice.equals("yes")) {
                System.out.println("selected operator");

                Scanner Sc = new Scanner(System.in);
                String Operator = Sc.nextLine();
                if (Operator == "add"|| Operator.equals("add")) {
                    System.out.println(obj.ADD(a, b));
                } else if (Operator == "sub"|| Operator.equals("sub")) {
                    System.out.println(obj.DIV(a, b));
                } else if (Operator == "mul"|| Operator.equals("mul")) {
                    System.out.println(obj.MUL(a, b));
                } else if (Operator == "div"|| Operator.equals("div")) {
                    System.out.println(obj.DIV(a, b));
                }


            } else if (choice == "no" || choice.equals("no")) {
                System.out.println("nothing printed");
                break;
            }

        } while (true);
    }
    }

