package conditionStatement;

public class BuyHouse {
    public static void main(String[] args) {
        String house = "4 BHK";
        int room = 4;
        int bathroom = 2;
        if (house.equals("4BHK") || room >= 4|| bathroom > 2) {
            System.out.println("buy");
        } else {
            System.out.println("not buy");
        }
    }
}
