class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList3 {
    Node1 head;
    Node1 tail;

    public void insertAtEnd(int data) {
        Node1 newNode1 = new Node1(data);
        if (head == null) {
            head = newNode1;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode1;

    }

    public void deleteFromPosition(int position) {
        if (position <= 0) {
            System.out.println("give -ve position.");
            return;
        } else if (head == null) {
            System.out.println("list is empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else if (position == 1) {
            head = head.next;
        } else {
            Node1 temp = head;
            int i = 1;
            while (i < position - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Give invald position.");
                return;
            }
            temp.next = temp.next.next;
        }
    }

    public void DeleteFromBeginning() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node1 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void traverseLinkedList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteByData(int data) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node1 temp = head, prevNode1=null;
        while (temp != null && temp.data != data) {
            prevNode1 = temp;
            temp = temp.next;
        }
        if (temp == null || temp.data != data) {
            System.out.println("Data is not deleted");
        } else {
            System.out.println("Deleted succesfully");
            prevNode1.next = temp.next;
        }

    }

    public static void main(String[] args) {

        // Deletion in singly linked list

        linkedList3 obj = new linkedList3();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.traverseLinkedList();
        // obj.deleteByData(50);
        // obj.deleteFromEnd();
        // obj.DeleteFromBeginning();
        // obj.deleteFromPosition(10);
        obj.traverseLinkedList();

    }
}

