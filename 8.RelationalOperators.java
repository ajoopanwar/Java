class RelationalOperators{
    public static void main(String args[]){
        int a = 5;
        int b = 7;

        boolean res = a < b;
        System.out.println(res);

        res = a == b;
        System.out.println(res);

        res = a <= b;
        System.out.println(res);
        
        //bitwise operators
        int x = 2;
        System.out.println(~(x));
        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(5 >> 1);
        System.out.println(5 << 1);
        System.out.println(5 >>> 1);
    }
}