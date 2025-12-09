

public class RemoveLastLL {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;

    // addding elements in ll
    public void addFisrt(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.print("Linked list is Empty:");
            return Integer.MIN_VALUE;
        }
        Node pre = head;// creating a variable prev and initilizing it thrn loop it for size oflinkelist-2
        
        for(int i=0;i<size-2;i++){
            pre=pre.next;
        }
        int val=tail.data;
        pre.next=null;
        tail=pre;
        size--;
        return val;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        RemoveLastLL obj=new RemoveLastLL();
        obj.addFisrt(40);
        obj.addFisrt(30);
        obj.addFisrt(20);
        obj.addFisrt(10);
        obj.Display();
        System.out.print("Size of linkedlist :"+obj.size);
        System.out.println();
        obj.removeLast();
        obj.Display();
         System.out.print("Size of linkedlist :"+obj.size);

    }
}

