class Mobile{
    String brand;
    static String type;

    static{
        type = "Smart Phone";
        System.out.println("In Static Block");
    }

    public static void show1(){
        System.out.println("in static method 1");
    }

    public static void show(Mobile m){
        System.out.println("in static method");
        System.out.println(m.brand + " : " + type);
    }
}

public class Staticmethod{
        public static void main(String args[]){
            Mobile m1 = new Mobile();
            m1.brand = "Apple";
            Mobile m2 = new Mobile();
            m1.brand = "Apple";
            Mobile.show(m1);
        }

}