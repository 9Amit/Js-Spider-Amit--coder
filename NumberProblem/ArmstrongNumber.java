package NumberProblem;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int len=(num+"").length();
        int temp=num;
        int res=0;
        while(num>0){
            int lastDigit=num%10;
            res+=Math.pow(lastDigit,len);
            num/=10;
        }
        if(res==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not armstrong number");
        }
    }
}
