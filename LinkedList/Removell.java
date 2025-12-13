public class Removell{
public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public static int size;
 public void addFirst(int data){
    //step1 creating a new node
    Node newNode =new Node(data);
    size++;
    // if Linked list is empty
    if(head==null){
        head=tail=newNode;
        return;
    }
    //step2 making newnode -> head
    newNode.next=head;
    head=newNode;
 }

 ///<<<<----- reomoving first element---->>>
 ////time complexity =O(1)
 public int removeFirst() {
    if (size == 0) {
        System.out.println("Linked list is Empty");
        return Integer.MIN_VALUE;    //return garbage value
    }

    int val = head.data; // store value to return

    if (size == 1) {
        head = tail = null; // list becomes empty
        size = 0;
        return val;
    }

    head = head.next; //making the second node as head
    size--; 
    return val;
}

    ///<<<<----- reomoving last element---->>>
    ////time complexity =O(n)
public void removeLast(){
    if(size==0){
        System.out.print("Linked List is Empty");
        return;

    }
    if(size==1){
        head=tail=null;
        size=0;
        return;
    }
    //finding second last node
    Node temp=head;
    for (int i=0;i<size-2;i++){
        temp=temp.next;
    }
    temp.next=null;
    tail=temp;
    size--;
}

 public void Display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
 }

 public static void main(String args[]){
    Removell obj=new Removell();
    obj.addFirst(30);
    obj.addFirst(20);
    obj.addFirst(10);
    obj.Display();
    System.out.println("\nsize of linked list is "+obj.size);
     obj.removeFirst();
      obj.Display();
      System.out.println("\nsize of linked list is "+obj.size);
      obj.removeLast();
      obj.Display();
      System.out.println("\nsize of linked list is "+obj.size);
     
 }

}