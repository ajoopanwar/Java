class Computer{
    public void playmusic(){
        System.out.println("Music Playing ...");
    }
    public String connectTo(String name){
        return "connecting to "+name;
    }
}
public class Methods{
    public static void main(String args[]){
        int num1 = 1;
        int num2 = 2;
        Computer c  = new Computer();

        c.playmusic();
        String contact = c.connectTo("Pooja");

        System.out.println(contact);

    }
}