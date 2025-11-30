package NumberProblem;

import java.util.Scanner;

public class LCMusingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the seconf number");
        int n2=sc.nextInt();
        int result=findLCM(n1,n2);
        System.out.println(result);



    }
    static int findLCM(int n1,int n2){
        return(n1*n2)/findGCD(n1,n2);
    }
    static int findGCD(int n1,int n2){
        if(n2==0) return n1;
        return findGCD(n2,n1%n2);
    }
}
