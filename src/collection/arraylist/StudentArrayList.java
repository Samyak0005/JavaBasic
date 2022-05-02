package collection.arraylist;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public ArrayList<Student> createstudentlist(){

        ArrayList<Student> studentlist = new ArrayList<>();

        Student student1 = new Student(23,"ritik","A");
        Student student2 = new Student(8, "samyak","B");
        Student student3 = new Student(20,"raju","C");

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);

        return studentlist;
    }

    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();

        ArrayList<Student> result = obj.createstudentlist();
        for (Student var: result){
            System.out.println("Printing name  "+var.getName());
            System.out.println("Printing rollno  "+var.getRoll_no());
            System.out.println("printing Section "+var.getSection());
            System.out.println(var.getName() + " " +var.getRoll_no()+"  "+var.getSection());
        }
        // Setter method are used for value changes

        for(Student var: result){
            if (var.getName().equals("ritik")){
                var.setName("Satyam");
            }
          if(var.getRoll_no()==8){
              var.setRoll_no(9);
          }
            var.setSection("it");
          var.setName("shyam");
            System.out.println(var.getName()+var.getRoll_no()+var.getSection());
        }



    }
}
