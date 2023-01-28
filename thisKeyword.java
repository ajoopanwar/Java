class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}
class thisKeyword{
    public static void main(String args[]){
        Human h = new Human();

        h.setAge(28);
        h.setName("Pooja");
        
        System.out.println(h.getName() + " : " + h.getAge());
    }
}