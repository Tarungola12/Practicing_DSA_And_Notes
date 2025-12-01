public class Arrays4 {
    public static void main(String[] args) {
        // linear seach in an array

        int[] arr = { 55, 10, 65, 9, 89, 34, 9, 852, 9, 3, 5, 89, 72, 69, 34, 88 };
        linearSeaarch(arr, 5);
        
    }

    static void linearSeaarch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Found at : " + i);
                return ;
            }
        }
        System.out.println("Element not found.");
    }
    
    // Nothing more in linear search the left or the topic is : 
    // improvement in linear search
    // 1> Transposition
    // 2> Move to front
    // 3> sentinel linear search 
    // 4> bidirectional linear search

    
}

