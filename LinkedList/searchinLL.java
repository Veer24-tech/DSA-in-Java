public class searchinLL{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    public int LinearSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return-1;
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
            searchinLL obj=new searchinLL();
            obj.head=obj.new Node(10);
            obj.head.next=obj.new Node(20);
            obj.head.next.next=obj.new Node(30);
            obj.head.next.next.next=obj.new Node(40);
            obj.head.next.next.next.next=obj.new Node(50);
            obj.Display();
            int key=30;
            System.out.println("\nkey found at index: "+obj.LinearSearch(key));
        }
        
    }
