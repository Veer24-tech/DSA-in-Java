//Queue using array---

public class QueArr {

    public static class Queue {

        public int arr[];
        int rear;
        int size;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        //isEmpty method----
        public boolean isEmpty() {
            return rear == -1;
        }

//add method
        public void add(int data) {
            if (rear == (size - 1)) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;

        }

//delete method
        public int Remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

// peek method
        public int peek() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.Remove();
        }
    }
}
