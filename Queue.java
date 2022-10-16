class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Queue {
    Node front;
    Node rear;

    boolean isEmpty() {
        if (front == null)
            return true;
        else
            return false;
    }

    public void enqueue(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int x = front.data;
            front = front.next;
            return x;
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int x = front.data;
            return x;
        }
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int x = rear.data;
            return x;
        }
    }

    public void print() {
        Node temp = front;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Queue s = new Queue();
        System.out.println(s.dequeue());
        s.enqueue(10);
        s.enqueue(20);
        System.out.println(s.dequeue());
        s.enqueue(30);
        System.out.println(s.front());
        s.enqueue(40);
        System.out.println("remaining element in queue");
        s.print();
    }
}