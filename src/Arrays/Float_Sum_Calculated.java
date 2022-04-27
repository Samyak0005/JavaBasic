package Arrays;

public class Float_Sum_Calculated {
    public static void main(String[] args) {
       float [] marks = {23.4f, 40.0f,45.6f,27.1f};
       float sum = 0f;

        for (float element:marks) {
            sum = sum + element;
        }
           System.out.println(sum);


    }
}
