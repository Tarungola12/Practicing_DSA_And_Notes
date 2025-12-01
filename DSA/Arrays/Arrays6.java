import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = { 56, 8, 6, 6, 6, 6, 9, 1, 6, 78, 18, 6, 94, 58, 2, 6, 6, 6, 6, 6, 6, 69, 41, 98, 54, 569, 974,
                452 };

        int key = 6;
        search(arr, key);

    }

    static void search(int[] arr, int key) {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int high = (arr.length - 1), low = 0, mid = 0;

        for (; low <=  high;) {
            mid = low + ((high - low) / 2);
            if (key <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("First occurence of your number " + low);
        return;
    }

}
