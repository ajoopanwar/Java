class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
        public void show(){
        System.out.println("In c");
    }
}
public class DynamicMethodDispatch{
    public static void main(String args[]){
        A a = new A();
        a.show();

        a = new B();
        a.show();
    }
}