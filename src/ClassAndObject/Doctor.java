package ClassAndObject;
import java .util.Scanner;
public class Doctor {
    String id;
    String name;
    String position;
    int room;

    public Doctor(String id, String name, String position, int room) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.room = room;
    }


    public static void main(String[] args) {
        Doctor obj = new Doctor("d1","Samyak","Neurologist",234);
        System.out.println("DETAILS OF DOCTOR");
        System.out.println();

        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.position);
        System.out.println(obj.room);

    }
}