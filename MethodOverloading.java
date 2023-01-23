class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double add(double num1){
        return num1;
    }
}
public class MethodOverloading{
    public static void main(String args[]){
        Calculator c = new Calculator();

        System.out.println(c.add(5,4));
        System.out.println(c.add(5,4,7));
        System.out.println(c.add(5));
    }
}