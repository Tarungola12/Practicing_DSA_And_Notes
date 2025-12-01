
 class Nodes {
    int data;
    Nodes next;
    

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList2 {
    Nodes head = null;
    Nodes tail = null;
    int size = 0;

    public void insertAtBeginning(int data) {
        Nodes newNode = new Nodes(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void traverseLinkedList() {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public void insertAtEnd(int data) {
        // When i have tail
        Nodes newNode = new Nodes(data);
        if (head == null) {
            insertAtBeginning(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;

        // when i have't tail then we fist we have to travel and then we have to insert
        // at end

        // if(head==null){
        // insertAtBeginning(data);
        // return ;
        // }
        // else{
        // Node temp = head;
        // while (temp.next != null){
        // temp = temp.next;
        // }
        // Node newNode = new Node(data);
        // temp.next=newNode;
        // size++;
        // }
    }

    public void insertAtSpecifiPosition(int position, int data) {

        if (head == null) {
            if (position == 1) {
                insertAtBeginning(data);
                return;
            }
            return;
        } else if (position > size || position <= 0) {
            System.out.println("Pls give correct positon..");
            return;
        } else if (position == 1) {
            Nodes newNode = new Nodes(data);
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Nodes temp;
        temp = head;
        int i = 1;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        // Node temp2 = temp.next;
        // Node newNode = new Node(data);
        // temp.next = newNode;
        // newNode.next = temp2;
        Nodes newNode = new Nodes(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void insertAtSpecifiData(int data,int dataToBeInserted) {
        if (head == null) {
            System.out.println("You list is empty");
            return;
        }
        Nodes temp;
        temp = head;
        while (temp.data != data) {
            temp = temp.next;
            if(temp.next==null){
                System.out.println("You data Entered is wrong pls Ented correct data.");
                return ;
            }
        }
        Nodes newNode = new Nodes(dataToBeInserted);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return ;
    }

    public static void main(String[] args) {
        // Operation on linked list And traversal of linked list
        linkedList2 obj = new linkedList2();
        // obj.insertAtBeginning(10);
        // obj.insertAtBeginning(20);
        // obj.insertAtBeginning(30);
        // obj.insertAtBeginning(40);
        // obj.insertAtBeginning(50);
        // obj.insertAtBeginning(60);
        // obj.insertAtEnd(20);
        // obj.insertAtEnd(30);
        // obj.insertAtEnd(40);
        // obj.insertAtEnd(50);
        obj.insertAtEnd(0);
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtEnd(3);
        obj.insertAtEnd(4);
        obj.insertAtEnd(5);
        obj.traverseLinkedList();
        // obj.insertAtSpecifiPosition(7, 7);
        obj.insertAtSpecifiData(41,8);
        obj.traverseLinkedList();

        System.err.println();

        // Now we will insert at end

    }
}
