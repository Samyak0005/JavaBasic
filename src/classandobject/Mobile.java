package classandobject;

public class Mobile {
    String Company = "samsung";
    char series = 'A';
    String color = "white";
    byte Camera = 50;// megapixel
    int battery = 6000;//MAH
    float Display = 67.5f;//size
    int price = 13000;


    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        System.out.println(mobile1.Company);
        System.out.println(mobile1.series);
        System.out.println(mobile1.color);
        System.out.println(mobile1.Camera);
        System.out.println(mobile1.battery);
        System.out.println(mobile1.Display);
        System.out.println(mobile1.price);

        Mobile mobile2 = new Mobile();
        //changing data  for another mobile
        mobile2.color = "Black";
        System.out.println(mobile2.Company);
        System.out.println(mobile2.series);
        System.out.println(mobile2.color);
        System.out.println(mobile2.Camera);
        System.out.println(mobile2.battery);
        System.out.println(mobile2.Display);
        System.out.println(mobile2.price);
    }

}