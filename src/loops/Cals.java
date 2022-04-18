package loops;

import java.util.Scanner;

public class Cals {
    public static void main(String[] args) {
        System.out.println("cals");

        int i = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value a");
            int a = sc.nextInt();
            System.out.println("enter the value b");
            int b = sc.nextInt();
            System.out.println("you have to choice print or not");
            Scanner sC = new Scanner(System.in);
            String choice = sC.nextLine();

            if (choice == "no" || choice.equals("no")) {
                System.out.println("nothing printed");
            } else if (choice == "yes" || choice.equals("yes")) {
                System.out.println("continue press yes");
            }
                Scanner SC = new Scanner(System.in);
                String str = SC.nextLine();
                while (str == "yes")
                    System.out.println(str);
                i++;
                System.out.println("you could select operator");
                Scanner Sc = new Scanner(System.in);
                String select = Sc.nextLine();
                if (select == "add" || select.equals("add")) {
                    System.out.println("add " + (a + b));
                } else if (select == "sub" || select.equals("sub")) {
                    System.out.println("sub " + (a - b));
                } else if (select == "mul" || select.equals("mul")) {
                    System.out.println("mul " + (a * b));
                } else if (select == "div" || select.equals("div")) {
                    System.out.println("div " + (a / b));
                }
            }while (true) ;

        }
    }

