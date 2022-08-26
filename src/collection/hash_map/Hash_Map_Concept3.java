package collection.hash_map;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Map_Concept3 {

    public void CrateStudentList(){
        HashMap<Integer,ArrayList<Student>> Studentlist = new HashMap<>();
        ArrayList<Student> KPEC = new ArrayList<>();

        Student student1 = new Student(23,"ritik","A");
        Student student2 = new Student(8, "samyak","B");
        Student student3 = new Student(20,"raju","C");

        KPEC.add(student1);
        KPEC.add(student2);
        KPEC.add(student3);


                ArrayList<Student> HindustanStudent = new ArrayList<>();
        // if DECLARE same obj then not define class name
         student1 = new Student(12,"raj","A");
         student2 = new Student(7,"Rishi","B");
         student3 = new Student(9,"Rohan","C");

        HindustanStudent.add(student1);
        HindustanStudent.add(student2);
        HindustanStudent.add(student3);
        Studentlist.put(1,KPEC);
        Studentlist.put(2,HindustanStudent);
       // for (Integer var : Studentlist.keySet()){
         //   System.out.println(Studentlist.get(var));
       // }
        for (Student var: Studentlist.get(2)){
            System.out.println("Student name :"+var.getName()+"Student Section :"+var.getSection()+"Student Rollno :"+var.getRoll_no());
        }

for (Student var: Studentlist.get(1)){
         System.out.println("Student name :"+var.getName()+"Student Section :"+var.getSection()+"Student Rollno :"+var.getRoll_no());
        }

    }

    public static void main(String[] args) {
        Hash_Map_Concept3 obj = new Hash_Map_Concept3();
        obj.CrateStudentList();


    }
}
