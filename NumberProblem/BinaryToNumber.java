package NumberProblem;

public class BinaryToNumber {
    public static void main(String[] args) {
        int bin=1100;
        int res=0;
        int i=0;
        while(bin>0){
            res+=(bin%10)*Math.pow(2,i);
            bin/=10;
            i++;
        }
        System.out.println(res);
    }
}
