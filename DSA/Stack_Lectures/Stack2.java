import java.util.Scanner;

public class Stack2 {

    public static void main(String[] args) {
        // Stack implementation using arrays
        // System.out.println("Enter stack size :");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int size = 5;
        StackArray obj = new StackArray(size);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.push(80);
        try{
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        }
        catch(Exception e){
            System.out.println();
        }

        obj.peek();
        obj.peek();


        // sc.close();
    }
}

class StackArray {
    int[] array;
    int top = -1;
    int size;
    int maxSize;

    StackArray(int size) {
        // System.out.println("Your stack is created of size of :" + size);
        maxSize = size;
        array = new int[size];
        return;
    }

    void push(int data) {
        if (isFull()){
            System.out.println("array size is increases now.");
            reSize();
        }
            // return;
        top++;
        array[top] = data;
        System.out.println("Your data is inserted.");
    }

    boolean isFull() {
        // if (top == array.length) {
            // System.out.println("Your stack is full.");
            // return true;
        // }
        // return false;   
 
        // we can also do above operation like :
        
        return top == array.length -1;
    }

        void peek() {
            if (isEmpty())
                return ;
            System.out.println(array[top]);
        }

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("Your stack is empty.");
            return true;
        }
        return false;
    }

    int pop()throws Exception{
        if(isEmpty()){

            throw new Exception("Your stack is empty");
        }
        top--;
        return array[top+1];
    }

    void reSize(){
        int [] newArray = new int[maxSize*2];
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[i];
        }

    }

}
