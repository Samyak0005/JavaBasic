package collection.arraylist;

import ClassAndObject.Employee;
import model.Employe;

import java.util.ArrayList;

public class Employee_Array_list {

    public ArrayList<Employe> createEmployeelist() {

        ArrayList<Employe> Employelist = new ArrayList<>();
        Employe Employe1 = new Employe(12, "rohit", "cs");
        Employe Employe2 = new Employe(45, "SAMYAK", "IT");

        Employelist.add(Employe1);
        Employelist.add(Employe2);

        for (int i=0; i<Employelist.size(); i++){
            System.out.println(Employelist.get(i));
        }
        return Employelist;
    }

    public static void main(String[] args) {
        Employee_Array_list obj = new Employee_Array_list();

        ArrayList<Employe> results = obj.createEmployeelist();
        System.out.println(results);
        System.out.println( results.size());

       for (int i=0; i<results.size(); i++){
          System.out.println("normal for loop  "+results.get(i).getDept()+ results.get(i).getName()+results.get(i).getId());
        }
// advance for loop
        for (Employe var : results){
            System.out.println("Advance for loop");
           System.out.println("Employee id :"+var.getId()+  "  Employee Name :"+var.getName()+" EmployeeDept :"+var.getDept());
      }
    }
}
