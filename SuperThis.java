class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In parameterized A");
    }
}
class B extends A{
    public B(){
        this(5);
        System.out.println("In B");
    }
    public B(int n){
        super(5);
        System.out.println("In parameterized B");
    }
}
public class SuperThis{
    public static void main(String args[]){
        B b = new B();
    }
}