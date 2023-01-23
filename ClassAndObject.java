class Calculator{
    public int add(int a,int b){
        return a+b;
    }
}
public class ClassAndObject{
    public static void main(String args[]){
        int num1 = 1;
        int num2 = 2;
        Calculator c  = new Calculator();
        int sum = c.add(num1,num2);
        System.out.println(sum);

    }
}