package collection;

import java.util.ArrayList;

public class ArrayList_Course {
    public static void main(String[] args) {
      ArrayList courselist = new ArrayList();

        courselist.add("java");
        courselist.add("spring booth");
        courselist.add("Aws");
        courselist.add("Cloud platform");
        courselist.add("Advance java");

        System.out.println(courselist.get(2));
        System.out.println(courselist.get(4));

 for(int i= 0; i<courselist.size(); i++){
     System.out.println("printed the all the subject in course : "+i+" index " +courselist.get(i));

 }
 courselist.remove(1);
        System.out.println("after remove index 1 "+courselist.get(1));
        // used advanced loop cencept
        System.out.println("printed for loop advances");
        for(Object var : courselist){
            System.out.println(var);
        }
    }
}

