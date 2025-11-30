package Pattern;


public class LCM {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        int lcm = (num1 > num2) ? num1 : num2;

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
            lcm++;
        }

        System.out.println(lcm);
    }
}
