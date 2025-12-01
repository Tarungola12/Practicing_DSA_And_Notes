class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class linkedList1 {
    public static void main(String[] args) {
        // Why we need linkedlist 
        // What is limitation of array and arraylist
        // how we create linked list
        node head = new node(5);
        System.out.println(head.data);
    }    
}
