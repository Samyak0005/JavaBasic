package collection.hash_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Demo_Class {

    public static void main(String[] args) {

        HashMap<Integer,String> CourseList = new HashMap<>();
        CourseList.put(1,"java");
      //  CourseList.put(2,"java");
        CourseList.put(3,"Phython");
        CourseList.put(4,"Php");
        CourseList.put(5,"C++");

        System.out.println("First course :"+CourseList.get(1));
        System.out.println("Second Course :"+CourseList.get(2));
        System.out.println("Third Course :"+CourseList.get(3));
        System.out.println("forth Course :"+CourseList.get(4));
        System.out.println("fifth Course :"+CourseList.get(5));

        for (Integer var: CourseList.keySet()){
            System.out.println(CourseList.get(var));
        }
        HashMap<Integer, String> EmployeeList = new HashMap<>();
        EmployeeList.put(1,"Samayak");
        EmployeeList.put(2,"Ritik");
        EmployeeList.put(3,"Shubham");
        // one more method printed the value but there is only String are printed
        for (int i = 0; i<=EmployeeList.keySet().size(); i++ ){
            System.out.println(EmployeeList.get(i));
        }
     }
}
