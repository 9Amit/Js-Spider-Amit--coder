package recursion;
public class Number2Binary {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(num2bin(n));
    }


    static String num2bin(int n) {
        if (n == 0) {
            return "";
        }
        return num2bin(n / 2) + (n % 2);
    }
}

