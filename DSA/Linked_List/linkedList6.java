
// Circular linked list 
class Node6 {
    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList6 {
    Node6 head;
    Node6 tail;
    int size;

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        Node6 temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("End");
    }

    public void insertAtBeginning(int data) {
        if (head == null) {
            System.out.println("you list is empty");
            Node6 newNode = new Node6(data);
            head = newNode;
            tail = newNode;
            tail.next = head;
            newNode = null;
            size++;
            return;
        }

        // case 1 : if have both head and tail :

        // Node6 newNode = new Node6(data);
        // tail.next = newNode;
        // newNode.next = head;
        // head = newNode;
        // newNode = null;
        // size++;
        // System.out.println("Entered succesfully");

        // case 2 : if i have head only :

        // Node6 temp = head;
        // while (temp.next != head) {
        // temp = temp.next;
        // }
        // tail = temp;
        // Node6 newNode = new Node6(data);
        // temp.next = newNode;
        // newNode.next = head;
        // head = newNode;
        // size++;
        // newNode = null;

        // case 3 : if i have tail :
        Node6 newNode = new Node6(data);
        newNode.next = tail.next;
        head = newNode;
        tail.next = newNode;
        newNode = null;
        size++;
        System.out.println("Successfully inserted");

    }

    public void insertAtEnd(int data) {
        if (head == null) {
            System.out.println("you list is emmpty");
            Node6 newNode = new Node6(data);
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode = null;
            size++;
            return;
        }
        // case 1 : if i have both head and tail :

        // only tail operation is needed

        // Node6 newNode = new Node6(data);
        // newNode .next = tail.next;
        // tail.next = newNode;
        // tail = newNode;
        // newNode = null;
        // size++;

        // case 2 : if i have only head :

        Node6 temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        Node6 newNode = new Node6(data);
        temp.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
        newNode = null;

        // case 3 : if i have only tail
        // Node6 newNode = new Node6(data);
        // head = tail.next;
        // newNode.next = tail.next;
        // tail.next = newNode;
        // tail = newNode;
        // size++;
        // newNode = null;
    }

    // public void insertAtSpecificPosition(){

    // }

    public void insertBeforeGivenPosition(int position, int data) {
        if (position <= 0 || position - 1 > size) {
            System.out.println("Enter valid position.");
            return;
        }
        // if we dont have size then what to do for checking is taking while loop and
        // then use that to check if positon is not valid or not or directly insered and
        // add codition in whiile loop which is inserting value in the loop :
        if (head == null) {
            System.out.println("Your list is empty.");
            insertAtBeginning(data);
            return;
        }
        if (position == 1) {
            // System.out.println(tail.next.data);
            insertAtBeginning(data);
            return;
        }
        Node6 temp = head;
        int i = 1;
        while (temp != head && i < position - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == head && i < position - 1) {
            insertAtEnd(data);
            return;
        }
        if (temp == head) {
            System.out.println("Enter valid position.");
            return;
        }
        Node6 newNode = new Node6(data);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode = null;
        size++;

    }

    public void insertAfterAnGivenPosition(int position, int data) {
        if (position < 0 ){//|| position > size) {
            System.out.println("Enter valid position.");
            return;
        }
        // if we dont have size then what to do for checking is taking while loop and
        // then use that to check if positon is not valid or not or directly insered and
        // add codition in whiile loop which is inserting value in the loop :
        if (head == null) {
            System.out.println("Your list is empty.");
            insertAtBeginning(data);
            return;
        }
        if (position == 0) {
            // System.out.println(tail.next.data);
            insertAtBeginning(data);
            return;
        }
        Node6 temp = head;
        int i = 1;
        while (temp.next != head && i < position) {
            temp = temp.next;
            i++;
        }
        if(i<position && temp.next == head){
            System.out.println("Enter valid position...");
            return ;
        }
        if(temp.next == head){
            insertAtEnd(data);
            return;
        }  
        // if (temp.next == head && i == position -2) {
        //     insertAtEnd(data);
        //     return;
        // }
        // else if(temp.next == head && i < position){
        //     System.out.println("Enter valid position....");
        //     return ;
        // }
      
        Node6 newNode = new Node6(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        newNode = null;
        
    }

    public void insertAnGivenValue(int value,int data){
        if(head == null){
            System.out.println("you list is empty.");
            return ;
        }
        Node6 temp = head;
        while(temp.data != value && temp.next != head){
            temp = temp.next;
        }
        if(temp.data == value && temp.next == head){
            insertAtEnd(data);
            return ;
        }
        if(temp.data == value){
            Node6 newNode = new Node6(data);
            newNode.next = temp.next;
            temp.next = newNode;
            newNode = null;
            size++;
            return ;
        }
        if(temp.next == head){
            System.out.println("The value is not present.");
            return ;
        }
    }
    public static void main(String[] args) {

        // Introduction to circular singly linkedList :

        linkedList6 obj = new linkedList6();
        // obj.insertAtBeginning(2);
        // obj.insertAtBeginning(4);
        // obj.insertAtBeginning(6);
        // obj.insertAtBeginning(8);
        // obj.insertAtBeginning(10);
        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(6);
        obj.insertAtEnd(8);
        obj.insertAtEnd(10);
        obj.traverseLinkedList();
        // obj.insertAnGivenValue(8,5);
        // obj.traverseLinkedList();
        // System.out.println(obj.tail.next.data);
        // obj.insertBeforeGivenPosition(0, 0);
        // obj.insertBeforeGivenPosition(0,0);
        // System.out.println(obj.tail.next.data);
        // obj.insertAfterAnGivenPosition(5, 0);
        // obj.traverseLinkedList();
        // System.out.println(obj.tail.next.data);
        // System.out.println(obj.size);
    }
}
