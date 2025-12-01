class Node7 {
    Node7 next;
    int data;

    public Node7(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList7 {
    Node7 head;
    Node7 tail;
    int size;

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("you list is empty.");
            return;
        }
        Node7 temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("End");
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            System.out.println("Your list is empty.");
            Node7 newNode = new Node7(data);
            head = newNode;
            head.next = head;
            tail = newNode;
            size++;
            return;
        }
        Node7 newNode = new Node7(data);
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
        size++;
        System.out.println("Inserted");
    }

    public void deleteFromBeginnning() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            size--;
            return;
        }
        // case 1 : if we have only head
        // Node7 temp = head;
        // while(temp.next != head){
        // temp = temp.next;
        // }
        // head=head.next;
        // temp.next = head;

        // case 2 : if only tail :

        tail.next = tail.next.next;
        head = head.next;
        System.out.println("successfully deleted");
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Your list is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }

        // case 1 : if tail is given or head anything we have to traverse :
        Node7 temp = head;

        do {
            temp = temp.next;
        } while (temp.next != tail);
        tail = temp;
        temp.next = head;
        System.out.println("succesfully deleted.");
    }

    public void deleteFromGivenPosition(int position) {
        if (position <= 0 || position > size) {
            System.out.println("Enter valid data.");
            return ;
        }
        if (head == null) {
            System.out.println("Your list is empyt.");
            return;
        }
        if (position == 1) {
            deleteFromBeginnning();
            return;
        }
        // if(position == size ){
        // deleteFromEnd();
        // return ;
        // }
        Node7 temp = head,prevNode=null;
        int i = 1;
        do {
            prevNode = temp;
            temp = temp.next;
            i++;
        } while (temp.next != head && i < position);
        if (temp.next == head && position > i) {
            System.out.println("Enter valid position");
            return;
        }
        if (temp.next == head && i == position ) {
            deleteFromEnd();
            return;
        }
        prevNode.next = temp.next;
        temp.next = null;
        temp = null;
        size--;
        System.out.println("Succesfully deleted.");


    }

    // public void deleteFrom
    public static void main(String[] args) {
        // deletion in Circular linkedList :
        linkedList7 obj = new linkedList7();
        obj.insertAtEnd(5);
        obj.insertAtEnd(10);
        obj.insertAtEnd(15);
        obj.insertAtEnd(20);
        obj.insertAtEnd(25);
        obj.insertAtEnd(30);
        obj.traverseLinkedList();
        // obj.deleteFromGivenPosition(6);
        // System.out.println(obj.tail.next.data);
        // obj.deleteFromEnd();
        // obj.deleteFromBeginnning();
        // obj.deleteFromBeginnning();
        obj.traverseLinkedList();
        // System.out.println(obj.tail.next.data);
        
    }
}
