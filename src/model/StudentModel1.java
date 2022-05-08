package model;

import java.util.Objects;

public class StudentModel1 {
    // Properties
    int Roll_no;
    String name ;
    String Section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel1 that = (StudentModel1) o;
        return Roll_no == that.Roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Roll_no);
    }
    // constrators

    public StudentModel1(int roll_no, String name, String section) {
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
