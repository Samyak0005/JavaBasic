package ClassAndObject;

import java.util.Scanner;

// use of constructor
public class Employee {
    Scanner sc = new Scanner(System.in);
    String id;
    String name;
    long salary;
    String Department;



    public Employee(String id, String name, long salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Department = department;
    }


    public static void main(String[] args) {

Employee obj =new Employee("e1","Ritik",80000l,"software testing");
Employee obj2 =new Employee("e2", "samyak",70000l, "bug finding");
Employee obj3 = new Employee("e3","aniket", 75000l,"check coding");

        System.out.println("first Employee Details");
        System.out.println("Name :"+obj.name);
        System.out.println("id :"+obj.id);
        System.out.println("Department :"+obj.Department);
        System.out.println("salary :"+obj.salary);
        System.out.println();

        System.out.println("Second Employee Details");
        System.out.println("Name :"+obj2.name);
        System.out.println("id :"+obj2.id);
        System.out.println("Department :"+obj2.Department);
        System.out.println("salary :"+obj2.salary);
        System.out.println();

        System.out.println("third Employee Details");
        System.out.println("Name :"+obj3.name);
        System.out.println("id :"+obj3.id);
        System.out.println("Department :"+obj3.Department);
        System.out.println("salary :"+obj3.salary);
        System.out.println();


    }
}