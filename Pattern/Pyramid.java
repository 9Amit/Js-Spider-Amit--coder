package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int sp=n-i;sp>=1;sp--){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
