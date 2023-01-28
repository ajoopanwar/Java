class Human{
    private int age;
    private String name;

    public Human(){
        age = 28;
        name = "Pooja";
    }
    public Human(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class ParameterizedConstructor{
    public static void main(String args[]){
        Human h = new Human();
        Human h1 = new Human(22,"Panwar");
    
        System.out.println(h.getName() + " : " + h.getAge());
        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}