public class Queue3 {
    public static void main(String[] args) {
        // IN this lecture we use space and implement cirucular queue for use space
        // efficeitly.
        circularQueue obj = new circularQueue(5);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(8);
        obj.display();
        System.out.println();
        System.out.println("your front element is : " + obj.front());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        obj.display();
    }
}

class circularQueue {
    private int[] queue;
    int capacity; // capacity is size here
    int rear, front; // rear and front rear is back pointer and front is front pointer

    // Creation of queue :
    circularQueue(int size) {
        front = -1;
        rear = -1;
        this.queue = new int[size];
        capacity = size;
        System.out.println("Your queue is created.");
        return;
    }

    // Enter element in the circular queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Your queue is full");
            return;
        }
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            this.queue[rear] = element;
            return;
        }
        rear = (rear + 1) % capacity;
        this.queue[rear] = element;
        return;

    }

    // Removing an element from circularQueue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Your queueu is empty");
            return -0;
        }
        if (front == rear) {
            int f = front;
            front = -1;
            rear = -1;
            return queue[f];
        }
        int removedElement = queue[front];
        front = (front + 1) % capacity;
        return removedElement;

    }

    private boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if ((rear + 1) % capacity == front) {
            return true;
        }
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Your queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i = (i + 1) % capacity) {
            System.out.print(queue[i] + " ");
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Your queue is empty.");
            return -0;
        }
        return queue[front];
    }
}


