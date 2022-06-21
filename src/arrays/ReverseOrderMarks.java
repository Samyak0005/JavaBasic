package arrays;

public class ReverseOrderMarks {
    public static void main(String[] args) {
        int [] marks = {33,40,68,79,50,31,44};
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
