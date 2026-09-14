import java.util.Queue;
import java.util.LinkedList;

public class QueueDSA {

    // ==================== 1. QUEUE IMPLEMENTATION ====================

    static class MyQueue {

        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;

        MyQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }


        // ==================== 2. ENQUEUE ====================

        void enqueue(int value) {

            if (size == capacity) {
                System.out.println("Queue Overflow");
                return;
            }

            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
        }


        // ==================== 3. DEQUEUE ====================

        int dequeue() {

            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int value = arr[front];

            front = (front + 1) % capacity;
            size--;

            return value;
        }


        // ==================== 4. PEEK ====================

        int peek() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }


        // ==================== 5. IS EMPTY ====================

        boolean isEmpty() {
            return size == 0;
        }


        // ==================== 6. SIZE ====================

        int size() {
            return size;
        }


        // ==================== 7. DISPLAY ====================

        void display() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = 0; i < size; i++) {
                System.out.print(
                    arr[(front + i) % capacity] + " "
                );
            }

            System.out.println();
        }
    }


    // ==================== 8. JAVA BUILT-IN QUEUE ====================

    static void javaQueue() {

        Queue<Integer> queue = new LinkedList<>();

        // Add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Peek
        System.out.println(queue.peek());

        // Remove
        System.out.println(queue.poll());

        // Check empty
        System.out.println(queue.isEmpty());

        // Size
        System.out.println(queue.size());

        // Print
        System.out.println(queue);
    }


    // ==================== 9. MAIN ====================

    public static void main(String[] args) {

        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        System.out.println("Size: " + queue.size());

        System.out.println("Empty: " + queue.isEmpty());

        javaQueue();
    }


    // ==================== IMPORTANT DSA PATTERNS ====================

    /*
        Queue
        │
        ├── Enqueue
        ├── Dequeue
        ├── Peek
        ├── IsEmpty
        ├── Size
        │
        ├── BFS
        ├── Level Order Traversal
        ├── Sliding Window
        └── Monotonic Queue
    */
}