//Queue creation using Array---->   fixed size(n) and O(1) complexity
public class QueArr{
    static class Queue{
       static int arr[];   
          static int size;
         static  int rear;
        //constructor of queue
        Queue(int n){
             arr=new int[n];
            size=n;
            rear=-1;     //  front to pata hi rahega hamsa ki 0th index hoga 
        }
        // isEmpty method
        public static boolean isEmpty(){
   return  rear==-1;
        
        }
        // addmethod-
        public static void add(int data){
            if(rear == size-1){
                System.out.print("Quee is full");
                return;
            }
            rear= rear+1;
            arr[rear]=data;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return-1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front ; // har bar front hi remove ho raha hoga to vahi 
        }
        //peek funcgtion
        public static int peek(){
              if(isEmpty()){
                System.out.print("Queue is Empty");
                return-1;
            }
            int peek=arr[0];
return peek;
        }
        
    }
    public static void main(String args[]){
Queue q =new Queue(5);
q.add(1);
q.add(2);
q.add(3);

 while(!q.isEmpty()){
        System.out.print(q.peek()+" ");
        q.remove();
    }
    }
   
}