package Arrays;

public class Float_Sum_Calculated {
    public static void main(String[] args) {
       float [] marks = {23.4f, 40.0f,45.6f,27.1f,100.f};
       float sum = 0f;

       for (int i=0; i<marks.length; i++){
         sum = sum + marks[i] ;
           System.out.println("normal for loop");
       }
        for (float element:marks) {
            sum = sum + element;
            System.out.println("Advance for loop");
        }
           System.out.println(sum);


    }
}
