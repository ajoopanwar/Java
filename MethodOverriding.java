class CalC{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
}
class AdvC extends CalC{
    public int add(int n1 , int n2){
        return n1 + n2 + 1;
    }
}
public class MethodOverriding{
    public static void main(String args[]){
        AdvC advC = new AdvC();
        System.out.println(advC.add(3,4));
    }
}