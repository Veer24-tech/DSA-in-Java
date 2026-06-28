
//circular queue using array---> Remove krne ki cpmplexoty ko O(1) me krne ke liye use kiya ---

public class CirQueue {

    public static class Queue {

        int arr[];
        int front;
        int rear;
        int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
// isempty method

        public boolean isEmpty() {
            return front == -1 && rear == -1;

        }

        //isFull method---
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add method
        public void add(int data) {
            if (isFull()) {
                System.out.print("Queue is full");
                return;
            }

            //agr queue me 1st element add kr rahe hai tab tak rear aur front -1 hai ------
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        //remove element---->>>
        public int Remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty");
                return -1;
            }
            int result = arr[front];

            // queue me se jab last element remove  krege tab---
            if (front == rear) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek method
        public int peek() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.Remove();
        q.add(1);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.Remove();
        }
    }
}
