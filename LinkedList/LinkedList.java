import java.util.*;
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
    public Node head; //cretion of head
    public Node tail;//cretion of tail
    
    
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
    //adding elememt at last of LinkedList
    public void addLast(int data){
        //step1 creating a newNode
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step 2-tail ka node newnode ko pint kare;
        tail.next=newNode;
        // step 3 making tail -> newNode
        tail=newNode;

    }

    // Adding elements at middle/nth postion in linkedlist
    public void addMiddle(int n,int data){
        // when you want to add element at first place/ call kr lo addFirst method
        if(n==1){
            addFirst(data);
            return;
        }
        // step 1 creating a newNode 
        Node newNode=new Node(data);
        Node temp=head;
        int i=1;
        while(i < n-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

// displaying element of LINKEDLIST
    public void Display(){
        Node temp=head;    // using a temp variable to store value of head;
        while(temp!=null){
            System.out.print(temp.data+"->");//printing temp data
            
            temp=temp.next;   /// taraversal// shifting temp to next node 
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String args[]){
        LinkedList obj=new LinkedList();   // object of linkedlist class
        Scanner sc=new Scanner (System.in);
        obj.addFirst(50);                //function calling
        obj.addFirst(40);               //function calling
        obj.addFirst(30);               //function calling
        obj.addFirst(20);               //function calling
        obj.addFirst(10);               //function calling
        obj.Display();
        obj.addLast(60);
        obj.addLast(70);
        System.out.print(" Enter postion where you want to insert ele:");
        int pos =sc.nextInt();
        System.out.print(" Enter element  you want to insert ele:");
        int ele =sc.nextInt();
        obj.addMiddle(pos, ele);
        obj.Display();
    }
}