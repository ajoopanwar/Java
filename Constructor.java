class Human{
    private int age;
    private String name;

    public Human(){
        age = 28;
        name = "Pooja";
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Constructor{
    public static void main(String args[]){
        Human h = new Human();
    
        System.out.println(h.getName() + " : " + h.getAge());
    }
}