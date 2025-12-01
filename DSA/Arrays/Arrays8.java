public class Arrays8{
    public static void main(String[] args) {
        
    }
}
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        // Binary Seaach leet code question
        int high = (nums.length - 1), low = 0, mid = 0, low2 = 0, high2 = (nums.length - 1), mid2 = 0;
        int arr2[] = { -1, -1 };
        if (nums.length == 0) {
            return arr2;
        }
        for (; low <= high;) {
            mid = low + ((high - low) / 2);

            if (target <= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            mid2 = low2 + ((high2 - low2) / 2);

            if (nums[mid2] <= target) {
                low2 = mid2 + 1;
            } else {
                high2 = mid2 - 1;
            }
            if (low != nums.length) {
                arr2[0] = low;
            }
            if (high2 != 0) {
                arr2[1] = high2;
            }

        }
        return arr2;
    }
}