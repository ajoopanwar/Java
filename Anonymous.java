class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In Show");
    }
}
public class Anonymous{
    public static void main(String args[]){
        new A().show();
    }
}