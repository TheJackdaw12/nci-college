public class DLL1 {
    Node head, tail;

    public static class Node {
        int val;
        Node next, prev;

        Node(int v) {
            val = v;
            next = null;
            prev = null;
        }
    }

    // Method to disaply the list
    public void display() {
        Node myNode = head;
        while (myNode != null) {
            System.out.print(myNode.val + "\n");
            myNode = myNode.next;
        }
        System.out.println();
    }
    
    public void displayBackwards() {
        Node myNode = tail; // Start from the tail
        while (myNode != null) {
            System.out.print(myNode.val + " ");
            myNode = myNode.prev; // Move backwards
        }
        System.out.println();
    }
    
    //1. Insert a new node at the Head
    public void insertHead(int newVal) {
        Node newNode = new Node(newVal);
        if (head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head= newNode;
        }    
    }   

//2. Insert a new node at the Tail
public void insertTail(int newVal) {
        Node newNode = new Node(newVal);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
 // 3. Insert a new node AFTER a given node
    public void insertAfter(Node prevNode, int newVal) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null!");
            return;
        }
        Node newNode = new Node(newVal);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        } else {
            tail = newNode; // Update tail if added at the end
        }
    }
    

    public static void main(String[] args) {
        DLL1 myList = new DLL1();

        // Adding nodes
        myList.insertHead(10);
        myList.insertHead(20);
        myList.insertHead(30);
        System.out.println("After inserting at head:");
        myList.display();

        myList.insertTail(40);
        myList.insertTail(50);
        System.out.println("After inserting at tail:");
        myList.display();

        // Inserting after a specific node
        myList.insertAfter(myList.head.next, 25); // Insert after the second node (20)
        System.out.println("After inserting 25 after 20:");
        myList.display();
        
        // Display list in reverse order
        System.out.println("Displaying the list backwards:");
        myList.displayBackwards();
    }
}