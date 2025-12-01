// Queue implementation and ond pointer and two pointer implementation

import java.util.Arrays;

public class Queue2 {
    public static void main(String[] args) {
        // Starting of queue data structure :

        // 1> Implementation queue using arrays :
        // 1.1> Implementation of queue using only one pointer in an array :
        // now we have only onel pointer which is : rear
        // QueueUsingOnePointer obj = new QueueUsingOnePointer(5);
        // obj.enqueue(4);
        // obj.enqueue(6);
        // obj.enqueue(8);
        // System.out.println("Printing of queue");
        // obj.printingOFQueue();
        // System.out.println();
        // System.out.println("Front element is : ");
        // obj.front();
        // System.out.println("Fornt element removed : "+obj.dequeue());
        // System.out.println("Now Front element is : ");
        // obj.front();
        // System.out.println("Printing of queue");
        // obj.printingOFQueue();

        // ============================================================================================================================

        // 2> Two pointer work in queue

        twoPointerOfArray obj = new twoPointerOfArray(5);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(7);
        obj.enqueue(7);
        obj.display();


    }
}

class QueueUsingOnePointer {
    private int[] queue;
    int rear;
    int capacity;

    // Creating of queue using array and single pointe...
    QueueUsingOnePointer(int size) {
        this.capacity = size;
        this.queue = new int[size]; // Creating of queue
        rear = -1;
        System.out.println("Queue is create of size of :" + size);
    }

    // Enter element in queue
    public void enqueue(int element) {
        // check is queue full.
        if (isFull()) {
            System.out.println("Your queue is full.");
            return;
        }

        rear++;
        this.queue[rear] = element;
    }

    // CHechking that our queue is full or not
    public boolean isFull() {
        if (this.queue.length - 1 == rear) {
            return true;
        }
        return false;
    }

    // Printing of queue
    public void printingOFQueue() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    // deletion of elelment
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("You queueu is empty.");
            return Integer.MIN_VALUE;
        }

        // First element remove karne becoz FIFO principle.
        int data = queue[0];
        for (int i = 0; i <= rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return data;

    }

    // checking that our queueu is Full or not
    public boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    // Peek or checking front element
    public void front() {
        if (isEmpty()) {
            System.out.println("Queue is empty can't peek.");
            return;
        }
        System.out.println(queue[0]);
    }
}

class twoPointerOfArray {
    private int[] queue;
    int capacity; // capacity is size here
    int rear, front; // rear and front rear is back pointer and front is front pointer

    // Creation of queue :
    twoPointerOfArray(int size) {
        front = -1;
        rear = -1;
        this.queue = new int[size];
        capacity = size;
        System.out.println("Your queue is created.");
        return;
    }

    // Enter element into queue :
    public void enqueue(int elelment) {
        if (isFull()) {
            System.out.println("Your queue is full. Can't insert this element");
            return;
        }
        rear++;
        this.queue[rear] = elelment;
        if (front == -1) {
            front++;
        }
    }

    // Check is queue full or not
    public boolean isFull() {
        if (rear == this.queue.length - 1) {
            return true;
        }
        return false;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Your queue is empty.");
            return -0;
        }
        int removedElement = this.queue[front];
        front++;
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return removedElement;
    }

    // Checking that our queue is empty or not
    public boolean isEmpty() {
        if ((front == -1 && rear == -1) || front > rear) {
            return true;
        }
        return false;
    }

    // peek of front element
    public int front() {
        if (isEmpty()) {
            System.out.println("Not element present in queue");
            return -0;
        }
        return this.queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Your queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

    }

}


