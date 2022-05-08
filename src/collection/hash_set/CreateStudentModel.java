package collection.hash_set;

import model.Student;
import model.StudentModel1;

import java.util.HashSet;

public class CreateStudentModel {
    public HashSet<StudentModel1> createstudentlist() {

        HashSet<StudentModel1> studentlist = new HashSet<>();
        StudentModel1  student1= new StudentModel1 (23,"ritik","A");
        StudentModel1  student2 = new StudentModel1 (8, "samyak","B");
        StudentModel1  student3 = new StudentModel1 (20,"raju","C");
        StudentModel1  student4 = new StudentModel1 (20,"raju","C");

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        System.out.println(studentlist.size());
        return studentlist;

    }

    public static void main(String[] args) {
        CreateStudentModel obj = new CreateStudentModel();
        HashSet<StudentModel1> result = obj.createstudentlist();
      //  System.out.println(studentlist.size());

        for (StudentModel1 var: result){

            System.out.println("Printing name  "+var.getName());
            System.out.println("Printing rollno  "+var.getRoll_no());
            System.out.println("printing Section "+var.getSection());
            System.out.println(var.getName() + " " +var.getRoll_no()+"  "+var.getSection());
        }
    }


}
