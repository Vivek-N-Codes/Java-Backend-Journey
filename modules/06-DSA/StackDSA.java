import java.util.Stack;

public class StackDSA {

    // ==================== 1. STACK IMPLEMENTATION ====================

    static class MyStack {

        int[] arr;
        int top;
        int capacity;

        MyStack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        // ==================== 2. PUSH ====================

        void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            arr[++top] = value;
        }

        // ==================== 3. POP ====================

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return arr[top--];
        }

        // ==================== 4. PEEK ====================

        int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return arr[top];
        }

        // ==================== 5. IS EMPTY ====================

        boolean isEmpty() {
            return top == -1;
        }

        // ==================== 6. SIZE ====================

        int size() {
            return top + 1;
        }

        // ==================== 7. DISPLAY ====================

        void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }


    // ==================== 8. JAVA BUILT-IN STACK ====================

    static void javaStack() {

        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek
        System.out.println(stack.peek());

        // Pop
        System.out.println(stack.pop());

        // Check empty
        System.out.println(stack.isEmpty());

        // Size
        System.out.println(stack.size());

        // Search
        System.out.println(stack.search(10));

        // Print
        System.out.println(stack);
    }


    // ==================== 9. MAIN ====================

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        stack.display();

        System.out.println("Size: " + stack.size());

        System.out.println("Empty: " + stack.isEmpty());

        javaStack();
    }


    // ==================== IMPORTANT DSA PATTERNS ====================

    /*
        Stack
        │
        ├── Push
        ├── Pop
        ├── Peek
        ├── IsEmpty
        ├── Size
        │
        ├── Parentheses
        ├── Next Greater Element
        ├── Previous Greater Element
        ├── Next Smaller Element
        ├── Monotonic Stack
        └── Expression Problems
    */
}
