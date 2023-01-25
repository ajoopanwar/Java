class Mobile{
    String brand;
    static String type;

    static{
        type = "Smart Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
        brand = "Apple";
        System.out.println("In Constructor Block");
    }

    public void show(){
        System.out.println(brand + " : " + type);
    }
}
public class StaticBlock{
    public static void main(String args[]) throws ClassNotFoundException{
        // Mobile m1 = new Mobile();

        Class.forName("Mobile");

    }
}