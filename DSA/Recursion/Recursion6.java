public class Recursion6 {
    public static void main(String[] args) {
        System.out.println("In this we apply binary search using recursion.");
        int[] arr = { 1, 5, 48, 56, 72, 84, 95, 101, 102, 534, 654, 789, 845 };
        int number = 102;
        binarySearchUsingRecursion(arr, number, 0, 12);

        // Nothing in this Lecture

    }

    public static void binarySearchUsingRecursion(int[] arr, int number, int low, int high) {
        if (low > high) {
            System.out.println("abay sahi number de.");
            return;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == number) {
            System.out.printf("Number find at %d ", mid + 1);
            return;
        } else if (number < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
        binarySearchUsingRecursion(arr, number, low, high);
    }

    // simple binarySearch()

    // public static void simpleBinarySearch(int[] arr, int number) {
    // int low = 0, high = arr.length - 1, mid = 0;
    // ;
    // for (; low <= high;) {
    // mid = low + (high-low)/2;// for safetry purpose so that number after addition
    // will not grow more than integer scope.
    // if (arr[mid] == number) {
    // System.out.printf("Number find at %d ",mid+1);
    // return;
    // } else if (number < arr[mid]) {
    // high = mid - 1;
    // } else {
    // low = mid + 1;
    // }
    // }
    // System.out.println("Abay bsdk dalle number sahi de madarchod. nhi mila tera
    // gandu number");
    // }
}
