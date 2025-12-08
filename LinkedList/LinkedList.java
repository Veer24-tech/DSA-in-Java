public class LinkedList{
    public class Node{
        int data;
        Node next;    //object of NodeClass
        // creating a constructor:
        public Node(int data){
            this.data=data;
            this.next=null; // initiizing next as null /empty linked list:
         
        }
    }
    public Node head;
    public Node tail;
    
    
    // adding elements at satrting of Linkedlist:
    public void addFirst(int data){
        // step-1 creating a new node;
        Node newNode=new Node(data);
        //when LinkedList is Empty:--
        if(head==null){
            head=tail=newNode;
            return;
        }
         // step-2 linking the nodes--> nayi node ka next previous node ke head ko point krega//
        newNode.next=head;
        //step3-> head nayi add ki gyi node me lana// making newNode as head of linkedlist
        head=newNode;
    }
    public void Display(){
        Node temp=head;    // using a temp variable to store value of head;
        while(temp!=null){
            System.out.print(temp.data+"->");//printing temp data
            
            temp=temp.next;   /// taraversal// shifting temp to next node 
        }
        System.out.print("null");
    }
    
    public static void main(String args[]){
        LinkedList obj=new LinkedList();   // object of linkedlist class
        obj.addFirst(10);                //function calling
        obj.addFirst(20);               //function calling
        obj.addFirst(30);               //function calling
        obj.addFirst(40);               //function calling
        obj.addFirst(50);               //function calling
        obj.Display();
    }
}