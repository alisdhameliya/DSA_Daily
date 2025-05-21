public class _q11_rotatedArrayTargetExist {
    public static int indexOfTargetInrotatedArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {

                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (arr[mid] <= target && target < arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int index = indexOfTargetInrotatedArray(arr, 1);
        System.out.println(index);
    }
}
