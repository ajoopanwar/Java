class TernaryOperator{
    public static void main(String args[]){
        int n = 4;

        int result = n%2==0?10:20;

        System.out.println(result);

        int a = 2;
        int b = 3;
        int c = 1;

        int res  = a>b?
                   (a>c?a:c):
                   (b>c?b:c);
        System.out.println(res);


    }
}