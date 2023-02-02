class Calc{
    public static void show(){
        System.out.println("calc by Pooja");
    }
    public void add(){
        System.out.println(4+4);
    }
}
class Advcalc extends Calc{
    public void show(){
        System.out.println("calc by chor");
    }
}
public class Finalkeyword{
    public static void main(String args[]){
        Calc c = new Calc();
        c.show();
        c = new Advcalc();
        c.show();
    }
}