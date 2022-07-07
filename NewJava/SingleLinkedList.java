class Node{
    
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }

    public void insertNode(int data){

        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }
        else{
            Node current = this.head;
             while (current.next != null) {

                current = current.next;
                
             }
             current.next = newNode;
       }
    }

    public void printLinkedList(){
        Node current = this.head;

        while(current.next != null){
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println(current.data + "---->Null");
    }
    
}



public class SingleLinkedList {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.insertNode(5);
        l.insertNode(4);
        l.insertNode(3);
        l.insertNode(2);
        l.insertNode(1);
        l.printLinkedList();
        
    }
}
