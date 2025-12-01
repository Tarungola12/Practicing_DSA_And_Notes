public class Queue4 {
    public static void main(String[] args) {
        // Queue using linkedList
        queueUsingLinkedList obj = new queueUsingLinkedList();
        obj.enqueue(5);
        obj.enqueue(7);
        obj.enqueue(8);
        obj.enqueue(9);
        obj.enqueue(10);
        obj.printQueue();
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

    }
}

class queueUsingLinkedList {
    private Node front = null, rear = null;
    private int size;

    // Initialisng the queue using constructor : 
    public queueUsingLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = -1;
    }

    // Enter element into linkedListQueue :
    public void enqueue(int data) {
        if (this.front == null && this.rear == null) {
            Node newNode = new Node(data);
            this.front = newNode;
            this.rear = newNode;
            this.size++;
            return;
        }
        Node newNode = new Node(data);
        rear.next = newNode;
        this.rear = newNode;
        this.size++;
        return;
    }

    // Removing element in linkedLIstQueue :
    public int dequeue() {
        if (iSEmpty()) {
            System.out.println("Your list is empty.");
            return Integer.MIN_VALUE;
        }
        // jo front node hai pehele hum usse temp mein le rahe hai and then usko null kar rahe hai gc kaam karega but mein alag se kar raha hu :
        Node temp = this.front;
        this.front = front.next;
        temp.next = null;
        if (this.front == null) {
            this.rear = null;
        }
        return temp.data;
    }

    // Checking that our list is empty or not
    public boolean iSEmpty() {
        if (this.front == null) {
            return true;
        }
        return false;
    }

    // Checking that our first or peek an element :
    public void peek() {
        System.out.println(front.data);
        return;
    }

    // Printing an queue :
    public void printQueue() {
        if (iSEmpty()) {
            System.out.println("Your list is empty.");
            return;
        }
        Node temp = this.front;
        for (; temp != null; temp = temp.next) {
            System.out.print(temp.data + "-->");
        }
        System.out.println("End");
    }
}

// Creating an node :
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


