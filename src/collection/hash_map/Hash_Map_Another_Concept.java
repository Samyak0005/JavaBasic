package collection.hash_map;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Map_Another_Concept {

    public static void main(String[] args) {


        HashMap<String, ArrayList<String>> Createstudentlist = new HashMap<>();
        ArrayList<String> studentlist1 = new ArrayList<>();
        studentlist1.add("Shubham");
        studentlist1.add("Samyak");
        studentlist1.add("Aniket");
        studentlist1.add("Nitin");
        studentlist1.add("Rohit");
        Createstudentlist.put("SECTION A",studentlist1);

        ArrayList<String> studentlist2 = new ArrayList<>();
        studentlist2.add("Anjali");
        studentlist2.add("Simran");
        studentlist2.add("Srashati");
        studentlist2.add("Tanu");

        Createstudentlist.put("SECTION B",studentlist2);
        System.out.println(Createstudentlist.get("SECTION A"));
        for (String student: Createstudentlist.keySet()){

            System.out.println(Createstudentlist.get(student));

        }
        //setter methor are used
       // for (String var: studentlist1){
         //   if (var.get)
        //}
        }


    }

