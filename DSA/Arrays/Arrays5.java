import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] arr = { 56, 8, 9, 1, 78, 18, 6, 94, 58, 2, 69, 41, 98, 54, 569, 974, 452 };

        int key = 54;
        search(arr, key);

    }

    // static void search(int[] arr, int key) {
    //     Arrays.sort(arr);
    //     for (int i : arr) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    //     int high = (arr.length - 1), low = 0, mid = 0;
    //     for (; low <= high ; ) {
    //         mid = (high + low) / 2;
    //         if (arr[mid] == key) {
    //             System.out.println("Element found at :" + mid);
    //             return ;
    //         } else if (key < arr[mid]) {
    //             high = mid - 1;
    //         } else if (key > arr[mid]) {
    //             low = mid + 1;
    //         }
    // }
    //     System.out.println("Element not found pls enter valid element.");
   


    // Now improvements in this binary searach is : what we can do if high is very
    // great number and low also than we can do modify in formula is :




    static void search(int[] arr, int key) {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int high = (arr.length - 1), low = 0, mid = 0;
        for (; low <= high;) {
            mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                System.out.println("Element found at :" + mid);
                return;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            }
        }
        System.out.println("Element not found pls enter valid element.");
}



}
