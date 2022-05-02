package model;

public class Employe {
     int id;
     String name;
     String Dept;

     // paramitarized Constructors

    public Employe(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        Dept = dept;
    }
     // getter and Setter are used

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
