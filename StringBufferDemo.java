public class StringBufferDemo{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Pooja");

        sb.append(" Panwar");

        String s = sb.toString();
        System.out.println(sb);
        System.out.println(s);
    }
}