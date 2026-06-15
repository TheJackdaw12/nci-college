// Node class for a SLL

class Node {
    String name;
    Node next;
    
    Node(String name) {
        this.name = name;
        this.next = null;       
    }
}

//Application Class
public class Week3Lab {
    public static void main(String[] args) {
        //Creating Nodes
        Node first = new Node("Alice");
        Node second = new Node ("Bob");
        Node third = new Node ("Charlie");
        Node fourth = new Node ("David");
        
        //Manually linking nodes (no head or tail)
        first.next = second;
        second.next = third;
        third.next = fourth;
        
        //Traversing and printing list
        System.out.println("Original List");
        traverseList(first);
        
        //Inserting "Eabha" in the middle (after Bob)
        insertAfter(second, "Eabha");
        System.out.println("\nAfter inserting 'Eabha' after 'Bob'");
        traverseList(first);
        
        //Removing Charlie
        first = remove(first, "Charlie");
        System.out.println("\nAfter removing 'Charlie'");
        traverseList(first);
    }
    
    //Method to traverse print list
    private static void traverseList(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.name + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    //Method to insert a node after another node
    private static void insertAfter(Node prevNode, String name) {
        if (prevNode == null) return;
        Node newNode = new Node(name);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    
    //Method to remove a node by value
    private static Node remove(Node start, String name) {
        if (start == null) return null;
        if (start.name.equals(name)) return start.next; //removes head
        
        Node temp = start;
        while (temp.next != null) {
            if (temp.next.name.equals(name)) {
                temp.next = temp.next.next;
                return start;
            }
            temp = temp.next;
        }
        return start;
    }
    
}