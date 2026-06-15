public class SLL1 {
    Node head;
    public static class Node{
        int val;
        Node next;
        Node (int v){val=v; next=null;}
    }
    public void display(){
        Node myNode = head;
        while(myNode!=null){
            System.out.print(myNode.val+"\n");
            myNode=myNode.next; 
        }
    }
    public static void main(String[] args){
        SLL1 myList = new SLL1();
        myList.head = new Node(1);
        Node mySecondNode = new Node(2);
        Node myThirdNode = new Node(3);
        Node myFourthNode = new Node(4);
        Node myFifthNode = new Node(5);
        myList.head.next = mySecondNode;
        mySecondNode.next = myThirdNode;
        myThirdNode.next = myFourthNode;
        myFourthNode.next = myFifthNode;
        myList.display();
        
        myList.insertHead(1000);
        System.out.println("\nAfter inserting the new value at the head position, my list is as follows:");
        myList.display();
        
        myList.insertTail(500);
        System.out.println("\nAfter inserting the new value at the tail position, my list is as follows:");
        myList.display();     
        
        myList.insertSpecificLocation(myFifthNode, 9000);
        System.out.println("\nAfter inserting new value after my given node:");
        myList.display();
        
        myList.deleteHead();
        System.out.println("\nAfter deleting the head node, my list is: ");
        myList.display();

        myList.deleteTail();
        System.out.println("\nAfter deleting the tail node: ");
        myList.display();
        
        myList.deleteTail();myList.deleteTail();myList.deleteTail();myList.deleteTail();myList.deleteTail();
        System.out.println("\n After deleting the tail node x 5: ");
        myList.display();
                
        myList.deleteTail();
        System.out.println("\n After deleting the final tail node: ");
        myList.display();
        
        myList.deleteTail();
        System.out.println("\n After deleting the final tail node, one last time showing the attempt to delete: ");
        myList.display();         
    }
    /* this will help insert a new node at the head */
    public void insertHead(int newVal){
        Node newNode = new Node(newVal);
        newNode.next = head; // we're linking the new node to the existing head
        head = newNode; //now we are saying that the newNode will be the head hereon;
    }
    public void insertTail(int newVal){
        Node newNode = new Node(newVal);
        if (head == null){  ////checking if head is NULL? if true only then...it enters this condition.
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void insertSpecificLocation(Node prevNode, int newVal){
        if(prevNode == null){
            System.out.println("Previous node must not be null");
            return;
        }
        Node newNode = new Node(newVal);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    } 
    public void deleteHead(){
        if(head==null){
            System.out.println("\nThe list is already empty!");
            return;
        }
        head=head.next; //moves the head to the next position, thereby losing the existing head!
    }
    public void deleteTail(){
        if(head==null){
            System.out.println("\nThe list is already empty!");
            return;
        }
        if (head.next==null){
            head = null;
            System.out.println("\nThe list is now empty!");
            return;
        }
        /* scenario where there is more than one node, we need to find the second last node */
        Node currentNode = head;
        while (currentNode.next.next !=null){ // we need to traverse the list to find the second last node
            currentNode =currentNode.next; 
        }
        currentNode.next =null; //removes the tail/last node
    }
}
