package SerchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 7, 6, 8, 45, 98 };
        System.out.println(linearSearch(arr, 45));
        System.out.println(linearSearch(arr, 90));
    }

    static int linearSearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}


