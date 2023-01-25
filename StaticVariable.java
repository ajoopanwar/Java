class Mobile{
    String brand;
    static String type = "smart phone";

    public void show(){
        System.out.println(brand + " : " + type);
    }
}
public class StaticVariable{
    public static void main(String args[]){
        // Mobile.type = "smart phone";
        Mobile m1 = new Mobile();
        m1.brand = "apple";
        Mobile m2 = new Mobile();
        m2.brand = "One plus";

        m1.show();
        m2.show();

    }
}