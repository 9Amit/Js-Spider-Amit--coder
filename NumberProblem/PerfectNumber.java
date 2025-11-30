package NumberProblem;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=22;
        int sum=0;
        for(int i=n/2;i>=1;i--){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Spy  num");
        }
        else {
            System.out.println("Not spy ");
        }
    }
}
