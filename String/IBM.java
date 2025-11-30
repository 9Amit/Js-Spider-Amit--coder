package String;

import java.util.*;

public class IBM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array (m)");
        int m = sc.nextInt();

        System.out.println("Enter number of queries (q)");
        int q = sc.nextInt();

        System.out.println("Enter the permutation P of size " + m);
        ArrayList<Integer> P = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            P.add(sc.nextInt());
        }

        System.out.println("Enter " + q + " queries");
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int x = queries[i];

            int index = P.indexOf(x);  // find index
            result.add(index);         // store result

            P.remove(index);           // remove from that index
            P.add(0, x);               // move to front
        }

        System.out.println("Output:");
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
