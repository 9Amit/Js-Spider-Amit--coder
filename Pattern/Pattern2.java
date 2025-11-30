package Pattern;
import java.util.Scanner;

public class Pattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eter the num");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int sp=n-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
