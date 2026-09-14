import java.util.LinkedList;
public class LinkedListDSA {
    // ==================== 1. NODE ====================

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // ==================== 2. CREATE LINKED LIST ====================

    static Node createList() {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        return head;
    }


    // ==================== 3. TRAVERSAL ====================

    static void traverse(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }


    // ==================== 4. INSERT AT BEGINNING ====================

    static Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        return head;
    }


    // ==================== 5. INSERT AT END ====================

    static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

        return head;
    }


    // ==================== 6. DELETE FIRST ====================

    static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }

        head = head.next;

        return head;
    }


    // ==================== 7. DELETE BY VALUE ====================

    static Node deleteValue(Node head, int value) {

        if (head == null) {
            return null;
        }

        if (head.data == value) {
            return head.next;
        }

        Node curr = head;

        while (curr.next != null) {

            if (curr.next.data == value) {
                curr.next = curr.next.next;
                break;
            }

            curr = curr.next;
        }

        return head;
    }


    // ==================== 8. REVERSE ====================

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }


    // ==================== 9. JAVA BUILT-IN LINKEDLIST ====================

    static void javaLinkedList() {

        LinkedList<Integer> list = new LinkedList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at beginning
        list.addFirst(5);

        // Add at end
        list.addLast(40);

        // Get
        System.out.println(list.get(2));

        // Get first
        System.out.println(list.getFirst());

        // Get last
        System.out.println(list.getLast());

        // Set
        list.set(2, 100);

        // Remove by index
        list.remove(2);

        // Remove first
        list.removeFirst();

        // Remove last
        list.removeLast();

        // Check
        System.out.println(list.contains(20));

        // Size
        System.out.println(list.size());

        // Empty
        System.out.println(list.isEmpty());

        // Print
        System.out.println(list);

        // Clear
        list.clear();
    }

    public static void main(String[] args){

         Node head = createList();

        traverse(head);

        head = insertAtBeginning(head, 5);
        traverse(head);

        head = insertAtEnd(head, 50);
        traverse(head);

        head = deleteFirst(head);
        traverse(head);

        head = deleteValue(head, 30);
        traverse(head);

        head = reverse(head);
        traverse(head);

        javaLinkedList();




        //Important Patterns of problems on LinkeList
        /*
            Linked List
            │
            ├── 1. Node & pointers
            │
            ├── 2. Traversal
            │
            ├── 3. Insert / Delete
            │
            ├── 4. Reverse
            │
            ├── 5. Fast & Slow pointers
            │   ├── Middle
            │   ├── Cycle
            │   └── Cycle start
            │
            ├── 6. Dummy Node
            │   ├── Merge
            │   ├── Delete
            │   └── Insert
            │
            ├── 7. Two-pointer techniques
            │   ├── Nth from end
            │   └── Intersection
            │
            ├── 8. Reverse portions
            │   ├── Palindrome
            │   ├── Reorder
            │   └── Reverse K groups
            │
            └── 9. Advanced
                ├── Merge Sort
                ├── Random Pointer
                └── LRU Cache
        */
    }
}
