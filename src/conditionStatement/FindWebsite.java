package conditionStatement;
import java.util.Scanner;
public class FindWebsite {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String web = Sc.next();
        if (web.endsWith(".com")){
            System.out.println("Commercial website ");
        }
else if (web.endsWith(".org")){
            System.out.println("organization website");
        }
else if (web.endsWith(".in")){
            System.out.println("indian website");
        }
else{
            System.out.println("default website");
        }

        }
    }
