package model;

public class Student {
    int Roll_no;
    String name ;
    String Section;

    // create constructors

    public Student(int roll_no, String name, String section) {
        Roll_no = roll_no;
        this.name = name;
        Section = section;
    }
    // getter and setter

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
