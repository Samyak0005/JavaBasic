package conditionStatement;

public class DellLapBuy {
    public static void main(String[] args) {
        String laptop = "Dell";
        int Ram = 8;
        int Hd = 512;
        // & AND operator are used for when all conditions are true
        if(laptop=="Dell"& Ram>4& Hd>128){
            System.out.println("this is perfect laptop for me");
        }
        else{
            System.out.println("this is not good for me");
        }
    }
}
