package String;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        int[] box = new int[50]; // digit sum max ~45

        for(int x = low; x <= high; x++){
            int s = digitSum(x);
            box[s]++;
        }

        int maxCoins = 0;
        for(int c : box){
            maxCoins = Math.max(maxCoins, c);
        }

        System.out.println(maxCoins);
    }

    static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

