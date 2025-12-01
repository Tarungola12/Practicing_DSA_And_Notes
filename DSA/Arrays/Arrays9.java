public class Arrays9 {
    public static void main(String[] args) {
        // Binary and linear seach in 2d array and lower and upperbound in 2d array

        // Linear Search
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        binarySearch(arr, 7);

    }

    static void linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    i = i + 1;
                    j = j + 1;
                    System.out.println("Target found at :" + "[" + i + "]" + "[" + j + "]");
                    break;
                }
            }
        }
    }

    static void binarySearch(int[][] arr, int target) {
        int low = 0, high = 0,mid = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i][0]) <= target && target <= (arr[i][arr[i].length - 1])) {
                high = arr[i].length-1;
                System.out.println("value of high "+high);
                for (; low <= high;) {
                    mid=low+((high-low)/2);
                    if(target==arr[i][mid]){
                        System.out.println("Found at : "+ "[" + i + "]" + "[" + mid + "]");
                        break;
                    }
                    else if(target < arr[i][mid]){
                        high = mid - 1;
                    }
                    else if(target > arr[i][mid]){
                        low = mid + 1;
                    }
                }
            }
        }
    }


    
}
