package Methods;

public class Return_Type_Methods {
public String Aniket(){
    String mes = "Aniket";
    return mes;
}
 public  String Aniketkabday(){
    String bday ="21 may birthday";
    return bday;
 }

    public static void main(String[] args) {
    Return_Type_Methods obj = new Return_Type_Methods();
    String name = obj.Aniket();
        System.out.println(name);
    String birthday = obj.Aniketkabday();
        System.out.println(birthday);
    }

    }

