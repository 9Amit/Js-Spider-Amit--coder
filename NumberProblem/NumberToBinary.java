package NumberProblem;

public class NumberToBinary {
    public static void main(String[] args) {
       int n=28;
        String res="";
        while(n>0){
            res=n%2+res;
            n/=2;
        }
        System.out.println(res);
    }
}
