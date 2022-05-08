package collection.hash_set;

import model.Student;

import java.util.ArrayList;
import java.util.HashSet;

public class Student_Hash_Set {

    public HashSet<Student> Cratestudentlist() {
        HashSet<Student> studentlist = new HashSet<>();
        // object created by paramitrized Constructor class of student in model package

        Student student1 = new Student(23,"ritik","A");
        Student student4 = new Student(23,"ritik","A");
        Student student2 = new Student(8, "samyak","B");
        Student student3 = new Student(20,"raju","C");

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        return studentlist;
    }

    public static void main(String[] args) {
        Student_Hash_Set obj = new Student_Hash_Set();
        HashSet<Student> studentlist = obj.Cratestudentlist();
        for (Student Element: studentlist){
            System.out.println("printed advance for loop"+Element.getName()+Element.getRoll_no()+Element.getSection());
        }
    }
}
