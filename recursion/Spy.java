package recursion;

public class Spy {
    public static void main(String[] args) {
        int prod=1;
        int sum=0;
        boolean asd=perfectnum(123,prod,sum);
        System.out.println(asd);

    }

    static boolean perfectnum(int n,int prod,int sum){
        if(n==0) return(prod==sum);
        int digit=n%10;
        return perfectnum(n/10,prod*digit,sum+digit);
    }
}
