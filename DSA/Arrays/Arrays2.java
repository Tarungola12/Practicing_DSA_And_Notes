// public class Arrays2 {
//     // Traversal array
//     // Insert at begninng
//     // Insert at end
//     // Insert at specfic position

//     public static void main(String[] args) {
//         int arr[] = new int[6];
//         int size = 5;
//         arr[0] = 5;
//         arr[1] = 10;
//         arr[2] = 16;
//         arr[3] = 19;
//         arr[4] = 11;
//         // operationOnArrays.traverse(arr, size);

//         // int element=50;
//         // size=operationOnArrays.insertAtBeginning(arr,size,element);
//         // operationOnArrays.traverse(arr, size);
//         // operationOnArrays.traverse(arr, size);
//         // size = operationOnArrays.insertAtEnd(arr, size, 50);
//         // System.out.println();
//         // operationOnArrays.traverse(arr, size);
//         // size=operationOnArrays.insertAtSpecificPositon(arr, size,7,12);
//         // operationOnArrays.traverse(arr, size);

//         // deletion in an arrays

//         // size = deletionOperationOnArrays.deletionFromBegninning(arr, size);
//         // operationOnArrays.traverse(arr, size);
    
//         // size=deletionOperationOnArrays.deletionFromEnd(arr, size);
//         // operationOnArrays.traverse(arr, size);    
    
//         // size=deletionOperationOnArrays.deletionFromAtSpecficPosition(arr, size,3);
//         // operationOnArrays.traverse(arr, size);


        
//     }
// }

// class deletionOperationOnArrays {
//     static int deletionFromBegninning(int[] arr, int size) {
//         for (int i = 0; i < size; i++) {
//             arr[i] = arr[i + 1];
//         }
//         return size -= 1;
//     }

//     static int deletionFromEnd(int[] arr, int size) {
//         size -= 1;
//         arr[size]=0;
//         return size;
//     }

//     static int deletionFromAtSpecficPosition(int[] arr, int size,int position) {
//         for (int i = position; i < size; i++) {
//             arr[i] = arr[i + 1];
//         }
//         return size -= 1;
//     }

// }

// class operationOnArrays {
    
//     static void traverse(int arr[], int size) {
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     static int insertAtBeginning(int[] arr, int size, int element) {
//         for (int i = size; i > 0; i--) {
//             arr[i] = arr[i - 1];
//         }
//         arr[0] = element;
//         return size++;
//     }

//     static int insertAtEnd(int[] arr, int size, int element) {
//         try {
//             arr[size] = element;
//             return size++;
//         } catch (ArrayIndexOutOfBoundsException ae) {
//             System.out.println(ae.getMessage());
//         }
//         return 0;
//     }

//     static int insertAtSpecificPositon(int[] arr, int size, int position, int element) {
//         try {
//             for (int i = size; i < position; i++) {
//                 arr[i] = arr[i - 1];
//             }
//             arr[position] = element;
//             return size++;
//         } catch (ArrayIndexOutOfBoundsException ae) {
//             System.out.println(ae.getMessage());
//             return size;
//         }
//     }
// }
