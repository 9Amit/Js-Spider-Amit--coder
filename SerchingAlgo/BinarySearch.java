package SerchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 9, 12, 14, 45, 68, 87 };
        System.out.println(binarySearch(arr, 68));
        System.out.println(binarySearch(arr, 65));

    }

    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
