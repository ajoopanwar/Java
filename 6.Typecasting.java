class Typecasting{
    public static void main(String args[]){
        byte b = 127;
        int a = b;

        System.out.println(b);
        System.out.println(a);

        a = 257;
        b=(byte)a;
        System.out.println(b);
        System.out.println(a);

        float f= 5.6f;
        int i = (int)f;
        System.out.println(i); //Type casting led to data loss here

        //Type Promotion

        byte b1 = 10;
        byte b2 = 30;

        int res = b1*b2;

        System.out.println(res);

    }
}