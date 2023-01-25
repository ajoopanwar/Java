public class ImmutableString{
    public static void main(String args[]){
        String name = "Pooja";
        name = name + " Panwar";
        String s1 = "pooja";
        String s2 = "pooja";

        System.out.println(s1 == s2);
        System.out.println(name); 
    }
}