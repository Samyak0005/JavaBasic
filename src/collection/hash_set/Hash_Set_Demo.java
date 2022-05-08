package collection.hash_set;

import java.util.HashSet;
import java.util.List;

public class Hash_Set_Demo {

    // collectionname <Datatype> Varname/objname = new collectionname<>();


    public HashSet<String> CreateCourseList() {

        HashSet<String> CouseList = new HashSet<>();
        CouseList.add("java");
        CouseList.add("python");
        CouseList.add("C++");
        CouseList.add("Spring Booth");
        CouseList.add("Cloud");
        CouseList.add("java");
        CouseList.add("python");
        System.out.println(CouseList.size());

        return CouseList;
    }
     public HashSet<Double> CreateMarksList(){
        HashSet<Double> MarksList = new HashSet<>();
        MarksList.add(12.1);
         System.out.println("fail");
        MarksList.add(12.1);
        MarksList.add(33.4);
        MarksList.add(89.6);

         System.out.println(MarksList.size());
         MarksList.remove(1);
         return MarksList;
     }



    public static void main(String[] args) {
        Hash_Set_Demo obj = new Hash_Set_Demo();
        HashSet<String> result = obj.CreateCourseList();
        for (String var : result) {
            System.out.println("printed courselist" + var);
        }
      HashSet<Double>  results = obj.CreateMarksList();
        for(Double Element: results){
            System.out.println("printing MarksList"+Element);
        }

    }
}