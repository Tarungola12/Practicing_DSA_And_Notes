public class Arrays1 {

    static int[] arr; // this will not gives error and whne we print so it gives null values

    public static void main(String[] args) {
        // Array 1st lecture

        // int [] arr;
        // System.out.println(arr); will gives error becoz it is not initialize.

        // int [] arr;
        // arr = new int[5];
        // arr= new int[]{1,2,3,4,6};

        // Coding Exercise

        // WAP to print largest element in an array

        // int[] arr = { 65, 8, 468, 4, 65, 67, 16, 9, 46, 4 };
        // int largest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (largest <= arr[i]) {
        // largest = arr[i];
        // }
        // }
        // System.out.println("Largest element in an array is : " + largest);

        // Q2 : Reverse the element in an array

        // Q3 : search for a specific element in an array
        // int[] arr = { 65, 8, 468, 4, 65, 67, 16, 9, 46, 4 };
        // int search=9;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i]== search){
        // System.out.println("Search element at index at :"+i);
        // }
        // }

        // Q4 : find the sum of all elements in an array
        // int[] arr = { 65, 8, 468, 4, 65, 67, 16, 9, 46, 4 };
        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("Sum is :"+sum);

        // enhanced for loop
        // int []arr={1,5,6,2,8,92,5};
        // for (int i : arr) {
        //         System.out.println(i);
        // }

        // student obj = new student();
        // obj.id=1;
        // obj.name="Tarun";
        // obj.display();
        
//         student [] obj = new student[5];
//         System.out.println(obj);     
//         obj[0] = new student();
//         obj[1] = new student();
//         obj[2] = new student();
//         obj[3] = new student();
//         obj[4] = new student();
//         obj[5] = new student();

    }

}

// class student{
//     int id;
//     String name;
//     void display(){
//         System.out.println("Name is : "+name+" id is: "+ id);
//     }
// }