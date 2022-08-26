package strings;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic_Concept {
    //String are Immutable

    //Concatenation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  firstname = sc.nextLine();
        String Secondname = sc.nextLine();

        String Fullname = firstname + "" + Secondname;
        System.out.println(Fullname);


        //print length
        System.out.println(Fullname.length());

        //Access Characters of a String
        //CharAt()

        for (int i = 0; i<Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
        }
        // Compare Two Strings
        // s1>s2 is +ve value
        // s1=s2 is equals
        // s1<s2 is -ve value

        //if(firstname.equals(Secondname))

        if (firstname.compareTo(Secondname)==0){
            System.out.println("Strings are equals");
        }else{
            System.out.println("Strings are not equals");
        }

        // SubStrings
        System.out.println(Fullname.substring(0,4));
        System.out.println(Fullname.substring(0,Fullname.length()));


    }
}